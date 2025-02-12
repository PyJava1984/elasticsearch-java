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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

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
import java.lang.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.DataframeClassificationSummaryRecall
@JsonpDeserializable
public final class DataframeClassificationSummaryRecall implements JsonpSerializable {
	private final List<DataframeEvaluationClass> classes;

	private final double avgRecall;

	// ---------------------------------------------------------------------------------------------

	public DataframeClassificationSummaryRecall(Builder builder) {

		this.classes = ModelTypeHelper.unmodifiableNonNull(builder.classes, "classes");
		this.avgRecall = Objects.requireNonNull(builder.avgRecall, "avg_recall");

	}

	public DataframeClassificationSummaryRecall(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code classes}
	 */
	public List<DataframeEvaluationClass> classes() {
		return this.classes;
	}

	/**
	 * Required - API name: {@code avg_recall}
	 */
	public double avgRecall() {
		return this.avgRecall;
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

		generator.writeKey("classes");
		generator.writeStartArray();
		for (DataframeEvaluationClass item0 : this.classes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("avg_recall");
		generator.write(this.avgRecall);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeClassificationSummaryRecall}.
	 */
	public static class Builder implements ObjectBuilder<DataframeClassificationSummaryRecall> {
		private List<DataframeEvaluationClass> classes;

		private Double avgRecall;

		/**
		 * Required - API name: {@code classes}
		 */
		public Builder classes(List<DataframeEvaluationClass> value) {
			this.classes = value;
			return this;
		}

		/**
		 * Required - API name: {@code classes}
		 */
		public Builder classes(DataframeEvaluationClass... value) {
			this.classes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(DataframeEvaluationClass value) {
			if (this.classes == null) {
				this.classes = new ArrayList<>();
			}
			this.classes.add(value);
			return this;
		}

		/**
		 * Set {@link #classes(List)} to a singleton list.
		 */
		public Builder classes(Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return this.classes(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * Add a value to {@link #classes(List)}, creating the list if needed.
		 */
		public Builder addClasses(
				Function<DataframeEvaluationClass.Builder, ObjectBuilder<DataframeEvaluationClass>> fn) {
			return this.addClasses(fn.apply(new DataframeEvaluationClass.Builder()).build());
		}

		/**
		 * Required - API name: {@code avg_recall}
		 */
		public Builder avgRecall(double value) {
			this.avgRecall = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeClassificationSummaryRecall}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeClassificationSummaryRecall build() {

			return new DataframeClassificationSummaryRecall(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeClassificationSummaryRecall}
	 */
	public static final JsonpDeserializer<DataframeClassificationSummaryRecall> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeClassificationSummaryRecall::setupDataframeClassificationSummaryRecallDeserializer,
					Builder::build);

	protected static void setupDataframeClassificationSummaryRecallDeserializer(
			DelegatingDeserializer<DataframeClassificationSummaryRecall.Builder> op) {

		op.add(Builder::classes, JsonpDeserializer.arrayDeserializer(DataframeEvaluationClass._DESERIALIZER),
				"classes");
		op.add(Builder::avgRecall, JsonpDeserializer.doubleDeserializer(), "avg_recall");

	}

}
