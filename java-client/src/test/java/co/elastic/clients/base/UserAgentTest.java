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

import co.elastic.clients.base.rest_client.RestClientTransport;
import co.elastic.clients.options.RequestOption;
import co.elastic.clients.options.UserAgent;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class UserAgentTest {

    public static RestClient restClient;

    @BeforeClass
    public static void setUp() {
        restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
    }

    @AfterClass
    public static void tearDown() throws IOException {
        restClient.close();
    }

    @Test
    public void testDefaultUserAgent() {
        Transport transport = new RestClientTransport(restClient, null);
        assertEquals(UserAgent.DEFAULT, transport.headers().get("User-Agent"));
    }

    @Test
    public void testManualUserAgent() {
        final String name = "ÜberClient";
        final String version = "1.0.13";
        final UserAgent userAgent = new UserAgent(name, version);
        List<RequestOption> options = singletonList(new UserAgent(name, version));
        Transport transport = new RestClientTransport(restClient, null, options);
        assertEquals(userAgent, transport.headers().get("User-Agent"));
    }

}
