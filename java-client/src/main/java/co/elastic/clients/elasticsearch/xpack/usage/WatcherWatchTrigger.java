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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.WatcherWatchTrigger
@JsonpDeserializable
public final class WatcherWatchTrigger implements JsonpSerializable {
	@Nullable
	private final WatcherWatchTriggerSchedule schedule;

	private final Counter all;

	// ---------------------------------------------------------------------------------------------

	public WatcherWatchTrigger(Builder builder) {

		this.schedule = builder.schedule;
		this.all = Objects.requireNonNull(builder.all, "_all");

	}

	public WatcherWatchTrigger(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code schedule}
	 */
	@Nullable
	public WatcherWatchTriggerSchedule schedule() {
		return this.schedule;
	}

	/**
	 * Required - API name: {@code _all}
	 */
	public Counter all() {
		return this.all;
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

		if (this.schedule != null) {

			generator.writeKey("schedule");
			this.schedule.serialize(generator, mapper);

		}

		generator.writeKey("_all");
		this.all.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherWatchTrigger}.
	 */
	public static class Builder implements ObjectBuilder<WatcherWatchTrigger> {
		@Nullable
		private WatcherWatchTriggerSchedule schedule;

		private Counter all;

		/**
		 * API name: {@code schedule}
		 */
		public Builder schedule(@Nullable WatcherWatchTriggerSchedule value) {
			this.schedule = value;
			return this;
		}

		/**
		 * API name: {@code schedule}
		 */
		public Builder schedule(
				Function<WatcherWatchTriggerSchedule.Builder, ObjectBuilder<WatcherWatchTriggerSchedule>> fn) {
			return this.schedule(fn.apply(new WatcherWatchTriggerSchedule.Builder()).build());
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public Builder all(Counter value) {
			this.all = value;
			return this;
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public Builder all(Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.all(fn.apply(new Counter.Builder()).build());
		}

		/**
		 * Builds a {@link WatcherWatchTrigger}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherWatchTrigger build() {

			return new WatcherWatchTrigger(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherWatchTrigger}
	 */
	public static final JsonpDeserializer<WatcherWatchTrigger> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WatcherWatchTrigger::setupWatcherWatchTriggerDeserializer, Builder::build);

	protected static void setupWatcherWatchTriggerDeserializer(DelegatingDeserializer<WatcherWatchTrigger.Builder> op) {

		op.add(Builder::schedule, WatcherWatchTriggerSchedule._DESERIALIZER, "schedule");
		op.add(Builder::all, Counter._DESERIALIZER, "_all");

	}

}
