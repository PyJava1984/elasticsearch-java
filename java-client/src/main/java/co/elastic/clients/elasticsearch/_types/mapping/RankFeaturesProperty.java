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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.mapping.RankFeaturesProperty
@JsonpDeserializable
public final class RankFeaturesProperty extends PropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	public RankFeaturesProperty(Builder builder) {
		super(builder);

	}

	public RankFeaturesProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "rank_features";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "rank_features");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankFeaturesProperty}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankFeaturesProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankFeaturesProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankFeaturesProperty build() {

			return new RankFeaturesProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankFeaturesProperty}
	 */
	public static final JsonpDeserializer<RankFeaturesProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankFeaturesProperty::setupRankFeaturesPropertyDeserializer, Builder::build);

	protected static void setupRankFeaturesPropertyDeserializer(
			DelegatingDeserializer<RankFeaturesProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);

		op.ignore("type");
	}

}
