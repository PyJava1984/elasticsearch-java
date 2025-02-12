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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.elasticsearch.core.search.HitsMetadata;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.search_template.Response

public final class SearchTemplateResponse<TDocument> implements JsonpSerializable {
	private final ShardStatistics shards;

	private final boolean timedOut;

	private final int took;

	private final HitsMetadata<TDocument> hits;

	@Nullable
	private final JsonpSerializer<TDocument> tDocumentSerializer;

	// ---------------------------------------------------------------------------------------------

	public SearchTemplateResponse(Builder<TDocument> builder) {

		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this.took = Objects.requireNonNull(builder.took, "took");
		this.hits = Objects.requireNonNull(builder.hits, "hits");
		this.tDocumentSerializer = builder.tDocumentSerializer;

	}

	public SearchTemplateResponse(Function<Builder<TDocument>, Builder<TDocument>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * Required - API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code timed_out}
	 */
	public boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public int took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public HitsMetadata<TDocument> hits() {
		return this.hits;
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

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("took");
		generator.write(this.took);

		generator.writeKey("hits");
		this.hits.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchTemplateResponse}.
	 */
	public static class Builder<TDocument> implements ObjectBuilder<SearchTemplateResponse<TDocument>> {
		private ShardStatistics shards;

		private Boolean timedOut;

		private Integer took;

		private HitsMetadata<TDocument> hits;

		@Nullable
		private JsonpSerializer<TDocument> tDocumentSerializer;

		/**
		 * Required - API name: {@code _shards}
		 */
		public Builder<TDocument> shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code _shards}
		 */
		public Builder<TDocument> shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code timed_out}
		 */
		public Builder<TDocument> timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * Required - API name: {@code took}
		 */
		public Builder<TDocument> took(int value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public Builder<TDocument> hits(HitsMetadata<TDocument> value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public Builder<TDocument> hits(
				Function<HitsMetadata.Builder<TDocument>, ObjectBuilder<HitsMetadata<TDocument>>> fn) {
			return this.hits(fn.apply(new HitsMetadata.Builder<TDocument>()).build());
		}

		/**
		 * Serializer for TDocument. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TDocument> tDocumentSerializer(@Nullable JsonpSerializer<TDocument> value) {
			this.tDocumentSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link SearchTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchTemplateResponse<TDocument> build() {

			return new SearchTemplateResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for SearchTemplateResponse
	 */
	public static <TDocument> JsonpDeserializer<SearchTemplateResponse<TDocument>> createSearchTemplateResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> SearchTemplateResponse.setupSearchTemplateResponseDeserializer(op, tDocumentDeserializer));
	};

	protected static <TDocument> void setupSearchTemplateResponseDeserializer(
			DelegatingDeserializer<SearchTemplateResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {

		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::took, JsonpDeserializer.integerDeserializer(), "took");
		op.add(Builder::hits, HitsMetadata.createHitsMetadataDeserializer(tDocumentDeserializer), "hits");

	}

}
