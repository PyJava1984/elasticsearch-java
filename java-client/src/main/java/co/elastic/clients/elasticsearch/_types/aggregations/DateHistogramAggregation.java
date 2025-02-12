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

import co.elastic.clients.elasticsearch.transform.PivotGroupBy;
import co.elastic.clients.elasticsearch.transform.PivotGroupByVariant;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.DateHistogramAggregation
@JsonpDeserializable
public final class DateHistogramAggregation extends BucketAggregationBase
		implements
			AggregationVariant,
			PivotGroupByVariant {
	@Nullable
	private final JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ calendarInterval;

	@Nullable
	private final ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> extendedBounds;

	@Nullable
	private final ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> hardBounds;

	@Nullable
	private final String field;

	@Nullable
	private final JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ fixedInterval;

	@Nullable
	private final String format;

	@Nullable
	private final JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ interval;

	@Nullable
	private final Integer minDocCount;

	@Nullable
	private final String missing;

	@Nullable
	private final String offset;

	@Nullable
	private final HistogramOrder order;

	@Nullable
	private final Map<String, JsonData> params;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final String timeZone;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	public DateHistogramAggregation(Builder builder) {
		super(builder);

		this.calendarInterval = builder.calendarInterval;
		this.extendedBounds = builder.extendedBounds;
		this.hardBounds = builder.hardBounds;
		this.field = builder.field;
		this.fixedInterval = builder.fixedInterval;
		this.format = builder.format;
		this.interval = builder.interval;
		this.minDocCount = builder.minDocCount;
		this.missing = builder.missing;
		this.offset = builder.offset;
		this.order = builder.order;
		this.params = ModelTypeHelper.unmodifiable(builder.params);
		this.script = builder.script;
		this.timeZone = builder.timeZone;
		this.keyed = builder.keyed;

	}

	public DateHistogramAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation}, {@link PivotGroupBy} variant type
	 */
	@Override
	public String _variantType() {
		return "date_histogram";
	}

	/**
	 * API name: {@code calendar_interval}
	 */
	@Nullable
	public JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ calendarInterval() {
		return this.calendarInterval;
	}

	/**
	 * API name: {@code extended_bounds}
	 */
	@Nullable
	public ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> extendedBounds() {
		return this.extendedBounds;
	}

	/**
	 * API name: {@code hard_bounds}
	 */
	@Nullable
	public ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> hardBounds() {
		return this.hardBounds;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code fixed_interval}
	 */
	@Nullable
	public JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ fixedInterval() {
		return this.fixedInterval;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public String format() {
		return this.format;
	}

	/**
	 * API name: {@code interval}
	 */
	@Nullable
	public JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ interval() {
		return this.interval;
	}

	/**
	 * API name: {@code min_doc_count}
	 */
	@Nullable
	public Integer minDocCount() {
		return this.minDocCount;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public String missing() {
		return this.missing;
	}

	/**
	 * API name: {@code offset}
	 */
	@Nullable
	public String offset() {
		return this.offset;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public HistogramOrder order() {
		return this.order;
	}

	/**
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
		return this.timeZone;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.calendarInterval != null) {

			generator.writeKey("calendar_interval");
			generator.write(this.calendarInterval);

		}
		if (this.extendedBounds != null) {

			generator.writeKey("extended_bounds");
			this.extendedBounds.serialize(generator, mapper);

		}
		if (this.hardBounds != null) {

			generator.writeKey("hard_bounds");
			this.hardBounds.serialize(generator, mapper);

		}
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.fixedInterval != null) {

			generator.writeKey("fixed_interval");
			generator.write(this.fixedInterval);

		}
		if (this.format != null) {

			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.interval != null) {

			generator.writeKey("interval");
			generator.write(this.interval);

		}
		if (this.minDocCount != null) {

			generator.writeKey("min_doc_count");
			generator.write(this.minDocCount);

		}
		if (this.missing != null) {

			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.offset != null) {

			generator.writeKey("offset");
			generator.write(this.offset);

		}
		if (this.order != null) {

			generator.writeKey("order");
			this.order.serialize(generator, mapper);

		}
		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.timeZone != null) {

			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.keyed != null) {

			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DateHistogramAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DateHistogramAggregation> {
		@Nullable
		private JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ calendarInterval;

		@Nullable
		private ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> extendedBounds;

		@Nullable
		private ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> hardBounds;

		@Nullable
		private String field;

		@Nullable
		private JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ fixedInterval;

		@Nullable
		private String format;

		@Nullable
		private JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ interval;

		@Nullable
		private Integer minDocCount;

		@Nullable
		private String missing;

		@Nullable
		private String offset;

		@Nullable
		private HistogramOrder order;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private String timeZone;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code calendar_interval}
		 */
		public Builder calendarInterval(
				@Nullable JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ value) {
			this.calendarInterval = value;
			return this;
		}

		/**
		 * API name: {@code extended_bounds}
		 */
		public Builder extendedBounds(
				@Nullable ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> value) {
			this.extendedBounds = value;
			return this;
		}

		/**
		 * API name: {@code extended_bounds}
		 */
		public Builder extendedBounds(
				Function<ExtendedBounds.Builder<JsonValue /* Union(_types.DateMath | _types.long) */>, ObjectBuilder<ExtendedBounds<JsonValue /*
																																				 * Union
																																				 * (
																																				 * _types
																																				 * .
																																				 * DateMath
																																				 * |
																																				 * _types
																																				 * .
																																				 * long)
																																				 */>>> fn) {
			return this.extendedBounds(fn
					.apply(new ExtendedBounds.Builder<JsonValue /* Union(_types.DateMath | _types.long) */>()).build());
		}

		/**
		 * API name: {@code hard_bounds}
		 */
		public Builder hardBounds(
				@Nullable ExtendedBounds<JsonValue /* Union(_types.DateMath | _types.long) */> value) {
			this.hardBounds = value;
			return this;
		}

		/**
		 * API name: {@code hard_bounds}
		 */
		public Builder hardBounds(
				Function<ExtendedBounds.Builder<JsonValue /* Union(_types.DateMath | _types.long) */>, ObjectBuilder<ExtendedBounds<JsonValue /*
																																				 * Union
																																				 * (
																																				 * _types
																																				 * .
																																				 * DateMath
																																				 * |
																																				 * _types
																																				 * .
																																				 * long)
																																				 */>>> fn) {
			return this.hardBounds(fn
					.apply(new ExtendedBounds.Builder<JsonValue /* Union(_types.DateMath | _types.long) */>()).build());
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code fixed_interval}
		 */
		public Builder fixedInterval(
				@Nullable JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ value) {
			this.fixedInterval = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 */
		public Builder interval(@Nullable JsonValue /* Union(_types.Time | _types.aggregations.DateInterval) */ value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code min_doc_count}
		 */
		public Builder minDocCount(@Nullable Integer value) {
			this.minDocCount = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public Builder missing(@Nullable String value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public Builder offset(@Nullable String value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(@Nullable HistogramOrder value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(Function<HistogramOrder.Builder, ObjectBuilder<HistogramOrder>> fn) {
			return this.order(fn.apply(new HistogramOrder.Builder()).build());
		}

		/**
		 * API name: {@code params}
		 */
		public Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public Builder putParams(String key, JsonData value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * API name: {@code keyed}
		 */
		public Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DateHistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateHistogramAggregation build() {

			return new DateHistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateHistogramAggregation}
	 */
	public static final JsonpDeserializer<DateHistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DateHistogramAggregation::setupDateHistogramAggregationDeserializer, Builder::build);

	protected static void setupDateHistogramAggregationDeserializer(
			DelegatingDeserializer<DateHistogramAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::calendarInterval, JsonpDeserializer.jsonValueDeserializer(), "calendar_interval");
		op.add(Builder::extendedBounds,
				ExtendedBounds.createExtendedBoundsDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"extended_bounds");
		op.add(Builder::hardBounds,
				ExtendedBounds.createExtendedBoundsDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"hard_bounds");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::fixedInterval, JsonpDeserializer.jsonValueDeserializer(), "fixed_interval");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::interval, JsonpDeserializer.jsonValueDeserializer(), "interval");
		op.add(Builder::minDocCount, JsonpDeserializer.integerDeserializer(), "min_doc_count");
		op.add(Builder::missing, JsonpDeserializer.stringDeserializer(), "missing");
		op.add(Builder::offset, JsonpDeserializer.stringDeserializer(), "offset");
		op.add(Builder::order, HistogramOrder._DESERIALIZER, "order");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
