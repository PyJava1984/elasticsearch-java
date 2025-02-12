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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.IndexRoutingAllocationInitialRecovery
@JsonpDeserializable
public final class IndexRoutingAllocationInitialRecovery implements JsonpSerializable {
	@Nullable
	private final String id;

	// ---------------------------------------------------------------------------------------------

	public IndexRoutingAllocationInitialRecovery(Builder builder) {

		this.id = builder.id;

	}

	public IndexRoutingAllocationInitialRecovery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public String id() {
		return this.id;
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

		if (this.id != null) {

			generator.writeKey("_id");
			generator.write(this.id);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexRoutingAllocationInitialRecovery}.
	 */
	public static class Builder implements ObjectBuilder<IndexRoutingAllocationInitialRecovery> {
		@Nullable
		private String id;

		/**
		 * API name: {@code _id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link IndexRoutingAllocationInitialRecovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexRoutingAllocationInitialRecovery build() {

			return new IndexRoutingAllocationInitialRecovery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexRoutingAllocationInitialRecovery}
	 */
	public static final JsonpDeserializer<IndexRoutingAllocationInitialRecovery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					IndexRoutingAllocationInitialRecovery::setupIndexRoutingAllocationInitialRecoveryDeserializer,
					Builder::build);

	protected static void setupIndexRoutingAllocationInitialRecoveryDeserializer(
			DelegatingDeserializer<IndexRoutingAllocationInitialRecovery.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");

	}

}
