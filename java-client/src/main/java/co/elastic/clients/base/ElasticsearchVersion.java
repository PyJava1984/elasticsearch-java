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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ElasticsearchVersion extends Version {

    public static final String VERSION_PROPERTIES = "/co.elastic.clients.elasticsearch/version.properties";

    public static String loadString() throws Unavailable {
        InputStream in = ApiClient.class.getResourceAsStream(VERSION_PROPERTIES);
        if (in == null) {
            throw new Unavailable("Failed to locate version.properties file");
        }
        Properties properties = new Properties();
        try {
            properties.load(in);
            String version = properties.getProperty("version");
            if (version == null) {
                throw new Unavailable("No version information found in version.properties file");
            }
            else {
                return version;
            }
        } catch (IOException e) {
            throw new Unavailable("Failed to read version.properties file");
        }
    }

    public static Version load() throws Unavailable {
        return parse(loadString());
    }

    public ElasticsearchVersion(int major, int minor, int maintenance, boolean isPreRelease) {
        super(major, minor, maintenance, isPreRelease);
    }

    public static class Unavailable extends Exception {

        public Unavailable(String message) {
            super(message);
        }

    }

}
