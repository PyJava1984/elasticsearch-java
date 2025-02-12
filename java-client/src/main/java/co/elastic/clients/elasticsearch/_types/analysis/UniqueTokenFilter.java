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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.UniqueTokenFilter
@JsonpDeserializable
public final class UniqueTokenFilter extends TokenFilterBase implements TokenFilterVariant {
	private final boolean onlyOnSamePosition;

	// ---------------------------------------------------------------------------------------------

	public UniqueTokenFilter(Builder builder) {
		super(builder);

		this.onlyOnSamePosition = Objects.requireNonNull(builder.onlyOnSamePosition, "only_on_same_position");

	}

	public UniqueTokenFilter(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link TokenFilter} variant type
	 */
	@Override
	public String _variantType() {
		return "unique";
	}

	/**
	 * Required - API name: {@code only_on_same_position}
	 */
	public boolean onlyOnSamePosition() {
		return this.onlyOnSamePosition;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "unique");
		super.serializeInternal(generator, mapper);

		generator.writeKey("only_on_same_position");
		generator.write(this.onlyOnSamePosition);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UniqueTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UniqueTokenFilter> {
		private Boolean onlyOnSamePosition;

		/**
		 * Required - API name: {@code only_on_same_position}
		 */
		public Builder onlyOnSamePosition(boolean value) {
			this.onlyOnSamePosition = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UniqueTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UniqueTokenFilter build() {

			return new UniqueTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UniqueTokenFilter}
	 */
	public static final JsonpDeserializer<UniqueTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UniqueTokenFilter::setupUniqueTokenFilterDeserializer, Builder::build);

	protected static void setupUniqueTokenFilterDeserializer(DelegatingDeserializer<UniqueTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::onlyOnSamePosition, JsonpDeserializer.booleanDeserializer(), "only_on_same_position");

		op.ignore("type");
	}

}
