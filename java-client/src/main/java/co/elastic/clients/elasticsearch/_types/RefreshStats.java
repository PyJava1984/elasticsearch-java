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

// typedef: _types.RefreshStats
@JsonpDeserializable
public final class RefreshStats implements JsonpSerializable {
	private final long externalTotal;

	private final long externalTotalTimeInMillis;

	private final long listeners;

	private final long total;

	@Nullable
	private final String totalTime;

	private final long totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	public RefreshStats(Builder builder) {

		this.externalTotal = Objects.requireNonNull(builder.externalTotal, "external_total");
		this.externalTotalTimeInMillis = Objects.requireNonNull(builder.externalTotalTimeInMillis,
				"external_total_time_in_millis");
		this.listeners = Objects.requireNonNull(builder.listeners, "listeners");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	public RefreshStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code external_total}
	 */
	public long externalTotal() {
		return this.externalTotal;
	}

	/**
	 * Required - API name: {@code external_total_time_in_millis}
	 */
	public long externalTotalTimeInMillis() {
		return this.externalTotalTimeInMillis;
	}

	/**
	 * Required - API name: {@code listeners}
	 */
	public long listeners() {
		return this.listeners;
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

		generator.writeKey("external_total");
		generator.write(this.externalTotal);

		generator.writeKey("external_total_time_in_millis");
		generator.write(this.externalTotalTimeInMillis);

		generator.writeKey("listeners");
		generator.write(this.listeners);

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
	 * Builder for {@link RefreshStats}.
	 */
	public static class Builder implements ObjectBuilder<RefreshStats> {
		private Long externalTotal;

		private Long externalTotalTimeInMillis;

		private Long listeners;

		private Long total;

		@Nullable
		private String totalTime;

		private Long totalTimeInMillis;

		/**
		 * Required - API name: {@code external_total}
		 */
		public Builder externalTotal(long value) {
			this.externalTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code external_total_time_in_millis}
		 */
		public Builder externalTotalTimeInMillis(long value) {
			this.externalTotalTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code listeners}
		 */
		public Builder listeners(long value) {
			this.listeners = value;
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
		 * Builds a {@link RefreshStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RefreshStats build() {

			return new RefreshStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RefreshStats}
	 */
	public static final JsonpDeserializer<RefreshStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RefreshStats::setupRefreshStatsDeserializer, Builder::build);

	protected static void setupRefreshStatsDeserializer(DelegatingDeserializer<RefreshStats.Builder> op) {

		op.add(Builder::externalTotal, JsonpDeserializer.longDeserializer(), "external_total");
		op.add(Builder::externalTotalTimeInMillis, JsonpDeserializer.longDeserializer(),
				"external_total_time_in_millis");
		op.add(Builder::listeners, JsonpDeserializer.longDeserializer(), "listeners");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.longDeserializer(), "total_time_in_millis");

	}

}
