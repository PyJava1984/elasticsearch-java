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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MatrixAggregation

public abstract class MatrixAggregation extends AggregationBase {
	@Nullable
	private final List<String> fields;

	@Nullable
	private final Map<String, Double> missing;

	// ---------------------------------------------------------------------------------------------

	public MatrixAggregation(AbstractBuilder<?> builder) {
		super(builder);

		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.missing = ModelTypeHelper.unmodifiable(builder.missing);

	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public Map<String, Double> missing() {
		return this.missing;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.missing != null) {

			generator.writeKey("missing");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.missing.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private List<String> fields;

		@Nullable
		private Map<String, Double> missing;

		/**
		 * API name: {@code fields}
		 */
		public BuilderT fields(@Nullable List<String> value) {
			this.fields = value;
			return self();
		}

		/**
		 * API name: {@code fields}
		 */
		public BuilderT fields(String... value) {
			this.fields = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public BuilderT addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return self();
		}

		/**
		 * API name: {@code missing}
		 */
		public BuilderT missing(@Nullable Map<String, Double> value) {
			this.missing = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #missing(Map)}, creating the map if needed.
		 */
		public BuilderT putMissing(String key, Double value) {
			if (this.missing == null) {
				this.missing = new HashMap<>();
			}
			this.missing.put(key, value);
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupMatrixAggregationDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		AggregationBase.setupAggregationBaseDeserializer(op);
		op.add(AbstractBuilder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"fields");
		op.add(AbstractBuilder::missing,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()), "missing");

	}

}
