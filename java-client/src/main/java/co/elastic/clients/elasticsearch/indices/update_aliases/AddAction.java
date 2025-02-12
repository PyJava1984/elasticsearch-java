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

package co.elastic.clients.elasticsearch.indices.update_aliases;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.update_aliases.AddAction
@JsonpDeserializable
public final class AddAction implements ActionVariant, JsonpSerializable {
	@Nullable
	private final String alias;

	@Nullable
	private final List<String> aliases;

	@Nullable
	private final Query filter;

	@Nullable
	private final String index;

	@Nullable
	private final List<String> indices;

	@Nullable
	private final String indexRouting;

	@Nullable
	private final Boolean isHidden;

	@Nullable
	private final Boolean isWriteIndex;

	@Nullable
	private final String routing;

	@Nullable
	private final String searchRouting;

	// ---------------------------------------------------------------------------------------------

	public AddAction(Builder builder) {

		this.alias = builder.alias;
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.filter = builder.filter;
		this.index = builder.index;
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.indexRouting = builder.indexRouting;
		this.isHidden = builder.isHidden;
		this.isWriteIndex = builder.isWriteIndex;
		this.routing = builder.routing;
		this.searchRouting = builder.searchRouting;

	}

	public AddAction(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Action} variant type
	 */
	@Override
	public String _variantType() {
		return "add";
	}

	/**
	 * API name: {@code alias}
	 */
	@Nullable
	public String alias() {
		return this.alias;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public List<String> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Query filter() {
		return this.filter;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code index_routing}
	 */
	@Nullable
	public String indexRouting() {
		return this.indexRouting;
	}

	/**
	 * API name: {@code is_hidden}
	 */
	@Nullable
	public Boolean isHidden() {
		return this.isHidden;
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

		if (this.alias != null) {

			generator.writeKey("alias");
			generator.write(this.alias);

		}
		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartArray();
			for (String item0 : this.aliases) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.indexRouting != null) {

			generator.writeKey("index_routing");
			generator.write(this.indexRouting);

		}
		if (this.isHidden != null) {

			generator.writeKey("is_hidden");
			generator.write(this.isHidden);

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
	 * Builder for {@link AddAction}.
	 */
	public static class Builder implements ObjectBuilder<AddAction> {
		@Nullable
		private String alias;

		@Nullable
		private List<String> aliases;

		@Nullable
		private Query filter;

		@Nullable
		private String index;

		@Nullable
		private List<String> indices;

		@Nullable
		private String indexRouting;

		@Nullable
		private Boolean isHidden;

		@Nullable
		private Boolean isWriteIndex;

		@Nullable
		private String routing;

		@Nullable
		private String searchRouting;

		/**
		 * API name: {@code alias}
		 */
		public Builder alias(@Nullable String value) {
			this.alias = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable List<String> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(String... value) {
			this.aliases = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #aliases(List)}, creating the list if needed.
		 */
		public Builder addAliases(String value) {
			if (this.aliases == null) {
				this.aliases = new ArrayList<>();
			}
			this.aliases.add(value);
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
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code index_routing}
		 */
		public Builder indexRouting(@Nullable String value) {
			this.indexRouting = value;
			return this;
		}

		/**
		 * API name: {@code is_hidden}
		 */
		public Builder isHidden(@Nullable Boolean value) {
			this.isHidden = value;
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
		 * Builds a {@link AddAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AddAction build() {

			return new AddAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AddAction}
	 */
	public static final JsonpDeserializer<AddAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AddAction::setupAddActionDeserializer, Builder::build);

	protected static void setupAddActionDeserializer(DelegatingDeserializer<AddAction.Builder> op) {

		op.add(Builder::alias, JsonpDeserializer.stringDeserializer(), "alias");
		op.add(Builder::aliases, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"aliases");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indexRouting, JsonpDeserializer.stringDeserializer(), "index_routing");
		op.add(Builder::isHidden, JsonpDeserializer.booleanDeserializer(), "is_hidden");
		op.add(Builder::isWriteIndex, JsonpDeserializer.booleanDeserializer(), "is_write_index");
		op.add(Builder::routing, JsonpDeserializer.stringDeserializer(), "routing");
		op.add(Builder::searchRouting, JsonpDeserializer.stringDeserializer(), "search_routing");

	}

}
