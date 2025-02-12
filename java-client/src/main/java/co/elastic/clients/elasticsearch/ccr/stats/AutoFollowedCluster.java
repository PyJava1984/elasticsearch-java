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

package co.elastic.clients.elasticsearch.ccr.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.AutoFollowedCluster
@JsonpDeserializable
public final class AutoFollowedCluster implements JsonpSerializable {
	private final String clusterName;

	private final long lastSeenMetadataVersion;

	private final String timeSinceLastCheckMillis;

	// ---------------------------------------------------------------------------------------------

	public AutoFollowedCluster(Builder builder) {

		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.lastSeenMetadataVersion = Objects.requireNonNull(builder.lastSeenMetadataVersion,
				"last_seen_metadata_version");
		this.timeSinceLastCheckMillis = Objects.requireNonNull(builder.timeSinceLastCheckMillis,
				"time_since_last_check_millis");

	}

	public AutoFollowedCluster(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - API name: {@code last_seen_metadata_version}
	 */
	public long lastSeenMetadataVersion() {
		return this.lastSeenMetadataVersion;
	}

	/**
	 * Required - API name: {@code time_since_last_check_millis}
	 */
	public String timeSinceLastCheckMillis() {
		return this.timeSinceLastCheckMillis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("last_seen_metadata_version");
		generator.write(this.lastSeenMetadataVersion);

		generator.writeKey("time_since_last_check_millis");
		generator.write(this.timeSinceLastCheckMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowedCluster}.
	 */
	public static class Builder implements ObjectBuilder<AutoFollowedCluster> {
		private String clusterName;

		private Long lastSeenMetadataVersion;

		private String timeSinceLastCheckMillis;

		/**
		 * Required - API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * Required - API name: {@code last_seen_metadata_version}
		 */
		public Builder lastSeenMetadataVersion(long value) {
			this.lastSeenMetadataVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_since_last_check_millis}
		 */
		public Builder timeSinceLastCheckMillis(String value) {
			this.timeSinceLastCheckMillis = value;
			return this;
		}

		/**
		 * Builds a {@link AutoFollowedCluster}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowedCluster build() {

			return new AutoFollowedCluster(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowedCluster}
	 */
	public static final JsonpDeserializer<AutoFollowedCluster> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoFollowedCluster::setupAutoFollowedClusterDeserializer, Builder::build);

	protected static void setupAutoFollowedClusterDeserializer(DelegatingDeserializer<AutoFollowedCluster.Builder> op) {

		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::lastSeenMetadataVersion, JsonpDeserializer.longDeserializer(), "last_seen_metadata_version");
		op.add(Builder::timeSinceLastCheckMillis, JsonpDeserializer.stringDeserializer(),
				"time_since_last_check_millis");

	}

}
