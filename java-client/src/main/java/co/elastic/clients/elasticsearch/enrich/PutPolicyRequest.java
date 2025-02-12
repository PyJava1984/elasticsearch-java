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

package co.elastic.clients.elasticsearch.enrich;

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
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich.put_policy.Request
@JsonpDeserializable
public final class PutPolicyRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	@Nullable
	private final Policy geoMatch;

	@Nullable
	private final Policy match;

	// ---------------------------------------------------------------------------------------------

	public PutPolicyRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.geoMatch = builder.geoMatch;
		this.match = builder.match;

	}

	public PutPolicyRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The name of the enrich policy
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code geo_match}
	 */
	@Nullable
	public Policy geoMatch() {
		return this.geoMatch;
	}

	/**
	 * API name: {@code match}
	 */
	@Nullable
	public Policy match() {
		return this.match;
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

		if (this.geoMatch != null) {

			generator.writeKey("geo_match");
			this.geoMatch.serialize(generator, mapper);

		}
		if (this.match != null) {

			generator.writeKey("match");
			this.match.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPolicyRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutPolicyRequest> {
		private String name;

		@Nullable
		private Policy geoMatch;

		@Nullable
		private Policy match;

		/**
		 * Required - The name of the enrich policy
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code geo_match}
		 */
		public Builder geoMatch(@Nullable Policy value) {
			this.geoMatch = value;
			return this;
		}

		/**
		 * API name: {@code geo_match}
		 */
		public Builder geoMatch(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.geoMatch(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(@Nullable Policy value) {
			this.match = value;
			return this;
		}

		/**
		 * API name: {@code match}
		 */
		public Builder match(Function<Policy.Builder, ObjectBuilder<Policy>> fn) {
			return this.match(fn.apply(new Policy.Builder()).build());
		}

		/**
		 * Builds a {@link PutPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPolicyRequest build() {

			return new PutPolicyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutPolicyRequest}
	 */
	public static final JsonpDeserializer<PutPolicyRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutPolicyRequest::setupPutPolicyRequestDeserializer, Builder::build);

	protected static void setupPutPolicyRequestDeserializer(DelegatingDeserializer<PutPolicyRequest.Builder> op) {

		op.add(Builder::geoMatch, Policy._DESERIALIZER, "geo_match");
		op.add(Builder::match, Policy._DESERIALIZER, "match");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code enrich.put_policy}".
	 */
	public static final Endpoint<PutPolicyRequest, PutPolicyResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_enrich");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutPolicyResponse._DESERIALIZER);
}
