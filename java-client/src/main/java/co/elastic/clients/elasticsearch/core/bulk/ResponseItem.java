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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.InlineGet;
import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.ResponseItem
@JsonpDeserializable
public final class ResponseItem implements JsonpSerializable {
	// Single key dictionary
	private final OperationType operationType;

	@Nullable
	private final String id;

	private final String index;

	private final int status;

	@Nullable
	private final ErrorCause error;

	@Nullable
	private final Long primaryTerm;

	@Nullable
	private final String result;

	@Nullable
	private final Long seqNo;

	@Nullable
	private final ShardStatistics shards;

	@Nullable
	private final String type;

	@Nullable
	private final Long version;

	@Nullable
	private final Boolean forcedRefresh;

	@Nullable
	private final InlineGet<Map<String, JsonData>> get;

	// ---------------------------------------------------------------------------------------------

	public ResponseItem(Builder builder) {

		this.operationType = Objects.requireNonNull(builder.operationType, "operation_type");

		this.id = builder.id;
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.error = builder.error;
		this.primaryTerm = builder.primaryTerm;
		this.result = builder.result;
		this.seqNo = builder.seqNo;
		this.shards = builder.shards;
		this.type = builder.type;
		this.version = builder.version;
		this.forcedRefresh = builder.forcedRefresh;
		this.get = builder.get;

	}

	public ResponseItem(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required -
	 */
	public OperationType operationType() {
		return this.operationType;
	}

	/**
	 * API name: {@code _id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public int status() {
		return this.status;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public ErrorCause error() {
		return this.error;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code result}
	 */
	@Nullable
	public String result() {
		return this.result;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Long seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _shards}
	 */
	@Nullable
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code _type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code forced_refresh}
	 */
	@Nullable
	public Boolean forcedRefresh() {
		return this.forcedRefresh;
	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public InlineGet<Map<String, JsonData>> get() {
		return this.get;
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
		generator.writeStartObject(this.operationType.jsonValue());

		if (this.id != null) {

			generator.writeKey("_id");
			generator.write(this.id);

		}

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("status");
		generator.write(this.status);

		if (this.error != null) {

			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}
		if (this.primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		if (this.result != null) {

			generator.writeKey("result");
			generator.write(this.result);

		}
		if (this.seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}
		if (this.shards != null) {

			generator.writeKey("_shards");
			this.shards.serialize(generator, mapper);

		}
		if (this.type != null) {

			generator.writeKey("_type");
			generator.write(this.type);

		}
		if (this.version != null) {

			generator.writeKey("_version");
			generator.write(this.version);

		}
		if (this.forcedRefresh != null) {

			generator.writeKey("forced_refresh");
			generator.write(this.forcedRefresh);

		}
		if (this.get != null) {

			generator.writeKey("get");
			this.get.serialize(generator, mapper);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResponseItem}.
	 */
	public static class Builder implements ObjectBuilder<ResponseItem> {
		private OperationType operationType;

		/**
		 * Required -
		 */
		public Builder operationType(OperationType value) {
			this.operationType = value;
			return this;
		}

		@Nullable
		private String id;

		private String index;

		private Integer status;

		@Nullable
		private ErrorCause error;

		@Nullable
		private Long primaryTerm;

		@Nullable
		private String result;

		@Nullable
		private Long seqNo;

		@Nullable
		private ShardStatistics shards;

		@Nullable
		private String type;

		@Nullable
		private Long version;

		@Nullable
		private Boolean forcedRefresh;

		@Nullable
		private InlineGet<Map<String, JsonData>> get;

		/**
		 * API name: {@code _id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public Builder status(int value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder primaryTerm(@Nullable Long value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code result}
		 */
		public Builder result(@Nullable String value) {
			this.result = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder seqNo(@Nullable Long value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code _type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code forced_refresh}
		 */
		public Builder forcedRefresh(@Nullable Boolean value) {
			this.forcedRefresh = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public Builder get(@Nullable InlineGet<Map<String, JsonData>> value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public Builder get(
				Function<InlineGet.Builder<Map<String, JsonData>>, ObjectBuilder<InlineGet<Map<String, JsonData>>>> fn) {
			return this.get(fn.apply(new InlineGet.Builder<Map<String, JsonData>>()).build());
		}

		/**
		 * Builds a {@link ResponseItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResponseItem build() {

			return new ResponseItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResponseItem}
	 */
	public static final JsonpDeserializer<ResponseItem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ResponseItem::setupResponseItemDeserializer, Builder::build);

	protected static void setupResponseItemDeserializer(DelegatingDeserializer<ResponseItem.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(Builder::status, JsonpDeserializer.integerDeserializer(), "status");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::result, JsonpDeserializer.stringDeserializer(), "result");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(Builder::forcedRefresh, JsonpDeserializer.booleanDeserializer(), "forced_refresh");
		op.add(Builder::get,
				InlineGet.createInlineGetDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)),
				"get");

		op.setKey(Builder::operationType, OperationType._DESERIALIZER);

	}

}
