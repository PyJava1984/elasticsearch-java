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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.FlushStats
@JsonpDeserializable
public final class FlushStats implements JsonpSerializable {
	private final long periodic;

	private final long total;

	@Nullable
	private final String totalTime;

	private final long totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	public FlushStats(Builder builder) {

		this.periodic = Objects.requireNonNull(builder.periodic, "periodic");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	public FlushStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code periodic}
	 */
	public long periodic() {
		return this.periodic;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public long total() {
		return this.total;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public String totalTime() {
		return this.totalTime;
	}

	/**
	 * Required - API name: {@code total_time_in_millis}
	 */
	public long totalTimeInMillis() {
		return this.totalTimeInMillis;
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

		generator.writeKey("periodic");
		generator.write(this.periodic);

		generator.writeKey("total");
		generator.write(this.total);

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushStats}.
	 */
	public static class Builder implements ObjectBuilder<FlushStats> {
		private Long periodic;

		private Long total;

		@Nullable
		private String totalTime;

		private Long totalTimeInMillis;

		/**
		 * Required - API name: {@code periodic}
		 */
		public Builder periodic(long value) {
			this.periodic = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public Builder totalTime(@Nullable String value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(long value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link FlushStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushStats build() {

			return new FlushStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FlushStats}
	 */
	public static final JsonpDeserializer<FlushStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FlushStats::setupFlushStatsDeserializer, Builder::build);

	protected static void setupFlushStatsDeserializer(DelegatingDeserializer<FlushStats.Builder> op) {

		op.add(Builder::periodic, JsonpDeserializer.longDeserializer(), "periodic");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.longDeserializer(), "total_time_in_millis");

	}

}
