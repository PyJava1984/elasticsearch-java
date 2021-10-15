/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.base.rest_client;

import co.elastic.clients.base.BooleanEndpoint;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.ElasticsearchCatRequest;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.Transport;
import co.elastic.clients.base.UserAgent;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.NdJsonpSerializable;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.elasticsearch.client.Cancellable;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.ResponseListener;
import org.elasticsearch.client.RestClient;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static java.util.Collections.singletonList;

public class RestClientTransport implements Transport {

    private static final List<RequestOption> DEFAULT_REQUEST_OPTIONS = singletonList(UserAgent.DEFAULT);

    private final RestClient restClient;
    private final JsonpMapper mapper;
    private final RequestOptions requestOptions;

    private static void applyRequestOptions(final RequestOptions.Builder builder, Iterable<RequestOption> options) {
        if (options != null) {
            options.forEach(option -> option.apply(builder));
        }
    }

    public RestClientTransport(RestClient restClient, JsonpMapper mapper, @Nullable Iterable<RequestOption> options) {
        this.restClient = restClient;
        this.mapper = mapper;
        final RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        applyRequestOptions(builder, DEFAULT_REQUEST_OPTIONS);
        applyRequestOptions(builder, options);
        this.requestOptions = builder.build();
    }

    public RestClientTransport(RestClient restClient, JsonpMapper mapper) {
        this(restClient, mapper, null);
    }

    /**
     * Creates a new {@link #RestClientTransport} with specific request options.
     */
    public RestClientTransport withRequestOptions(@Nullable Iterable<RequestOption> options) {
        return new RestClientTransport(this.restClient, this.mapper, options);
    }

    @Override
    public JsonpMapper jsonpMapper() {
        return mapper;
    }

    @Override
    public Map<String, Header> headers() {
        Map<String, Header> headers = new HashMap<>();
        requestOptions.getHeaders().forEach(header ->
                headers.put(header.getName(), header(header.getName(), header.getValue())));
        return headers;
    }

    @Override
    public void close() throws IOException {
        this.restClient.close();
    }

    public <RequestT, ResponseT, ErrorT> ResponseT performRequest(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint
    ) throws IOException {

        org.elasticsearch.client.Request clientReq = prepareLowLevelRequest(request, endpoint);
        org.elasticsearch.client.Response clientResp = restClient.performRequest(clientReq);
        return getHighLevelResponse(clientResp, endpoint);
    }

    public <RequestT, ResponseT, ErrorT> CompletableFuture<ResponseT> performRequestAsync(
        RequestT request,
        Endpoint<RequestT, ResponseT, ErrorT> endpoint
    ) {
        org.elasticsearch.client.Request clientReq = prepareLowLevelRequest(request, endpoint);

        RequestFuture<ResponseT> future = new RequestFuture<>();

        future.cancellable = restClient.performRequestAsync(clientReq, new ResponseListener() {
            @Override
            public void onSuccess(Response clientResp) {
                try {
                    ResponseT response = getHighLevelResponse(clientResp, endpoint);
                    future.complete(response);
                } catch (Exception e) {
                    future.completeExceptionally(e);
                }
            }

            @Override
            public void onFailure(Exception e) {
                future.completeExceptionally(e);
            }
        });

        return future;
    }

    private static class RequestFuture<T> extends CompletableFuture<T> {
        private volatile Cancellable cancellable;

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            boolean cancelled = super.cancel(mayInterruptIfRunning);
            if (cancelled && cancellable != null) {
                cancellable.cancel();
            }
            return cancelled;
        }
    }

    private <RequestT> org.elasticsearch.client.Request prepareLowLevelRequest(
        RequestT request,
        Endpoint<RequestT, ?, ?> endpoint) {
        String method = endpoint.method(request);
        String path = endpoint.requestUrl(request);
        Map<String, String> params = endpoint.queryParameters(request);

        org.elasticsearch.client.Request clientReq = new org.elasticsearch.client.Request(method, path);
        clientReq.addParameters(params);
        clientReq.setOptions(requestOptions);

        // Request-type specific parameters.
        if (request instanceof ElasticsearchCatRequest) {
            // Format responses as json (default is plain text)
            clientReq.addParameter("format", "json");
        }

        if (endpoint.hasRequestBody()) {
            // Request has a body and must implement JsonpSerializable or NdJsonpSerializable
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            if (request instanceof NdJsonpSerializable) {
                writeNdJson((NdJsonpSerializable) request, baos);
            } else {
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(request, generator);
                generator.close();
            }

            clientReq.setEntity(new ByteArrayEntity(baos.toByteArray(), ContentType.APPLICATION_JSON));
        }
        // Request parameter intercepted by LLRC
        clientReq.addParameter("ignore", "400,401,403,404,405");
        return clientReq;
    }

    /**
     * Write an nd-json value by serializing each of its items on a separate line, recursing if its items themselves implement
     * {@link NdJsonpSerializable} to flattening nested structures.
     */
    private void writeNdJson(NdJsonpSerializable value, ByteArrayOutputStream baos) {
        Iterator<?> values = value._serializables();
        while(values.hasNext()) {
            Object item = values.next();
            if (item instanceof NdJsonpSerializable && item != value) { // do not recurse on the item itself
                writeNdJson((NdJsonpSerializable) item, baos);
            } else {
                JsonGenerator generator = mapper.jsonProvider().createGenerator(baos);
                mapper.serialize(item, generator);
                generator.close();
                baos.write('\n');
            }
        }
    }

    private <ResponseT, ErrorT> ResponseT getHighLevelResponse(
        org.elasticsearch.client.Response clientResp,
        Endpoint<?, ResponseT, ErrorT> endpoint
    ) throws IOException {

        int statusCode = clientResp.getStatusLine().getStatusCode();

        if (endpoint.isError(statusCode)) {
            // API error
            ErrorT error = null;
            JsonpDeserializer<ErrorT> errorParser = endpoint.errorParser(statusCode);
            if (errorParser != null) {
                // Expecting a body
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                clientResp.getEntity().writeTo(baos);
                JsonParser parser = mapper.jsonProvider().createParser(new ByteArrayInputStream(baos.toByteArray()));
                error = errorParser.deserialize(parser, mapper);
            }

            // TODO: have the endpoint provide the exception contructor
            throw new ElasticsearchException((ErrorResponse) error);

        } else if (endpoint instanceof BooleanEndpoint) {
            BooleanEndpoint<?> bep = (BooleanEndpoint<?>)endpoint;

            @SuppressWarnings("unchecked")
            ResponseT response = (ResponseT)new BooleanResponse(bep.getResult(statusCode));

            return response;

        } else {
            // Successful response
            ResponseT response = null;
            JsonpDeserializer<ResponseT> responseParser = endpoint.responseParser();
            if (responseParser != null) {
                // Expecting a body
                InputStream content = clientResp.getEntity().getContent();
                JsonParser parser = mapper.jsonProvider().createParser(content);
                response = responseParser.deserialize(parser, mapper);
            }
            return response;
        }
    }
}
