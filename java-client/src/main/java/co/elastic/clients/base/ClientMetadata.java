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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * e.g. es=7.10.0,py=3.10.0p,t=7.10.0,ur=1.25.10,h=b
 */
public class ClientMetadata {

    private final Version elasticsearchVersion;
    private final Version javaVersion;
    private final Version transportVersion;

    public ClientMetadata() {
        Version esVersion;
        try {
            esVersion = ElasticsearchVersion.load();
        } catch (ElasticsearchVersion.Unavailable ex) {
            // If the version is not available, skip adding
            // the "es" segment to the metadata string.
            esVersion = null;
        }
        this.elasticsearchVersion = esVersion;
        this.javaVersion = JavaVersion.load();
        this.transportVersion = esVersion;
    }

    public Version elasticsearchVersion() {
        return elasticsearchVersion;
    }

    public Version javaVersion() {
        return javaVersion;
    }

    public Version transportVersion() {
        return transportVersion;
    }

    @Override
    public String toString() {
        List<String> bits = new ArrayList<>();
        if (elasticsearchVersion != null) {
            bits.add("es=" + elasticsearchVersion);
        }
        if (javaVersion != null) {
            bits.add("jv=" + javaVersion);
        }
        if (transportVersion != null) {
            bits.add("t=" + transportVersion);
        }
        return String.join(",", bits);
    }

    public static class Header extends co.elastic.clients.base.Header {

        public Header(ClientMetadata clientMetadata) {
            super("X-Elastic-Client-Meta", clientMetadata.toString());
        }

    }

}
