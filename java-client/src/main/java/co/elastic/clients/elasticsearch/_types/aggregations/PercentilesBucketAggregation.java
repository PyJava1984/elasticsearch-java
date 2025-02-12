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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.PercentilesBucketAggregation
@JsonpDeserializable
public final class PercentilesBucketAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final List<Double> percents;

	// ---------------------------------------------------------------------------------------------

	public PercentilesBucketAggregation(Builder builder) {
		super(builder);

		this.percents = ModelTypeHelper.unmodifiable(builder.percents);

	}

	public PercentilesBucketAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "percentiles_bucket";
	}

	/**
	 * API name: {@code percents}
	 */
	@Nullable
	public List<Double> percents() {
		return this.percents;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.percents != null) {

			generator.writeKey("percents");
			generator.writeStartArray();
			for (Double item0 : this.percents) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PercentilesBucketAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PercentilesBucketAggregation> {
		@Nullable
		private List<Double> percents;

		/**
		 * API name: {@code percents}
		 */
		public Builder percents(@Nullable List<Double> value) {
			this.percents = value;
			return this;
		}

		/**
		 * API name: {@code percents}
		 */
		public Builder percents(Double... value) {
			this.percents = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #percents(List)}, creating the list if needed.
		 */
		public Builder addPercents(Double value) {
			if (this.percents == null) {
				this.percents = new ArrayList<>();
			}
			this.percents.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PercentilesBucketAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PercentilesBucketAggregation build() {

			return new PercentilesBucketAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PercentilesBucketAggregation}
	 */
	public static final JsonpDeserializer<PercentilesBucketAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, PercentilesBucketAggregation::setupPercentilesBucketAggregationDeserializer, Builder::build);

	protected static void setupPercentilesBucketAggregationDeserializer(
			DelegatingDeserializer<PercentilesBucketAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::percents, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.doubleDeserializer()),
				"percents");

	}

}
