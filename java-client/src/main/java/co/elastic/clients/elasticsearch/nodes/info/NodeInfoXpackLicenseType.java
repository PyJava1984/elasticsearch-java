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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoXpackLicenseType
@JsonpDeserializable
public final class NodeInfoXpackLicenseType implements JsonpSerializable {
	private final String type;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoXpackLicenseType(Builder builder) {

		this.type = Objects.requireNonNull(builder.type, "type");

	}

	public NodeInfoXpackLicenseType(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code type}
	 */
	public String type() {
		return this.type;
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

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoXpackLicenseType}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoXpackLicenseType> {
		private String type;

		/**
		 * Required - API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoXpackLicenseType}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoXpackLicenseType build() {

			return new NodeInfoXpackLicenseType(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoXpackLicenseType}
	 */
	public static final JsonpDeserializer<NodeInfoXpackLicenseType> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoXpackLicenseType::setupNodeInfoXpackLicenseTypeDeserializer, Builder::build);

	protected static void setupNodeInfoXpackLicenseTypeDeserializer(
			DelegatingDeserializer<NodeInfoXpackLicenseType.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
