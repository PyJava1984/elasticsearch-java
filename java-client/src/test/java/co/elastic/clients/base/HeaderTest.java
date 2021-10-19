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

import static co.elastic.clients.base.Header.header;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class HeaderTest {

    @Test
    public void testSimpleCustomHeader() {
        Header header = header("Content-Type", "application/json");
        assertEquals("Content-Type", header.name());
        assertEquals("application/json", header.value());
    }

    @Test
    public void testEmptyCustomHeader() {
        Header header = header("Content-Length", null);
        assertEquals("Content-Length", header.name());
        assertNull(header.value());
    }

    @Test
    public void testUserAgentHeader() {
        Header header = new UserAgent.Header(UserAgent.DEFAULT);
        assertEquals("X-Elastic-Client-Metadata", header.name());
        assertEquals(UserAgent.DEFAULT.toString(), header.value());
    }

    @Test
    public void testClientMetadataHeader() {
        ClientMetadata metadata = new ClientMetadata();
        Header header = new ClientMetadata.Header(metadata);
        assertEquals("X-Elastic-Client-Metadata", header.name());
        assertEquals(metadata.toString(), header.value());
    }

}
