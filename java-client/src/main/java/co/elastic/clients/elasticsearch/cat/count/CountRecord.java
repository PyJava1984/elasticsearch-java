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

package co.elastic.clients.elasticsearch.cat.count;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.count.CountRecord
@JsonpDeserializable
public final class CountRecord implements JsonpSerializable {
	@Nullable
	private final String epoch;

	@Nullable
	private final String timestamp;

	@Nullable
	private final String count;

	// ---------------------------------------------------------------------------------------------

	public CountRecord(Builder builder) {

		this.epoch = builder.epoch;
		this.timestamp = builder.timestamp;
		this.count = builder.count;

	}

	public CountRecord(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * seconds since 1969-01-01 00:00:00
	 * <p>
	 * API name: {@code epoch}
	 */
	@Nullable
	public String epoch() {
		return this.epoch;
	}

	/**
	 * time in HH:MM:SS
	 * <p>
	 * API name: {@code timestamp}
	 */
	@Nullable
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * the document count
	 * <p>
	 * API name: {@code count}
	 */
	@Nullable
	public String count() {
		return this.count;
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

		if (this.epoch != null) {

			generator.writeKey("epoch");
			generator.write(this.epoch);

		}
		if (this.timestamp != null) {

			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}
		if (this.count != null) {

			generator.writeKey("count");
			generator.write(this.count);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CountRecord}.
	 */
	public static class Builder implements ObjectBuilder<CountRecord> {
		@Nullable
		private String epoch;

		@Nullable
		private String timestamp;

		@Nullable
		private String count;

		/**
		 * seconds since 1969-01-01 00:00:00
		 * <p>
		 * API name: {@code epoch}
		 */
		public Builder epoch(@Nullable String value) {
			this.epoch = value;
			return this;
		}

		/**
		 * time in HH:MM:SS
		 * <p>
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(@Nullable String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * the document count
		 * <p>
		 * API name: {@code count}
		 */
		public Builder count(@Nullable String value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link CountRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CountRecord build() {

			return new CountRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CountRecord}
	 */
	public static final JsonpDeserializer<CountRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CountRecord::setupCountRecordDeserializer, Builder::build);

	protected static void setupCountRecordDeserializer(DelegatingDeserializer<CountRecord.Builder> op) {

		op.add(Builder::epoch, JsonpDeserializer.stringDeserializer(), "epoch", "t", "time");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp", "ts", "hms", "hhmmss");
		op.add(Builder::count, JsonpDeserializer.stringDeserializer(), "count", "dc", "docs.count", "docsCount");

	}

}
