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

package co.elastic.clients.elasticsearch.autoscaling;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the autoscaling namespace.
 */
public class ElasticsearchAutoscalingClient extends ApiClient {

	public ElasticsearchAutoscalingClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: autoscaling.delete_autoscaling_policy

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAutoscalingPolicyResponse deleteAutoscalingPolicy(DeleteAutoscalingPolicyRequest request)
			throws IOException {
		return this.transport.performRequest(request, DeleteAutoscalingPolicyRequest.ENDPOINT);
	}

	/**
	 * Deletes an autoscaling policy. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-delete-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAutoscalingPolicyResponse deleteAutoscalingPolicy(
			Function<DeleteAutoscalingPolicyRequest.Builder, ObjectBuilder<DeleteAutoscalingPolicyRequest>> fn)
			throws IOException {
		return deleteAutoscalingPolicy(fn.apply(new DeleteAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.get_autoscaling_capacity

	/**
	 * Gets the current autoscaling capacity based on the configured autoscaling
	 * policy. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-capacity.html">Documentation
	 *      on elastic.co</a>
	 */
	public GetAutoscalingCapacityResponse getAutoscalingCapacity() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetAutoscalingCapacityRequest._INSTANCE,
				GetAutoscalingCapacityRequest.ENDPOINT);
	}

	// ----- Endpoint: autoscaling.get_autoscaling_policy

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAutoscalingPolicyResponse getAutoscalingPolicy(GetAutoscalingPolicyRequest request) throws IOException {
		return this.transport.performRequest(request, GetAutoscalingPolicyRequest.ENDPOINT);
	}

	/**
	 * Retrieves an autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-get-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAutoscalingPolicyResponse getAutoscalingPolicy(
			Function<GetAutoscalingPolicyRequest.Builder, ObjectBuilder<GetAutoscalingPolicyRequest>> fn)
			throws IOException {
		return getAutoscalingPolicy(fn.apply(new GetAutoscalingPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: autoscaling.put_autoscaling_policy

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAutoscalingPolicyResponse putAutoscalingPolicy(PutAutoscalingPolicyRequest request) throws IOException {
		return this.transport.performRequest(request, PutAutoscalingPolicyRequest.ENDPOINT);
	}

	/**
	 * Creates a new autoscaling policy. Designed for indirect use by ECE/ESS and
	 * ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/autoscaling-put-autoscaling-policy.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAutoscalingPolicyResponse putAutoscalingPolicy(
			Function<PutAutoscalingPolicyRequest.Builder, ObjectBuilder<PutAutoscalingPolicyRequest>> fn)
			throws IOException {
		return putAutoscalingPolicy(fn.apply(new PutAutoscalingPolicyRequest.Builder()).build());
	}

}
