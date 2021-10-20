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

package co.elastic.clients.base;

import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RequestOptionsTest {

    @Test
    public void testDefaultHeadersContainsClientMetadata() {
        RequestOptions options = RequestOptions.DEFAULT;
        List<Header> clientMetadataHeaders = options.headers().stream().filter(header ->
                header.name().equalsIgnoreCase("X-Elastic-Client-Meta")).collect(Collectors.toList());
        assertEquals(1, clientMetadataHeaders.size());
        Header clientMetadataHeader = clientMetadataHeaders.get(0);
        String clientMetadataHeaderValue = clientMetadataHeader.value();
        assertTrue(clientMetadataHeaderValue.contains("es="));
        assertTrue(clientMetadataHeaderValue.contains("jv="));
        assertTrue(clientMetadataHeaderValue.contains("t="));
    }

    @Test
    public void testCanDisableClientMetadata() {
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
                .withHeader(ClientMetadata.disabled().toHeader())
                .build();
        List<Header> clientMetadataHeaders = options.headers().stream().filter(header ->
                header.name().equalsIgnoreCase("X-Elastic-Client-Meta")).collect(Collectors.toList());
        assertEquals(0, clientMetadataHeaders.size());
    }

    @Test
    public void testDisabledClientMetadataIsPropagatedThroughBuilder() {
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
                .withHeader(ClientMetadata.disabled().toHeader())
                .build();
        List<Header> clientMetadataHeaders = options.toBuilder().headers().stream().filter(header ->
                header.name().equalsIgnoreCase("X-Elastic-Client-Meta")).collect(Collectors.toList());
        assertTrue(clientMetadataHeaders.contains(Header.raw("X-Elastic-Client-Meta", null)));
    }

    @Test
    public void testCanReEnableClientMetadata() {
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
                .withHeader(ClientMetadata.disabled().toHeader())
                .withHeader(ClientMetadata.forLocalSystem().toHeader())
                .build();
        List<Header> clientMetadataHeaders = options.headers().stream().filter(header ->
                header.name().equalsIgnoreCase("X-Elastic-Client-Meta")).collect(Collectors.toList());
        assertEquals(1, clientMetadataHeaders.size());
    }

    @Test
    public void testDefaultHeadersContainsUserAgent() {
        RequestOptions options = RequestOptions.DEFAULT;
        Collection<Header> headers = options.headers();
        assertTrue(headers.contains(Header.raw("User-Agent", UserAgent.DEFAULT)));
    }

    @Test
    public void testCustomUserAgent() {
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
                .withHeader(new UserAgent("MegaClient", "1.2.3").toHeader())
                .build();
        Collection<Header> headers = options.headers();
        assertTrue(headers.contains(Header.raw("User-Agent", "MegaClient/1.2.3")));
    }

    @Test
    public void testCustomHeader() {
        Header customHeader = Header.raw("X-Files", "Mulder, Scully");
        RequestOptions options = RequestOptions.DEFAULT.toBuilder()
                .withHeader(customHeader)
                .build();
        Collection<Header> headers = options.headers();
        assertTrue(headers.contains(customHeader));
    }

}
