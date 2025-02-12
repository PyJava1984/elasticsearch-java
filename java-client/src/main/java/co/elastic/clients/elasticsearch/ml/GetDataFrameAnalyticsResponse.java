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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_data_frame_analytics.Response
@JsonpDeserializable
public final class GetDataFrameAnalyticsResponse implements JsonpSerializable {
	private final int count;

	private final List<DataframeAnalyticsSummary> dataFrameAnalytics;

	// ---------------------------------------------------------------------------------------------

	public GetDataFrameAnalyticsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.dataFrameAnalytics = ModelTypeHelper.unmodifiableNonNull(builder.dataFrameAnalytics,
				"data_frame_analytics");

	}

	public GetDataFrameAnalyticsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public int count() {
		return this.count;
	}

	/**
	 * Required - An array of data frame analytics job resources, which are sorted
	 * by the id value in ascending order.
	 * <p>
	 * API name: {@code data_frame_analytics}
	 */
	public List<DataframeAnalyticsSummary> dataFrameAnalytics() {
		return this.dataFrameAnalytics;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("data_frame_analytics");
		generator.writeStartArray();
		for (DataframeAnalyticsSummary item0 : this.dataFrameAnalytics) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataFrameAnalyticsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetDataFrameAnalyticsResponse> {
		private Integer count;

		private List<DataframeAnalyticsSummary> dataFrameAnalytics;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - An array of data frame analytics job resources, which are sorted
		 * by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 */
		public Builder dataFrameAnalytics(List<DataframeAnalyticsSummary> value) {
			this.dataFrameAnalytics = value;
			return this;
		}

		/**
		 * Required - An array of data frame analytics job resources, which are sorted
		 * by the id value in ascending order.
		 * <p>
		 * API name: {@code data_frame_analytics}
		 */
		public Builder dataFrameAnalytics(DataframeAnalyticsSummary... value) {
			this.dataFrameAnalytics = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataFrameAnalytics(List)}, creating the list if
		 * needed.
		 */
		public Builder addDataFrameAnalytics(DataframeAnalyticsSummary value) {
			if (this.dataFrameAnalytics == null) {
				this.dataFrameAnalytics = new ArrayList<>();
			}
			this.dataFrameAnalytics.add(value);
			return this;
		}

		/**
		 * Set {@link #dataFrameAnalytics(List)} to a singleton list.
		 */
		public Builder dataFrameAnalytics(
				Function<DataframeAnalyticsSummary.Builder, ObjectBuilder<DataframeAnalyticsSummary>> fn) {
			return this.dataFrameAnalytics(fn.apply(new DataframeAnalyticsSummary.Builder()).build());
		}

		/**
		 * Add a value to {@link #dataFrameAnalytics(List)}, creating the list if
		 * needed.
		 */
		public Builder addDataFrameAnalytics(
				Function<DataframeAnalyticsSummary.Builder, ObjectBuilder<DataframeAnalyticsSummary>> fn) {
			return this.addDataFrameAnalytics(fn.apply(new DataframeAnalyticsSummary.Builder()).build());
		}

		/**
		 * Builds a {@link GetDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataFrameAnalyticsResponse build() {

			return new GetDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<GetDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetDataFrameAnalyticsResponse::setupGetDataFrameAnalyticsResponseDeserializer,
			Builder::build);

	protected static void setupGetDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<GetDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::dataFrameAnalytics,
				JsonpDeserializer.arrayDeserializer(DataframeAnalyticsSummary._DESERIALIZER), "data_frame_analytics");

	}

}
