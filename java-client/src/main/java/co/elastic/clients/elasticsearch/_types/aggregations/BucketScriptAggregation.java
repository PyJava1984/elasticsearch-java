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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.BucketScriptAggregation
@JsonpDeserializable
public final class BucketScriptAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final JsonValue /* _types.Script */ script;

	// ---------------------------------------------------------------------------------------------

	public BucketScriptAggregation(Builder builder) {
		super(builder);

		this.script = builder.script;

	}

	public BucketScriptAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "bucket_script";
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketScriptAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BucketScriptAggregation> {
		@Nullable
		private JsonValue /* _types.Script */ script;

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BucketScriptAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketScriptAggregation build() {

			return new BucketScriptAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketScriptAggregation}
	 */
	public static final JsonpDeserializer<BucketScriptAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BucketScriptAggregation::setupBucketScriptAggregationDeserializer, Builder::build);

	protected static void setupBucketScriptAggregationDeserializer(
			DelegatingDeserializer<BucketScriptAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");

	}

}
