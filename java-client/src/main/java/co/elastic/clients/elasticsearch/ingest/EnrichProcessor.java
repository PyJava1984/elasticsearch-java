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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch._types.GeoShapeRelation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.EnrichProcessor
@JsonpDeserializable
public final class EnrichProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean ignoreMissing;

	@Nullable
	private final Integer maxMatches;

	@Nullable
	private final Boolean override;

	private final String policyName;

	@Nullable
	private final GeoShapeRelation shapeRelation;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	public EnrichProcessor(Builder builder) {
		super(builder);

		this.field = Objects.requireNonNull(builder.field, "field");
		this.ignoreMissing = builder.ignoreMissing;
		this.maxMatches = builder.maxMatches;
		this.override = builder.override;
		this.policyName = Objects.requireNonNull(builder.policyName, "policy_name");
		this.shapeRelation = builder.shapeRelation;
		this.targetField = Objects.requireNonNull(builder.targetField, "target_field");

	}

	public EnrichProcessor(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "enrich";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code max_matches}
	 */
	@Nullable
	public Integer maxMatches() {
		return this.maxMatches;
	}

	/**
	 * API name: {@code override}
	 */
	@Nullable
	public Boolean override() {
		return this.override;
	}

	/**
	 * Required - API name: {@code policy_name}
	 */
	public String policyName() {
		return this.policyName;
	}

	/**
	 * API name: {@code shape_relation}
	 */
	@Nullable
	public GeoShapeRelation shapeRelation() {
		return this.shapeRelation;
	}

	/**
	 * Required - API name: {@code target_field}
	 */
	public String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreMissing != null) {

			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (this.maxMatches != null) {

			generator.writeKey("max_matches");
			generator.write(this.maxMatches);

		}
		if (this.override != null) {

			generator.writeKey("override");
			generator.write(this.override);

		}

		generator.writeKey("policy_name");
		generator.write(this.policyName);

		if (this.shapeRelation != null) {

			generator.writeKey("shape_relation");
			this.shapeRelation.serialize(generator, mapper);
		}

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<EnrichProcessor> {
		private String field;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private Integer maxMatches;

		@Nullable
		private Boolean override;

		private String policyName;

		@Nullable
		private GeoShapeRelation shapeRelation;

		private String targetField;

		/**
		 * Required - API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code max_matches}
		 */
		public Builder maxMatches(@Nullable Integer value) {
			this.maxMatches = value;
			return this;
		}

		/**
		 * API name: {@code override}
		 */
		public Builder override(@Nullable Boolean value) {
			this.override = value;
			return this;
		}

		/**
		 * Required - API name: {@code policy_name}
		 */
		public Builder policyName(String value) {
			this.policyName = value;
			return this;
		}

		/**
		 * API name: {@code shape_relation}
		 */
		public Builder shapeRelation(@Nullable GeoShapeRelation value) {
			this.shapeRelation = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_field}
		 */
		public Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrichProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrichProcessor build() {

			return new EnrichProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrichProcessor}
	 */
	public static final JsonpDeserializer<EnrichProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EnrichProcessor::setupEnrichProcessorDeserializer, Builder::build);

	protected static void setupEnrichProcessorDeserializer(DelegatingDeserializer<EnrichProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::maxMatches, JsonpDeserializer.integerDeserializer(), "max_matches");
		op.add(Builder::override, JsonpDeserializer.booleanDeserializer(), "override");
		op.add(Builder::policyName, JsonpDeserializer.stringDeserializer(), "policy_name");
		op.add(Builder::shapeRelation, GeoShapeRelation._DESERIALIZER, "shape_relation");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
