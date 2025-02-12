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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.invalidate_api_key.Response
@JsonpDeserializable
public final class InvalidateApiKeyResponse implements JsonpSerializable {
	private final int errorCount;

	@Nullable
	private final List<ErrorCause> errorDetails;

	private final List<String> invalidatedApiKeys;

	private final List<String> previouslyInvalidatedApiKeys;

	// ---------------------------------------------------------------------------------------------

	public InvalidateApiKeyResponse(Builder builder) {

		this.errorCount = Objects.requireNonNull(builder.errorCount, "error_count");
		this.errorDetails = ModelTypeHelper.unmodifiable(builder.errorDetails);
		this.invalidatedApiKeys = ModelTypeHelper.unmodifiableNonNull(builder.invalidatedApiKeys,
				"invalidated_api_keys");
		this.previouslyInvalidatedApiKeys = ModelTypeHelper.unmodifiableNonNull(builder.previouslyInvalidatedApiKeys,
				"previously_invalidated_api_keys");

	}

	public InvalidateApiKeyResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code error_count}
	 */
	public int errorCount() {
		return this.errorCount;
	}

	/**
	 * API name: {@code error_details}
	 */
	@Nullable
	public List<ErrorCause> errorDetails() {
		return this.errorDetails;
	}

	/**
	 * Required - API name: {@code invalidated_api_keys}
	 */
	public List<String> invalidatedApiKeys() {
		return this.invalidatedApiKeys;
	}

	/**
	 * Required - API name: {@code previously_invalidated_api_keys}
	 */
	public List<String> previouslyInvalidatedApiKeys() {
		return this.previouslyInvalidatedApiKeys;
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

		generator.writeKey("error_count");
		generator.write(this.errorCount);

		if (this.errorDetails != null) {

			generator.writeKey("error_details");
			generator.writeStartArray();
			for (ErrorCause item0 : this.errorDetails) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("invalidated_api_keys");
		generator.writeStartArray();
		for (String item0 : this.invalidatedApiKeys) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("previously_invalidated_api_keys");
		generator.writeStartArray();
		for (String item0 : this.previouslyInvalidatedApiKeys) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateApiKeyResponse}.
	 */
	public static class Builder implements ObjectBuilder<InvalidateApiKeyResponse> {
		private Integer errorCount;

		@Nullable
		private List<ErrorCause> errorDetails;

		private List<String> invalidatedApiKeys;

		private List<String> previouslyInvalidatedApiKeys;

		/**
		 * Required - API name: {@code error_count}
		 */
		public Builder errorCount(int value) {
			this.errorCount = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public Builder errorDetails(@Nullable List<ErrorCause> value) {
			this.errorDetails = value;
			return this;
		}

		/**
		 * API name: {@code error_details}
		 */
		public Builder errorDetails(ErrorCause... value) {
			this.errorDetails = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #errorDetails(List)}, creating the list if needed.
		 */
		public Builder addErrorDetails(ErrorCause value) {
			if (this.errorDetails == null) {
				this.errorDetails = new ArrayList<>();
			}
			this.errorDetails.add(value);
			return this;
		}

		/**
		 * Set {@link #errorDetails(List)} to a singleton list.
		 */
		public Builder errorDetails(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.errorDetails(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #errorDetails(List)}, creating the list if needed.
		 */
		public Builder addErrorDetails(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addErrorDetails(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Required - API name: {@code invalidated_api_keys}
		 */
		public Builder invalidatedApiKeys(List<String> value) {
			this.invalidatedApiKeys = value;
			return this;
		}

		/**
		 * Required - API name: {@code invalidated_api_keys}
		 */
		public Builder invalidatedApiKeys(String... value) {
			this.invalidatedApiKeys = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #invalidatedApiKeys(List)}, creating the list if
		 * needed.
		 */
		public Builder addInvalidatedApiKeys(String value) {
			if (this.invalidatedApiKeys == null) {
				this.invalidatedApiKeys = new ArrayList<>();
			}
			this.invalidatedApiKeys.add(value);
			return this;
		}

		/**
		 * Required - API name: {@code previously_invalidated_api_keys}
		 */
		public Builder previouslyInvalidatedApiKeys(List<String> value) {
			this.previouslyInvalidatedApiKeys = value;
			return this;
		}

		/**
		 * Required - API name: {@code previously_invalidated_api_keys}
		 */
		public Builder previouslyInvalidatedApiKeys(String... value) {
			this.previouslyInvalidatedApiKeys = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #previouslyInvalidatedApiKeys(List)}, creating the list
		 * if needed.
		 */
		public Builder addPreviouslyInvalidatedApiKeys(String value) {
			if (this.previouslyInvalidatedApiKeys == null) {
				this.previouslyInvalidatedApiKeys = new ArrayList<>();
			}
			this.previouslyInvalidatedApiKeys.add(value);
			return this;
		}

		/**
		 * Builds a {@link InvalidateApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateApiKeyResponse build() {

			return new InvalidateApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvalidateApiKeyResponse}
	 */
	public static final JsonpDeserializer<InvalidateApiKeyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InvalidateApiKeyResponse::setupInvalidateApiKeyResponseDeserializer, Builder::build);

	protected static void setupInvalidateApiKeyResponseDeserializer(
			DelegatingDeserializer<InvalidateApiKeyResponse.Builder> op) {

		op.add(Builder::errorCount, JsonpDeserializer.integerDeserializer(), "error_count");
		op.add(Builder::errorDetails, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "error_details");
		op.add(Builder::invalidatedApiKeys, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"invalidated_api_keys");
		op.add(Builder::previouslyInvalidatedApiKeys,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"previously_invalidated_api_keys");

	}

}
