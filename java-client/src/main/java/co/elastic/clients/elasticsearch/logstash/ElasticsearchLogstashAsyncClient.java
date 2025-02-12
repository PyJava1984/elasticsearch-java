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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.logstash;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the logstash namespace.
 */
public class ElasticsearchLogstashAsyncClient extends ApiClient {

	public ElasticsearchLogstashAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: logstash.delete_pipeline

	/**
	 * Deletes Logstash Pipelines used by Central Management
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-delete-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deletePipeline(DeletePipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeletePipelineRequest.ENDPOINT);
	}

	/**
	 * Deletes Logstash Pipelines used by Central Management
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-delete-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> deletePipeline(
			Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn) throws IOException {
		return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: logstash.get_pipeline

	/**
	 * Retrieves Logstash Pipelines used by Central Management
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetPipelineRequest.ENDPOINT);
	}

	/**
	 * Retrieves Logstash Pipelines used by Central Management
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPipelineResponse> getPipeline(
			Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn) throws IOException {
		return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: logstash.put_pipeline

	/**
	 * Adds and updates Logstash Pipelines used for Central Management
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-put-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> putPipeline(PutPipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutPipelineRequest.ENDPOINT);
	}

	/**
	 * Adds and updates Logstash Pipelines used for Central Management
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-put-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> putPipeline(
			Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn) throws IOException {
		return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build());
	}

}
