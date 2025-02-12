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

package co.elastic.clients.elasticsearch.cluster.pending_tasks;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.pending_tasks.PendingTask
@JsonpDeserializable
public final class PendingTask implements JsonpSerializable {
	private final int insertOrder;

	private final String priority;

	private final String source;

	private final String timeInQueue;

	private final int timeInQueueMillis;

	// ---------------------------------------------------------------------------------------------

	public PendingTask(Builder builder) {

		this.insertOrder = Objects.requireNonNull(builder.insertOrder, "insert_order");
		this.priority = Objects.requireNonNull(builder.priority, "priority");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.timeInQueue = Objects.requireNonNull(builder.timeInQueue, "time_in_queue");
		this.timeInQueueMillis = Objects.requireNonNull(builder.timeInQueueMillis, "time_in_queue_millis");

	}

	public PendingTask(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code insert_order}
	 */
	public int insertOrder() {
		return this.insertOrder;
	}

	/**
	 * Required - API name: {@code priority}
	 */
	public String priority() {
		return this.priority;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public String source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code time_in_queue}
	 */
	public String timeInQueue() {
		return this.timeInQueue;
	}

	/**
	 * Required - API name: {@code time_in_queue_millis}
	 */
	public int timeInQueueMillis() {
		return this.timeInQueueMillis;
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

		generator.writeKey("insert_order");
		generator.write(this.insertOrder);

		generator.writeKey("priority");
		generator.write(this.priority);

		generator.writeKey("source");
		generator.write(this.source);

		generator.writeKey("time_in_queue");
		generator.write(this.timeInQueue);

		generator.writeKey("time_in_queue_millis");
		generator.write(this.timeInQueueMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTask}.
	 */
	public static class Builder implements ObjectBuilder<PendingTask> {
		private Integer insertOrder;

		private String priority;

		private String source;

		private String timeInQueue;

		private Integer timeInQueueMillis;

		/**
		 * Required - API name: {@code insert_order}
		 */
		public Builder insertOrder(int value) {
			this.insertOrder = value;
			return this;
		}

		/**
		 * Required - API name: {@code priority}
		 */
		public Builder priority(String value) {
			this.priority = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_queue}
		 */
		public Builder timeInQueue(String value) {
			this.timeInQueue = value;
			return this;
		}

		/**
		 * Required - API name: {@code time_in_queue_millis}
		 */
		public Builder timeInQueueMillis(int value) {
			this.timeInQueueMillis = value;
			return this;
		}

		/**
		 * Builds a {@link PendingTask}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTask build() {

			return new PendingTask(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PendingTask}
	 */
	public static final JsonpDeserializer<PendingTask> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PendingTask::setupPendingTaskDeserializer, Builder::build);

	protected static void setupPendingTaskDeserializer(DelegatingDeserializer<PendingTask.Builder> op) {

		op.add(Builder::insertOrder, JsonpDeserializer.integerDeserializer(), "insert_order");
		op.add(Builder::priority, JsonpDeserializer.stringDeserializer(), "priority");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");
		op.add(Builder::timeInQueue, JsonpDeserializer.stringDeserializer(), "time_in_queue");
		op.add(Builder::timeInQueueMillis, JsonpDeserializer.integerDeserializer(), "time_in_queue_millis");

	}

}
