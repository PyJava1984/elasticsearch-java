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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the nodes namespace.
 */
public class ElasticsearchNodesAsyncClient extends ApiClient {

	public ElasticsearchNodesAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: nodes.hot_threads

	/**
	 * Returns information about hot threads on each node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HotThreadsResponse> hotThreads(HotThreadsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, HotThreadsRequest.ENDPOINT);
	}

	/**
	 * Returns information about hot threads on each node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HotThreadsResponse> hotThreads(
			Function<HotThreadsRequest.Builder, ObjectBuilder<HotThreadsRequest>> fn) throws IOException {
		return hotThreads(fn.apply(new HotThreadsRequest.Builder()).build());
	}

	/**
	 * Returns information about hot threads on each node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HotThreadsResponse> hotThreads() throws IOException {
		return this.transport.performRequestAsync(new HotThreadsRequest.Builder().build(), HotThreadsRequest.ENDPOINT);
	}

	// ----- Endpoint: nodes.info

	/**
	 * Returns information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesInfoResponse> info(NodesInfoRequest request) throws IOException {
		return this.transport.performRequestAsync(request, NodesInfoRequest.ENDPOINT);
	}

	/**
	 * Returns information about nodes in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesInfoResponse> info(
			Function<NodesInfoRequest.Builder, ObjectBuilder<NodesInfoRequest>> fn) throws IOException {
		return info(fn.apply(new NodesInfoRequest.Builder()).build());
	}

	/**
	 * Returns information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesInfoResponse> info() throws IOException {
		return this.transport.performRequestAsync(new NodesInfoRequest.Builder().build(), NodesInfoRequest.ENDPOINT);
	}

	// ----- Endpoint: nodes.reload_secure_settings

	/**
	 * Reloads secure settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/secure-settings.html#reloadable-secure-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings(ReloadSecureSettingsRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ReloadSecureSettingsRequest.ENDPOINT);
	}

	/**
	 * Reloads secure settings.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/secure-settings.html#reloadable-secure-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings(
			Function<ReloadSecureSettingsRequest.Builder, ObjectBuilder<ReloadSecureSettingsRequest>> fn)
			throws IOException {
		return reloadSecureSettings(fn.apply(new ReloadSecureSettingsRequest.Builder()).build());
	}

	/**
	 * Reloads secure settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/secure-settings.html#reloadable-secure-settings">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReloadSecureSettingsResponse> reloadSecureSettings() throws IOException {
		return this.transport.performRequestAsync(new ReloadSecureSettingsRequest.Builder().build(),
				ReloadSecureSettingsRequest.ENDPOINT);
	}

	// ----- Endpoint: nodes.stats

	/**
	 * Returns statistical information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesStatsResponse> stats(NodesStatsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, NodesStatsRequest.ENDPOINT);
	}

	/**
	 * Returns statistical information about nodes in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesStatsResponse> stats(
			Function<NodesStatsRequest.Builder, ObjectBuilder<NodesStatsRequest>> fn) throws IOException {
		return stats(fn.apply(new NodesStatsRequest.Builder()).build());
	}

	/**
	 * Returns statistical information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesStatsResponse> stats() throws IOException {
		return this.transport.performRequestAsync(new NodesStatsRequest.Builder().build(), NodesStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: nodes.usage

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UsageResponse> usage(UsageRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UsageRequest.ENDPOINT);
	}

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UsageResponse> usage(Function<UsageRequest.Builder, ObjectBuilder<UsageRequest>> fn)
			throws IOException {
		return usage(fn.apply(new UsageRequest.Builder()).build());
	}

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UsageResponse> usage() throws IOException {
		return this.transport.performRequestAsync(new UsageRequest.Builder().build(), UsageRequest.ENDPOINT);
	}

}
