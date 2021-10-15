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

import org.elasticsearch.client.RequestOptions;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * HTTP header field, consisting of a string key ('field') plus one
 * or more values. This implements the {@link RequestOption} interface,
 * allowing it to be applied to a low-level request as required.
 */
public class Header implements RequestOption {

    public static Header header(String field, String... values) {
        return new Header(field, values);
    }

    static final String VALUE_DELIMITER = ", ";

    private final String field;
    private final List<String> values;

    Header(String field, String... values) {
        this.field = field;
        this.values = asList(values);
    }

    public String field() {
        return field;
    }

    public String value() {
        if (values == null || values.isEmpty()) {
            return null;
        } else if (values.size() == 1) {
            return values.get(0);
        } else {
            return String.join(VALUE_DELIMITER, values);
        }
    }

    public List<String> values() {
        return values;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Header)) return false;
        Header header = (Header) other;
        return field.equalsIgnoreCase(header.field()) && Objects.equals(values(), header.values());
    }

    @Override
    public int hashCode() {
        return Objects.hash(field(), values());
    }

    public String toString() {
        return String.format("%s: %s", field(), value());
    }

    @Override
    public void apply(RequestOptions.Builder builder) {
        builder.addHeader(field(), value());
    }

}
