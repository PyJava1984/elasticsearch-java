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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_model_snapshots.Request
@JsonpDeserializable
public final class GetModelSnapshotsRequest extends RequestBase implements JsonpSerializable {
	private final String jobId;

	@Nullable
	private final String snapshotId;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	@Nullable
	private final String sort;

	@Nullable
	private final String start;

	@Nullable
	private final String end;

	// ---------------------------------------------------------------------------------------------

	public GetModelSnapshotsRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.snapshotId = builder.snapshotId;
		this.desc = builder.desc;
		this.from = builder.from;
		this.size = builder.size;
		this.sort = builder.sort;
		this.start = builder.start;
		this.end = builder.end;

	}

	public GetModelSnapshotsRequest(Function<Builder, Builder> fn) {
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
	 * A numerical character string that uniquely identifies the model snapshot.
	 * <p>
	 * API name: {@code snapshot_id}
	 */
	@Nullable
	public String snapshotId() {
		return this.snapshotId;
	}

	/**
	 * If true, the results are sorted in descending order.
	 * <p>
	 * API name: {@code desc}
	 */
	@Nullable
	public Boolean desc() {
		return this.desc;
	}

	/**
	 * Skips the specified number of snapshots.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of snapshots to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * Specifies the sort field for the requested snapshots. By default, the
	 * snapshots are sorted by their timestamp.
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public String sort() {
		return this.sort;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
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

		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetModelSnapshotsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetModelSnapshotsRequest> {
		private String jobId;

		@Nullable
		private String snapshotId;

		@Nullable
		private Boolean desc;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		@Nullable
		private String sort;

		@Nullable
		private String start;

		@Nullable
		private String end;

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
		 * A numerical character string that uniquely identifies the model snapshot.
		 * <p>
		 * API name: {@code snapshot_id}
		 */
		public Builder snapshotId(@Nullable String value) {
			this.snapshotId = value;
			return this;
		}

		/**
		 * If true, the results are sorted in descending order.
		 * <p>
		 * API name: {@code desc}
		 */
		public Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * Skips the specified number of snapshots.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of snapshots to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies the sort field for the requested snapshots. By default, the
		 * snapshots are sorted by their timestamp.
		 * <p>
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * Builds a {@link GetModelSnapshotsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetModelSnapshotsRequest build() {

			return new GetModelSnapshotsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetModelSnapshotsRequest}
	 */
	public static final JsonpDeserializer<GetModelSnapshotsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetModelSnapshotsRequest::setupGetModelSnapshotsRequestDeserializer, Builder::build);

	protected static void setupGetModelSnapshotsRequestDeserializer(
			DelegatingDeserializer<GetModelSnapshotsRequest.Builder> op) {

		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");
		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_model_snapshots}".
	 */
	public static final Endpoint<GetModelSnapshotsRequest, GetModelSnapshotsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;
				final int _snapshotId = 1 << 1;

				int propsSet = 0;

				propsSet |= _jobId;
				if (request.snapshotId() != null)
					propsSet |= _snapshotId;

				if (propsSet == (_jobId | _snapshotId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/model_snapshots");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.snapshotId, buf);
					return buf.toString();
				}
				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.jobId, buf);
					buf.append("/model_snapshots");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.desc != null) {
					params.put("desc", String.valueOf(request.desc));
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.sort != null) {
					params.put("sort", request.sort);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetModelSnapshotsResponse._DESERIALIZER);
}
