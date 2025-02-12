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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup._types.HistogramGrouping
@JsonpDeserializable
public final class HistogramGrouping implements JsonpSerializable {
	private final List<String> fields;

	private final long interval;

	// ---------------------------------------------------------------------------------------------

	public HistogramGrouping(Builder builder) {

		this.fields = ModelTypeHelper.unmodifiableNonNull(builder.fields, "fields");
		this.interval = Objects.requireNonNull(builder.interval, "interval");

	}

	public HistogramGrouping(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code interval}
	 */
	public long interval() {
		return this.interval;
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

		generator.writeKey("fields");
		generator.writeStartArray();
		for (String item0 : this.fields) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("interval");
		generator.write(this.interval);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HistogramGrouping}.
	 */
	public static class Builder implements ObjectBuilder<HistogramGrouping> {
		private List<String> fields;

		private Long interval;

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code interval}
		 */
		public Builder interval(long value) {
			this.interval = value;
			return this;
		}

		/**
		 * Builds a {@link HistogramGrouping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HistogramGrouping build() {

			return new HistogramGrouping(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HistogramGrouping}
	 */
	public static final JsonpDeserializer<HistogramGrouping> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HistogramGrouping::setupHistogramGroupingDeserializer, Builder::build);

	protected static void setupHistogramGroupingDeserializer(DelegatingDeserializer<HistogramGrouping.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::interval, JsonpDeserializer.longDeserializer(), "interval");

	}

}
