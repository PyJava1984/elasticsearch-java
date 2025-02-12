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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.update_data_frame_analytics.Response
@JsonpDeserializable
public final class UpdateDataFrameAnalyticsResponse implements JsonpSerializable {
	private final String id;

	private final long createTime;

	private final String version;

	private final DataframeAnalyticsSource source;

	@Nullable
	private final String description;

	private final DataframeAnalyticsDestination dest;

	private final String modelMemoryLimit;

	private final boolean allowLazyStart;

	private final int maxNumThreads;

	private final DataframeAnalysis analysis;

	@Nullable
	private final JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields;

	// ---------------------------------------------------------------------------------------------

	public UpdateDataFrameAnalyticsResponse(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");
		this.createTime = Objects.requireNonNull(builder.createTime, "create_time");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.source = Objects.requireNonNull(builder.source, "source");
		this.description = builder.description;
		this.dest = Objects.requireNonNull(builder.dest, "dest");
		this.modelMemoryLimit = Objects.requireNonNull(builder.modelMemoryLimit, "model_memory_limit");
		this.allowLazyStart = Objects.requireNonNull(builder.allowLazyStart, "allow_lazy_start");
		this.maxNumThreads = Objects.requireNonNull(builder.maxNumThreads, "max_num_threads");
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.analyzedFields = builder.analyzedFields;

	}

	public UpdateDataFrameAnalyticsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code create_time}
	 */
	public long createTime() {
		return this.createTime;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code dest}
	 */
	public DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * Required - API name: {@code model_memory_limit}
	 */
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * Required - API name: {@code allow_lazy_start}
	 */
	public boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * Required - API name: {@code max_num_threads}
	 */
	public int maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * Required - API name: {@code analysis}
	 */
	public DataframeAnalysis analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields() {
		return this.analyzedFields;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("create_time");
		generator.write(this.createTime);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

		generator.writeKey("allow_lazy_start");
		generator.write(this.allowLazyStart);

		generator.writeKey("max_num_threads");
		generator.write(this.maxNumThreads);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (this.analyzedFields != null) {

			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateDataFrameAnalyticsResponse}.
	 */
	public static class Builder implements ObjectBuilder<UpdateDataFrameAnalyticsResponse> {
		private String id;

		private Long createTime;

		private String version;

		private DataframeAnalyticsSource source;

		@Nullable
		private String description;

		private DataframeAnalyticsDestination dest;

		private String modelMemoryLimit;

		private Boolean allowLazyStart;

		private Integer maxNumThreads;

		private DataframeAnalysis analysis;

		@Nullable
		private JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields;

		/**
		 * Required - API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_time}
		 */
		public Builder createTime(long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public Builder source(Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * Required - API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code allow_lazy_start}
		 */
		public Builder allowLazyStart(boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(int value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public Builder analysis(DataframeAnalysis value) {
			this.analysis = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public Builder analysis(Function<DataframeAnalysis.Builder, ObjectBuilder<DataframeAnalysis>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysis.Builder()).build());
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public Builder analyzedFields(@Nullable JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * Builds a {@link UpdateDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateDataFrameAnalyticsResponse build() {

			return new UpdateDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<UpdateDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateDataFrameAnalyticsResponse::setupUpdateDataFrameAnalyticsResponseDeserializer,
					Builder::build);

	protected static void setupUpdateDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<UpdateDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, DataframeAnalyticsDestination._DESERIALIZER, "dest");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::analyzedFields, JsonpDeserializer.jsonValueDeserializer(), "analyzed_fields");

	}

}
