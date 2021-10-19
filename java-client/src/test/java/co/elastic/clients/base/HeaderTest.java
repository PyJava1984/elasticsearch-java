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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class HeaderTest {

    @Test
    public void testUserAgentHeader() {
        Header header = new UserAgent("MegaClient", "1.2.3").toHeader();
        assertEquals("User-Agent", header.name());
        assertEquals("MegaClient/1.2.3", header.value());
    }

    @Test
    public void testClientMetadataHeader() {
        ClientMetadata metadata = ClientMetadata.forLocalSystem();
        Header header = metadata.toHeader();
        assertEquals("X-Elastic-Client-Meta", header.name());
        assertEquals(metadata.toString(), header.value());
    }

    @Test
    public void testClientMetadataHeaderDisabled() {
        ClientMetadata metadata = ClientMetadata.disabled();
        Header header = metadata.toHeader();
        assertEquals("X-Elastic-Client-Meta", header.name());
        assertNull(header.value());
    }

    @Test
    public void testSimpleRawHeader() {
        Header header = Header.raw("Content-Type", "application/json");
        assertEquals("Content-Type", header.name());
        assertEquals("application/json", header.value());
    }

    @Test
    public void testEmptyRawHeader() {
        Header header = Header.raw("Content-Length", null);
        assertEquals("Content-Length", header.name());
        assertNull(header.value());
    }

}
