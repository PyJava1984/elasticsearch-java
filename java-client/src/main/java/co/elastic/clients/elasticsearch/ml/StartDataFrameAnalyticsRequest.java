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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.start_data_frame_analytics.Request

public final class StartDataFrameAnalyticsRequest extends RequestBase {
	private final String id;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public StartDataFrameAnalyticsRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.timeout = builder.timeout;

	}

	public StartDataFrameAnalyticsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The ID of the data frame analytics to start
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Controls the amount of time to wait until the data frame analytics job
	 * starts.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartDataFrameAnalyticsRequest}.
	 */
	public static class Builder implements ObjectBuilder<StartDataFrameAnalyticsRequest> {
		private String id;

		@Nullable
		private String timeout;

		/**
		 * Required - The ID of the data frame analytics to start
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Controls the amount of time to wait until the data frame analytics job
		 * starts.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link StartDataFrameAnalyticsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartDataFrameAnalyticsRequest build() {

			return new StartDataFrameAnalyticsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.start_data_frame_analytics}".
	 */
	public static final Endpoint<StartDataFrameAnalyticsRequest, StartDataFrameAnalyticsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/data_frame");
					buf.append("/analytics");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/_start");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StartDataFrameAnalyticsResponse._DESERIALIZER);
}
