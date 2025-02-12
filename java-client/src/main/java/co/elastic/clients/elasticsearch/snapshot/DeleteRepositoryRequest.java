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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: snapshot.delete_repository.Request

public final class DeleteRepositoryRequest extends RequestBase {
	private final List<String> repository;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public DeleteRepositoryRequest(Builder builder) {

		this.repository = ModelTypeHelper.unmodifiableNonNull(builder.repository, "repository");
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;

	}

	public DeleteRepositoryRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Name of the snapshot repository to unregister. Wildcard
	 * (<code>*</code>) patterns are supported.
	 * <p>
	 * API name: {@code repository}
	 */
	public List<String> repository() {
		return this.repository;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRepositoryRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteRepositoryRequest> {
		private List<String> repository;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		/**
		 * Required - Name of the snapshot repository to unregister. Wildcard
		 * (<code>*</code>) patterns are supported.
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(List<String> value) {
			this.repository = value;
			return this;
		}

		/**
		 * Required - Name of the snapshot repository to unregister. Wildcard
		 * (<code>*</code>) patterns are supported.
		 * <p>
		 * API name: {@code repository}
		 */
		public Builder repository(String... value) {
			this.repository = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #repository(List)}, creating the list if needed.
		 */
		public Builder addRepository(String value) {
			if (this.repository == null) {
				this.repository = new ArrayList<>();
			}
			this.repository.add(value);
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteRepositoryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRepositoryRequest build() {

			return new DeleteRepositoryRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code snapshot.delete_repository}".
	 */
	public static final Endpoint<DeleteRepositoryRequest, DeleteRepositoryResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;

				int propsSet = 0;

				propsSet |= _repository;

				if (propsSet == (_repository)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_snapshot");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
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

			}, SimpleEndpoint.emptyMap(), false, DeleteRepositoryResponse._DESERIALIZER);
}
