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

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

public class RequestOptions2 {

    public static final RequestOptions2 DEFAULT = new RequestOptions2(

            // Default headers
            Arrays.asList(
                    ClientMetadata.forLocalSystem().toHeader(),
                    UserAgent.DEFAULT.toHeader()
            ),

            // Default parameters
            Collections.emptyMap(),

            // Timeout
            null,

            // Warning callback
            null

    );

    public static class Builder {

        private final Map<String, Header> headers;
        private final Map<String, String> parameters;
        private Duration timeout;
        private Consumer<List<String>> onWarning;

        public Builder() {
            this.headers = new TreeMap<>();
            this.parameters = new HashMap<>();
            this.timeout = null;
            this.onWarning = null;
        }

        public Builder withHeader(Header header) {
            headers.put(header.name(), header);
            return this;
        }

        public Builder withParameter(String name, String value) {
            parameters.put(name, value);
            return this;
        }

        public Builder withTimeout(Duration value) {
            timeout = value;
            return this;
        }

        public Builder withWarningHandler(Consumer<List<String>> callback) {
            onWarning = callback;
            return this;
        }

        public Iterable<Header> headers() {
            return headers.values();
        }

        public Map<String, String> parameters() {
            return parameters;
        }

        public Duration timeout() {
            return timeout;
        }

        public Consumer<List<String>> onWarning() {
            return onWarning;
        }

        public RequestOptions2 build() {
            return new RequestOptions2(headers(), parameters(), timeout(), onWarning());
        }

    }

    private final Map<String, Header> headers;
    private final Map<String, String> parameters;
    private final Duration timeout;
    private final Consumer<List<String>> onWarning;

    public RequestOptions2(Iterable<Header> headers, Map<String, String> parameters, Duration timeout, Consumer<List<String>> onWarning) {
        this.headers = new TreeMap<>(String::compareToIgnoreCase);
        headers.forEach(this::putHeader);
        this.parameters = Collections.unmodifiableMap(parameters);
        this.timeout = timeout;
        this.onWarning = onWarning;
    }

    void putHeader(Header header) {
        this.headers.put(header.name(), header);
    }

    public Iterable<Header> headers() {
        return headers.values();
    }

    public Map<String, String> parameters() {
        return parameters;
    }

    public Duration timeout() {
        return timeout;
    }

    public Consumer<List<String>> onWarning() {
        return onWarning;
    }

    public RequestOptions2 with(RequestOptions2 other) {
        RequestOptions2 options = new RequestOptions2(headers(), parameters(), timeout(), onWarning());
        if (other != null) {
            other.headers().forEach(header -> options.headers.put(header.name(), header));
        }
        return options;
    }

}
