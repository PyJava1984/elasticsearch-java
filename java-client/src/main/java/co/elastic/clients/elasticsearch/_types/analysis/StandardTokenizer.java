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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.analysis.StandardTokenizer
@JsonpDeserializable
public final class StandardTokenizer extends TokenizerBase implements TokenizerVariant {
	private final int maxTokenLength;

	// ---------------------------------------------------------------------------------------------

	public StandardTokenizer(Builder builder) {
		super(builder);

		this.maxTokenLength = Objects.requireNonNull(builder.maxTokenLength, "max_token_length");

	}

	public StandardTokenizer(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Tokenizer} variant type
	 */
	@Override
	public String _variantType() {
		return "standard";
	}

	/**
	 * Required - API name: {@code max_token_length}
	 */
	public int maxTokenLength() {
		return this.maxTokenLength;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "standard");
		super.serializeInternal(generator, mapper);

		generator.writeKey("max_token_length");
		generator.write(this.maxTokenLength);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StandardTokenizer}.
	 */
	public static class Builder extends TokenizerBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StandardTokenizer> {
		private Integer maxTokenLength;

		/**
		 * Required - API name: {@code max_token_length}
		 */
		public Builder maxTokenLength(int value) {
			this.maxTokenLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StandardTokenizer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StandardTokenizer build() {

			return new StandardTokenizer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StandardTokenizer}
	 */
	public static final JsonpDeserializer<StandardTokenizer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StandardTokenizer::setupStandardTokenizerDeserializer, Builder::build);

	protected static void setupStandardTokenizerDeserializer(DelegatingDeserializer<StandardTokenizer.Builder> op) {
		TokenizerBase.setupTokenizerBaseDeserializer(op);
		op.add(Builder::maxTokenLength, JsonpDeserializer.integerDeserializer(), "max_token_length");

		op.ignore("type");
	}

}
