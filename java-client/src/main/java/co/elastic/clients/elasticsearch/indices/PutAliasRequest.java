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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.put_alias.Request
@JsonpDeserializable
public final class PutAliasRequest extends RequestBase implements JsonpSerializable {
	private final List<String> index;

	private final String name;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	@Nullable
	private final Query filter;

	@Nullable
	private final String indexRouting;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final String routing;

	@Nullable
	private final String searchRouting;

	// ---------------------------------------------------------------------------------------------

	public PutAliasRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiableNonNull(builder.index, "index");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.filter = builder.filter;
		this.indexRouting = builder.indexRouting;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;

	}

	public PutAliasRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - A comma-separated list of index names the alias should point to
	 * (supports wildcards); use <code>_all</code> to perform the operation on all
	 * indices.
	 * <p>
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * Required - The name of the alias to be created or updated
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Explicit timestamp for the document
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Query filter() {
		return this.filter;
	}

	/**
	 * API name: {@code index_routing}
	 */
	@Nullable
	public String indexRouting() {
		return this.indexRouting;
	}

	/**
	 * API name: {@code is_write_index}
	 */
	@Nullable
	public Boolean isWriteIndex() {
		return this.isWriteIndex;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search_routing}
	 */
	@Nullable
	public String searchRouting() {
		return this.searchRouting;
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

		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.indexRouting != null) {

			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

		}
		if (this.isWriteIndex != null) {

			generator.writeKey("is_write_index");
			generator.write(this.isWriteIndex);

		}
		if (this.routing != null) {

			generator.writeKey("routing");
			generator.write(this.routing);

		}
		if (this.searchRouting != null) {

			generator.writeKey("search_routing");
			generator.write(this.searchRouting);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAliasRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutAliasRequest> {
		private List<String> index;

		private String name;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		@Nullable
		private Query filter;

		@Nullable
		private String indexRouting;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private String routing;

		@Nullable
		private String searchRouting;

		/**
		 * Required - A comma-separated list of index names the alias should point to
		 * (supports wildcards); use <code>_all</code> to perform the operation on all
		 * indices.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names the alias should point to
		 * (supports wildcards); use <code>_all</code> to perform the operation on all
		 * indices.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Required - The name of the alias to be created or updated
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit timestamp for the document
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code index_routing}
		 */
		public Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * API name: {@code is_write_index}
		 */
		public Builder isWriteIndex(@Nullable Boolean value) {
			this.isWriteIndex = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code search_routing}
		 */
		public Builder searchRouting(@Nullable String value) {
			this.searchRouting = value;
			return this;
		}

		/**
		 * Builds a {@link PutAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAliasRequest build() {

			return new PutAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutAliasRequest}
	 */
	public static final JsonpDeserializer<PutAliasRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutAliasRequest::setupPutAliasRequestDeserializer, Builder::build);

	protected static void setupPutAliasRequestDeserializer(DelegatingDeserializer<PutAliasRequest.Builder> op) {

		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.put_alias}".
	 */
	public static final Endpoint<PutAliasRequest, PutAliasResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _name = 1 << 1;

				int propsSet = 0;

				propsSet |= _index;
				propsSet |= _name;

				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_alias");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_aliases");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutAliasResponse._DESERIALIZER);
}
