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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.delete_trained_model.Response
@JsonpDeserializable
public final class DeleteTrainedModelResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	public DeleteTrainedModelResponse(Builder builder) {
		super(builder);

	}

	public DeleteTrainedModelResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTrainedModelResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteTrainedModelResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteTrainedModelResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTrainedModelResponse build() {

			return new DeleteTrainedModelResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteTrainedModelResponse}
	 */
	public static final JsonpDeserializer<DeleteTrainedModelResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, DeleteTrainedModelResponse::setupDeleteTrainedModelResponseDeserializer, Builder::build);

	protected static void setupDeleteTrainedModelResponseDeserializer(
			DelegatingDeserializer<DeleteTrainedModelResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}
