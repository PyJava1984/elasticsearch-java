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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.FrozenIndices
@JsonpDeserializable
public final class FrozenIndices extends Base {
	private final long indicesCount;

	// ---------------------------------------------------------------------------------------------

	public FrozenIndices(Builder builder) {
		super(builder);

		this.indicesCount = Objects.requireNonNull(builder.indicesCount, "indices_count");

	}

	public FrozenIndices(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code indices_count}
	 */
	public long indicesCount() {
		return this.indicesCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("indices_count");
		generator.write(this.indicesCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FrozenIndices}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<FrozenIndices> {
		private Long indicesCount;

		/**
		 * Required - API name: {@code indices_count}
		 */
		public Builder indicesCount(long value) {
			this.indicesCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FrozenIndices}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FrozenIndices build() {

			return new FrozenIndices(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FrozenIndices}
	 */
	public static final JsonpDeserializer<FrozenIndices> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FrozenIndices::setupFrozenIndicesDeserializer, Builder::build);

	protected static void setupFrozenIndicesDeserializer(DelegatingDeserializer<FrozenIndices.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::indicesCount, JsonpDeserializer.longDeserializer(), "indices_count");

	}

}
