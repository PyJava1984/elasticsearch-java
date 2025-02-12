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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.ConstantKeywordProperty
@JsonpDeserializable
public final class ConstantKeywordProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	public ConstantKeywordProperty(Builder builder) {
		super(builder);

		this.value = builder.value;

	}

	public ConstantKeywordProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "constant_keyword";
	}

	/**
	 * API name: {@code value}
	 */
	@Nullable
	public JsonData value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "constant_keyword");
		super.serializeInternal(generator, mapper);
		if (this.value != null) {

			generator.writeKey("value");
			this.value.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConstantKeywordProperty}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ConstantKeywordProperty> {
		@Nullable
		private JsonData value;

		/**
		 * API name: {@code value}
		 */
		public Builder value(@Nullable JsonData value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConstantKeywordProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConstantKeywordProperty build() {

			return new ConstantKeywordProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConstantKeywordProperty}
	 */
	public static final JsonpDeserializer<ConstantKeywordProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConstantKeywordProperty::setupConstantKeywordPropertyDeserializer, Builder::build);

	protected static void setupConstantKeywordPropertyDeserializer(
			DelegatingDeserializer<ConstantKeywordProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

		op.ignore("type");
	}

}
