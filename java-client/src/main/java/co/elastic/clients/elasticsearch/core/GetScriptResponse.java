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

import co.elastic.clients.elasticsearch._types.StoredScript;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.get_script.Response
@JsonpDeserializable
public final class GetScriptResponse implements JsonpSerializable {
	private final String id;

	private final boolean found;

	@Nullable
	private final StoredScript script;

	// ---------------------------------------------------------------------------------------------

	public GetScriptResponse(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "_id");
		this.found = Objects.requireNonNull(builder.found, "found");
		this.script = builder.script;

	}

	public GetScriptResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public StoredScript script() {
		return this.script;
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

		generator.writeKey("found");
		generator.write(this.found);

		if (this.script != null) {

			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetScriptResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetScriptResponse> {
		private String id;

		private Boolean found;

		@Nullable
		private StoredScript script;

		/**
		 * Required - API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code found}
		 */
		public Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable StoredScript value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(Function<StoredScript.Builder, ObjectBuilder<StoredScript>> fn) {
			return this.script(fn.apply(new StoredScript.Builder()).build());
		}

		/**
		 * Builds a {@link GetScriptResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetScriptResponse build() {

			return new GetScriptResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetScriptResponse}
	 */
	public static final JsonpDeserializer<GetScriptResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetScriptResponse::setupGetScriptResponseDeserializer, Builder::build);

	protected static void setupGetScriptResponseDeserializer(DelegatingDeserializer<GetScriptResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::script, StoredScript._DESERIALIZER, "script");

	}

}
