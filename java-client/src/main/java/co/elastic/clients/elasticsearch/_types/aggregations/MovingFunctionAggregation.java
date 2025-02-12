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
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.MovingFunctionAggregation
@JsonpDeserializable
public final class MovingFunctionAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final String script;

	@Nullable
	private final Integer shift;

	@Nullable
	private final Integer window;

	// ---------------------------------------------------------------------------------------------

	public MovingFunctionAggregation(Builder builder) {
		super(builder);

		this.script = builder.script;
		this.shift = builder.shift;
		this.window = builder.window;

	}

	public MovingFunctionAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "moving_fn";
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public String script() {
		return this.script;
	}

	/**
	 * API name: {@code shift}
	 */
	@Nullable
	public Integer shift() {
		return this.shift;
	}

	/**
	 * API name: {@code window}
	 */
	@Nullable
	public Integer window() {
		return this.window;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.shift != null) {

			generator.writeKey("shift");
			generator.write(this.shift);

		}
		if (this.window != null) {

			generator.writeKey("window");
			generator.write(this.window);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MovingFunctionAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MovingFunctionAggregation> {
		@Nullable
		private String script;

		@Nullable
		private Integer shift;

		@Nullable
		private Integer window;

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable String value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code shift}
		 */
		public Builder shift(@Nullable Integer value) {
			this.shift = value;
			return this;
		}

		/**
		 * API name: {@code window}
		 */
		public Builder window(@Nullable Integer value) {
			this.window = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MovingFunctionAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MovingFunctionAggregation build() {

			return new MovingFunctionAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MovingFunctionAggregation}
	 */
	public static final JsonpDeserializer<MovingFunctionAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MovingFunctionAggregation::setupMovingFunctionAggregationDeserializer, Builder::build);

	protected static void setupMovingFunctionAggregationDeserializer(
			DelegatingDeserializer<MovingFunctionAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::script, JsonpDeserializer.stringDeserializer(), "script");
		op.add(Builder::shift, JsonpDeserializer.integerDeserializer(), "shift");
		op.add(Builder::window, JsonpDeserializer.integerDeserializer(), "window");

	}

}
