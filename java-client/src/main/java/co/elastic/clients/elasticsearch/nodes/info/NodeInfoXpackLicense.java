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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackLicense
@JsonpDeserializable
public final class NodeInfoXpackLicense implements JsonpSerializable {
	private final NodeInfoXpackLicenseType selfGenerated;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoXpackLicense(Builder builder) {

		this.selfGenerated = Objects.requireNonNull(builder.selfGenerated, "self_generated");

	}

	public NodeInfoXpackLicense(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code self_generated}
	 */
	public NodeInfoXpackLicenseType selfGenerated() {
		return this.selfGenerated;
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

		generator.writeKey("self_generated");
		this.selfGenerated.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackLicense}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackLicense> {
		private NodeInfoXpackLicenseType selfGenerated;

		/**
		 * Required - API name: {@code self_generated}
		 */
		public Builder selfGenerated(NodeInfoXpackLicenseType value) {
			this.selfGenerated = value;
			return this;
		}

		/**
		 * Required - API name: {@code self_generated}
		 */
		public Builder selfGenerated(
				Function<NodeInfoXpackLicenseType.Builder, ObjectBuilder<NodeInfoXpackLicenseType>> fn) {
			return this.selfGenerated(fn.apply(new NodeInfoXpackLicenseType.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfoXpackLicense}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackLicense build() {

			return new NodeInfoXpackLicense(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackLicense}
	 */
	public static final JsonpDeserializer<NodeInfoXpackLicense> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackLicense::setupNodeInfoXpackLicenseDeserializer, Builder::build);

	protected static void setupNodeInfoXpackLicenseDeserializer(
			DelegatingDeserializer<NodeInfoXpackLicense.Builder> op) {

		op.add(Builder::selfGenerated, NodeInfoXpackLicenseType._DESERIALIZER, "self_generated");

	}

}
