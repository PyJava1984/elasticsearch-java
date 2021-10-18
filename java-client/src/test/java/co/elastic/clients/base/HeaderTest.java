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

import co.elastic.clients.options.Header;
import org.junit.Test;

import static co.elastic.clients.options.Header.header;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class HeaderTest {

    @Test
    public void testSimple() {
        Header header = header("Content-Type", "application/json");
        assertEquals("Content-Type", header.field());
        assertEquals("application/json", header.value());
    }

    @Test
    public void testMulti() {
        Header header = header("Cache-Control", "no-cache", "no-store");
        assertEquals("Cache-Control", header.field());
        assertEquals("no-cache, no-store", header.value());
    }

    @Test
    public void testEmpty() {
        Header header = header("Content-Length");
        assertEquals("Content-Length", header.field());
        assertNull(header.value());
    }

}
