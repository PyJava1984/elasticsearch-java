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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
import co.elastic.clients.elasticsearch.indices.AliasDefinition;
import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.elasticsearch.indices.IndexState;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.put_component_template.Request
@JsonpDeserializable
public final class PutComponentTemplateRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	@Nullable
	private final Boolean create;

	@Nullable
	private final String masterTimeout;

	private final IndexState template;

	@Nullable
	private final Map<String, AliasDefinition> aliases;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final IndexSettings settings;

	@Nullable
	private final Long version;

	@Nullable
	private final Map<String, JsonData> meta;

	// ---------------------------------------------------------------------------------------------

	public PutComponentTemplateRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.create = builder.create;
		this.masterTimeout = builder.masterTimeout;
		this.template = Objects.requireNonNull(builder.template, "template");
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.mappings = builder.mappings;
		this.settings = builder.settings;
		this.version = builder.version;
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);

	}

	public PutComponentTemplateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The name of the template
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Whether the index template should only be added if new or can also replace an
	 * existing one
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public Boolean create() {
		return this.create;
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
	 * Required - API name: {@code template}
	 */
	public IndexState template() {
		return this.template;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, AliasDefinition> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public IndexSettings settings() {
		return this.settings;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonData> meta() {
		return this.meta;
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

		generator.writeKey("template");
		this.template.serialize(generator, mapper);

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, AliasDefinition> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.mappings != null) {

			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutComponentTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutComponentTemplateRequest> {
		private String name;

		@Nullable
		private Boolean create;

		@Nullable
		private String masterTimeout;

		private IndexState template;

		@Nullable
		private Map<String, AliasDefinition> aliases;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private IndexSettings settings;

		@Nullable
		private Long version;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * Required - The name of the template
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Whether the index template should only be added if new or can also replace an
		 * existing one
		 * <p>
		 * API name: {@code create}
		 */
		public Builder create(@Nullable Boolean value) {
			this.create = value;
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
		 * Required - API name: {@code template}
		 */
		public Builder template(IndexState value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - API name: {@code template}
		 */
		public Builder template(Function<IndexState.Builder, ObjectBuilder<IndexState>> fn) {
			return this.template(fn.apply(new IndexState.Builder()).build());
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable Map<String, AliasDefinition> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, AliasDefinition value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new AliasDefinition.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<AliasDefinition.Builder, ObjectBuilder<AliasDefinition>> fn) {
			return this.putAliases(key, fn.apply(new AliasDefinition.Builder()).build());
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonData value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link PutComponentTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutComponentTemplateRequest build() {

			return new PutComponentTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutComponentTemplateRequest}
	 */
	public static final JsonpDeserializer<PutComponentTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, PutComponentTemplateRequest::setupPutComponentTemplateRequestDeserializer, Builder::build);

	protected static void setupPutComponentTemplateRequestDeserializer(
			DelegatingDeserializer<PutComponentTemplateRequest.Builder> op) {

		op.add(Builder::template, IndexState._DESERIALIZER, "template");
		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(AliasDefinition._DESERIALIZER), "aliases");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::settings, IndexSettings._DESERIALIZER, "settings");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.put_component_template}".
	 */
	public static final Endpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_component_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutComponentTemplateResponse._DESERIALIZER);
}
