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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.WriteResponseBase

public abstract class WriteResponseBase implements JsonpSerializable {
	private final String id;

	private final String index;

	private final long primaryTerm;

	private final Result result;

	private final long seqNo;

	private final ShardStatistics shards;

	@Nullable
	private final String type;

	private final long version;

	@Nullable
	private final Boolean forcedRefresh;

	// ---------------------------------------------------------------------------------------------

	public WriteResponseBase(AbstractBuilder<?> builder) {

		this.id = Objects.requireNonNull(builder.id, "_id");
		this.index = Objects.requireNonNull(builder.index, "_index");
		this.primaryTerm = Objects.requireNonNull(builder.primaryTerm, "_primary_term");
		this.result = Objects.requireNonNull(builder.result, "result");
		this.seqNo = Objects.requireNonNull(builder.seqNo, "_seq_no");
		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.type = builder.type;
		this.version = Objects.requireNonNull(builder.version, "_version");
		this.forcedRefresh = builder.forcedRefresh;

	}

	/**
	 * Required - API name: {@code _id}
	 */
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
	 * Required - API name: {@code _primary_term}
	 */
	public long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * Required - API name: {@code result}
	 */
	public Result result() {
		return this.result;
	}

	/**
	 * Required - API name: {@code _seq_no}
	 */
	public long seqNo() {
		return this.seqNo;
	}

	/**
	 * Required - API name: {@code _shards}
	 */
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
	 * Required - API name: {@code _version}
	 */
	public long version() {
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_index");
		generator.write(this.index);

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm);

		generator.writeKey("result");
		this.result.serialize(generator, mapper);

		generator.writeKey("_seq_no");
		generator.write(this.seqNo);

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		if (this.type != null) {

			generator.writeKey("_type");
			generator.write(this.type);

		}

		generator.writeKey("_version");
		generator.write(this.version);

		if (this.forcedRefresh != null) {

			generator.writeKey("forced_refresh");
			generator.write(this.forcedRefresh);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String id;

		private String index;

		private Long primaryTerm;

		private Result result;

		private Long seqNo;

		private ShardStatistics shards;

		@Nullable
		private String type;

		private Long version;

		@Nullable
		private Boolean forcedRefresh;

		/**
		 * Required - API name: {@code _id}
		 */
		public BuilderT id(String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code _index}
		 */
		public BuilderT index(String value) {
			this.index = value;
			return self();
		}

		/**
		 * Required - API name: {@code _primary_term}
		 */
		public BuilderT primaryTerm(long value) {
			this.primaryTerm = value;
			return self();
		}

		/**
		 * Required - API name: {@code result}
		 */
		public BuilderT result(Result value) {
			this.result = value;
			return self();
		}

		/**
		 * Required - API name: {@code _seq_no}
		 */
		public BuilderT seqNo(long value) {
			this.seqNo = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public BuilderT shards(ShardStatistics value) {
			this.shards = value;
			return self();
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public BuilderT shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code _type}
		 */
		public BuilderT type(@Nullable String value) {
			this.type = value;
			return self();
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public BuilderT version(long value) {
			this.version = value;
			return self();
		}

		/**
		 * API name: {@code forced_refresh}
		 */
		public BuilderT forcedRefresh(@Nullable Boolean value) {
			this.forcedRefresh = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteResponseBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(AbstractBuilder::index, JsonpDeserializer.stringDeserializer(), "_index");
		op.add(AbstractBuilder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(AbstractBuilder::result, Result._DESERIALIZER, "result");
		op.add(AbstractBuilder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(AbstractBuilder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(AbstractBuilder::type, JsonpDeserializer.stringDeserializer(), "_type");
		op.add(AbstractBuilder::version, JsonpDeserializer.longDeserializer(), "_version");
		op.add(AbstractBuilder::forcedRefresh, JsonpDeserializer.booleanDeserializer(), "forced_refresh");

	}

}
