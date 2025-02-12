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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.indices.data_streams_stats.DataStreamsStatsItem;
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
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.data_streams_stats.Response
@JsonpDeserializable
public final class DataStreamsStatsResponse implements JsonpSerializable {
	private final ShardStatistics shards;

	private final int backingIndices;

	private final int dataStreamCount;

	@Nullable
	private final String totalStoreSizes;

	private final int totalStoreSizeBytes;

	private final List<DataStreamsStatsItem> dataStreams;

	// ---------------------------------------------------------------------------------------------

	public DataStreamsStatsResponse(Builder builder) {

		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.backingIndices = Objects.requireNonNull(builder.backingIndices, "backing_indices");
		this.dataStreamCount = Objects.requireNonNull(builder.dataStreamCount, "data_stream_count");
		this.totalStoreSizes = builder.totalStoreSizes;
		this.totalStoreSizeBytes = Objects.requireNonNull(builder.totalStoreSizeBytes, "total_store_size_bytes");
		this.dataStreams = ModelTypeHelper.unmodifiableNonNull(builder.dataStreams, "data_streams");

	}

	public DataStreamsStatsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code backing_indices}
	 */
	public int backingIndices() {
		return this.backingIndices;
	}

	/**
	 * Required - API name: {@code data_stream_count}
	 */
	public int dataStreamCount() {
		return this.dataStreamCount;
	}

	/**
	 * API name: {@code total_store_sizes}
	 */
	@Nullable
	public String totalStoreSizes() {
		return this.totalStoreSizes;
	}

	/**
	 * Required - API name: {@code total_store_size_bytes}
	 */
	public int totalStoreSizeBytes() {
		return this.totalStoreSizeBytes;
	}

	/**
	 * Required - API name: {@code data_streams}
	 */
	public List<DataStreamsStatsItem> dataStreams() {
		return this.dataStreams;
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

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("backing_indices");
		generator.write(this.backingIndices);

		generator.writeKey("data_stream_count");
		generator.write(this.dataStreamCount);

		if (this.totalStoreSizes != null) {

			generator.writeKey("total_store_sizes");
			generator.write(this.totalStoreSizes);

		}

		generator.writeKey("total_store_size_bytes");
		generator.write(this.totalStoreSizeBytes);

		generator.writeKey("data_streams");
		generator.writeStartArray();
		for (DataStreamsStatsItem item0 : this.dataStreams) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamsStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<DataStreamsStatsResponse> {
		private ShardStatistics shards;

		private Integer backingIndices;

		private Integer dataStreamCount;

		@Nullable
		private String totalStoreSizes;

		private Integer totalStoreSizeBytes;

		private List<DataStreamsStatsItem> dataStreams;

		/**
		 * Required - API name: {@code _shards}
		 */
		public Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code backing_indices}
		 */
		public Builder backingIndices(int value) {
			this.backingIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_stream_count}
		 */
		public Builder dataStreamCount(int value) {
			this.dataStreamCount = value;
			return this;
		}

		/**
		 * API name: {@code total_store_sizes}
		 */
		public Builder totalStoreSizes(@Nullable String value) {
			this.totalStoreSizes = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_store_size_bytes}
		 */
		public Builder totalStoreSizeBytes(int value) {
			this.totalStoreSizeBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 */
		public Builder dataStreams(List<DataStreamsStatsItem> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * Required - API name: {@code data_streams}
		 */
		public Builder dataStreams(DataStreamsStatsItem... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(DataStreamsStatsItem value) {
			if (this.dataStreams == null) {
				this.dataStreams = new ArrayList<>();
			}
			this.dataStreams.add(value);
			return this;
		}

		/**
		 * Set {@link #dataStreams(List)} to a singleton list.
		 */
		public Builder dataStreams(Function<DataStreamsStatsItem.Builder, ObjectBuilder<DataStreamsStatsItem>> fn) {
			return this.dataStreams(fn.apply(new DataStreamsStatsItem.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed.
		 */
		public Builder addDataStreams(Function<DataStreamsStatsItem.Builder, ObjectBuilder<DataStreamsStatsItem>> fn) {
			return this.addDataStreams(fn.apply(new DataStreamsStatsItem.Builder()).build());
		}

		/**
		 * Builds a {@link DataStreamsStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamsStatsResponse build() {

			return new DataStreamsStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamsStatsResponse}
	 */
	public static final JsonpDeserializer<DataStreamsStatsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamsStatsResponse::setupDataStreamsStatsResponseDeserializer, Builder::build);

	protected static void setupDataStreamsStatsResponseDeserializer(
			DelegatingDeserializer<DataStreamsStatsResponse.Builder> op) {

		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::backingIndices, JsonpDeserializer.integerDeserializer(), "backing_indices");
		op.add(Builder::dataStreamCount, JsonpDeserializer.integerDeserializer(), "data_stream_count");
		op.add(Builder::totalStoreSizes, JsonpDeserializer.stringDeserializer(), "total_store_sizes");
		op.add(Builder::totalStoreSizeBytes, JsonpDeserializer.integerDeserializer(), "total_store_size_bytes");
		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(DataStreamsStatsItem._DESERIALIZER),
				"data_streams");

	}

}
