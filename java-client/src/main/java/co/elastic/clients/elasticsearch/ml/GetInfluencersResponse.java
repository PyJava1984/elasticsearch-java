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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_influencers.Response
@JsonpDeserializable
public final class GetInfluencersResponse implements JsonpSerializable {
	private final long count;

	private final List<BucketInfluencer> influencers;

	// ---------------------------------------------------------------------------------------------

	public GetInfluencersResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.influencers = ModelTypeHelper.unmodifiableNonNull(builder.influencers, "influencers");

	}

	public GetInfluencersResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Required - Array of influencer objects
	 * <p>
	 * API name: {@code influencers}
	 */
	public List<BucketInfluencer> influencers() {
		return this.influencers;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("influencers");
		generator.writeStartArray();
		for (BucketInfluencer item0 : this.influencers) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetInfluencersResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetInfluencersResponse> {
		private Long count;

		private List<BucketInfluencer> influencers;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 */
		public Builder influencers(List<BucketInfluencer> value) {
			this.influencers = value;
			return this;
		}

		/**
		 * Required - Array of influencer objects
		 * <p>
		 * API name: {@code influencers}
		 */
		public Builder influencers(BucketInfluencer... value) {
			this.influencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(BucketInfluencer value) {
			if (this.influencers == null) {
				this.influencers = new ArrayList<>();
			}
			this.influencers.add(value);
			return this;
		}

		/**
		 * Set {@link #influencers(List)} to a singleton list.
		 */
		public Builder influencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return this.influencers(fn.apply(new BucketInfluencer.Builder()).build());
		}

		/**
		 * Add a value to {@link #influencers(List)}, creating the list if needed.
		 */
		public Builder addInfluencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return this.addInfluencers(fn.apply(new BucketInfluencer.Builder()).build());
		}

		/**
		 * Builds a {@link GetInfluencersResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetInfluencersResponse build() {

			return new GetInfluencersResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetInfluencersResponse}
	 */
	public static final JsonpDeserializer<GetInfluencersResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetInfluencersResponse::setupGetInfluencersResponseDeserializer, Builder::build);

	protected static void setupGetInfluencersResponseDeserializer(
			DelegatingDeserializer<GetInfluencersResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::influencers, JsonpDeserializer.arrayDeserializer(BucketInfluencer._DESERIALIZER),
				"influencers");

	}

}
