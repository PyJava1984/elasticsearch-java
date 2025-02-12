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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeEvaluationClassificationMetrics
@JsonpDeserializable
public final class DataframeEvaluationClassificationMetrics extends DataframeEvaluationMetrics {
	@Nullable
	private final Map<String, JsonData> accuracy;

	@Nullable
	private final Map<String, JsonData> multiclassConfusionMatrix;

	// ---------------------------------------------------------------------------------------------

	public DataframeEvaluationClassificationMetrics(Builder builder) {
		super(builder);

		this.accuracy = ModelTypeHelper.unmodifiable(builder.accuracy);
		this.multiclassConfusionMatrix = ModelTypeHelper.unmodifiable(builder.multiclassConfusionMatrix);

	}

	public DataframeEvaluationClassificationMetrics(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Accuracy of predictions (per-class and overall).
	 * <p>
	 * API name: {@code accuracy}
	 */
	@Nullable
	public Map<String, JsonData> accuracy() {
		return this.accuracy;
	}

	/**
	 * Multiclass confusion matrix.
	 * <p>
	 * API name: {@code multiclass_confusion_matrix}
	 */
	@Nullable
	public Map<String, JsonData> multiclassConfusionMatrix() {
		return this.multiclassConfusionMatrix;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.accuracy != null) {

			generator.writeKey("accuracy");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.accuracy.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.multiclassConfusionMatrix != null) {

			generator.writeKey("multiclass_confusion_matrix");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.multiclassConfusionMatrix.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeEvaluationClassificationMetrics}.
	 */
	public static class Builder extends DataframeEvaluationMetrics.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DataframeEvaluationClassificationMetrics> {
		@Nullable
		private Map<String, JsonData> accuracy;

		@Nullable
		private Map<String, JsonData> multiclassConfusionMatrix;

		/**
		 * Accuracy of predictions (per-class and overall).
		 * <p>
		 * API name: {@code accuracy}
		 */
		public Builder accuracy(@Nullable Map<String, JsonData> value) {
			this.accuracy = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #accuracy(Map)}, creating the map if needed.
		 */
		public Builder putAccuracy(String key, JsonData value) {
			if (this.accuracy == null) {
				this.accuracy = new HashMap<>();
			}
			this.accuracy.put(key, value);
			return this;
		}

		/**
		 * Multiclass confusion matrix.
		 * <p>
		 * API name: {@code multiclass_confusion_matrix}
		 */
		public Builder multiclassConfusionMatrix(@Nullable Map<String, JsonData> value) {
			this.multiclassConfusionMatrix = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #multiclassConfusionMatrix(Map)}, creating the map
		 * if needed.
		 */
		public Builder putMulticlassConfusionMatrix(String key, JsonData value) {
			if (this.multiclassConfusionMatrix == null) {
				this.multiclassConfusionMatrix = new HashMap<>();
			}
			this.multiclassConfusionMatrix.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeEvaluationClassificationMetrics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeEvaluationClassificationMetrics build() {

			return new DataframeEvaluationClassificationMetrics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeEvaluationClassificationMetrics}
	 */
	public static final JsonpDeserializer<DataframeEvaluationClassificationMetrics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeEvaluationClassificationMetrics::setupDataframeEvaluationClassificationMetricsDeserializer,
					Builder::build);

	protected static void setupDataframeEvaluationClassificationMetricsDeserializer(
			DelegatingDeserializer<DataframeEvaluationClassificationMetrics.Builder> op) {
		DataframeEvaluationMetrics.setupDataframeEvaluationMetricsDeserializer(op);
		op.add(Builder::accuracy, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "accuracy");
		op.add(Builder::multiclassConfusionMatrix, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"multiclass_confusion_matrix");

	}

}
