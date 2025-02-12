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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.IcuAnalyzer
@JsonpDeserializable
public final class IcuAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final IcuNormalizationType method;

	private final IcuNormalizationMode mode;

	// ---------------------------------------------------------------------------------------------

	public IcuAnalyzer(Builder builder) {

		this.method = Objects.requireNonNull(builder.method, "method");
		this.mode = Objects.requireNonNull(builder.mode, "mode");

	}

	public IcuAnalyzer(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Analyzer} variant type
	 */
	@Override
	public String _variantType() {
		return "icu_analyzer";
	}

	/**
	 * Required - API name: {@code method}
	 */
	public IcuNormalizationType method() {
		return this.method;
	}

	/**
	 * Required - API name: {@code mode}
	 */
	public IcuNormalizationMode mode() {
		return this.mode;
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

		generator.write("type", "icu_analyzer");

		generator.writeKey("method");
		this.method.serialize(generator, mapper);

		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IcuAnalyzer}.
	 */
	public static class Builder implements ObjectBuilder<IcuAnalyzer> {
		private IcuNormalizationType method;

		private IcuNormalizationMode mode;

		/**
		 * Required - API name: {@code method}
		 */
		public Builder method(IcuNormalizationType value) {
			this.method = value;
			return this;
		}

		/**
		 * Required - API name: {@code mode}
		 */
		public Builder mode(IcuNormalizationMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * Builds a {@link IcuAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IcuAnalyzer build() {

			return new IcuAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IcuAnalyzer}
	 */
	public static final JsonpDeserializer<IcuAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IcuAnalyzer::setupIcuAnalyzerDeserializer, Builder::build);

	protected static void setupIcuAnalyzerDeserializer(DelegatingDeserializer<IcuAnalyzer.Builder> op) {

		op.add(Builder::method, IcuNormalizationType._DESERIALIZER, "method");
		op.add(Builder::mode, IcuNormalizationMode._DESERIALIZER, "mode");

		op.ignore("type");
	}

}
