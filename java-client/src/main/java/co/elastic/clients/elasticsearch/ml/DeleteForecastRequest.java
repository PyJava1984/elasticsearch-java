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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_forecast.Request

public final class DeleteForecastRequest extends RequestBase {
	private final String jobId;

	@Nullable
	private final String forecastId;

	@Nullable
	private final Boolean allowNoForecasts;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public DeleteForecastRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.forecastId = builder.forecastId;
		this.allowNoForecasts = builder.allowNoForecasts;
		this.timeout = builder.timeout;

	}

	public DeleteForecastRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * A comma-separated list of forecast identifiers. If you do not specify this
	 * optional parameter or if you specify <code>_all</code> or <code>*</code> the
	 * API deletes all forecasts from the job.
	 * <p>
	 * API name: {@code forecast_id}
	 */
	@Nullable
	public String forecastId() {
		return this.forecastId;
	}

	/**
	 * Specifies whether an error occurs when there are no forecasts. In particular,
	 * if this parameter is set to <code>false</code> and there are no forecasts
	 * associated with the job, attempts to delete all forecasts return an error.
	 * <p>
	 * API name: {@code allow_no_forecasts}
	 */
	@Nullable
	public Boolean allowNoForecasts() {
		return this.allowNoForecasts;
	}

	/**
	 * Specifies the period of time to wait for the completion of the delete
	 * operation. When this period of time elapses, the API fails and returns an
	 * error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteForecastRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteForecastRequest> {
		private String jobId;

		@Nullable
		private String forecastId;

		@Nullable
		private Boolean allowNoForecasts;

		@Nullable
		private String timeout;

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * A comma-separated list of forecast identifiers. If you do not specify this
		 * optional parameter or if you specify <code>_all</code> or <code>*</code> the
		 * API deletes all forecasts from the job.
		 * <p>
		 * API name: {@code forecast_id}
		 */
		public Builder forecastId(@Nullable String value) {
			this.forecastId = value;
			return this;
		}

		/**
		 * Specifies whether an error occurs when there are no forecasts. In particular,
		 * if this parameter is set to <code>false</code> and there are no forecasts
		 * associated with the job, attempts to delete all forecasts return an error.
		 * <p>
		 * API name: {@code allow_no_forecasts}
		 */
		public Builder allowNoForecasts(@Nullable Boolean value) {
			this.allowNoForecasts = value;
			return this;
		}

		/**
		 * Specifies the period of time to wait for the completion of the delete
		 * operation. When this period of time elapses, the API fails and returns an
		 * error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteForecastRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteForecastRequest build() {

			return new DeleteForecastRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_forecast}".
	 */
	public static final Endpoint<DeleteForecastRequest, DeleteForecastResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;
				final int _forecastId = 1 << 1;

				int propsSet = 0;

				propsSet |= _jobId;
				if (request.forecastId() != null)
					propsSet |= _forecastId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/_forecast");
					return buf.toString();
				}
				if (propsSet == (_jobId | _forecastId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/_forecast");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.forecastId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoForecasts != null) {
					params.put("allow_no_forecasts", String.valueOf(request.allowNoForecasts));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteForecastResponse._DESERIALIZER);
}
