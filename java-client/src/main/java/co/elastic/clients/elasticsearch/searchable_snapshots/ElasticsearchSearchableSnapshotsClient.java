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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the searchable_snapshots namespace.
 */
public class ElasticsearchSearchableSnapshotsClient extends ApiClient {

	public ElasticsearchSearchableSnapshotsClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: searchable_snapshots.clear_cache

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCacheRequest.ENDPOINT);
	}

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCacheResponse clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clear the cache of searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache() throws IOException {
		return this.transport.performRequest(new ClearCacheRequest.Builder().build(), ClearCacheRequest.ENDPOINT);
	}

	// ----- Endpoint: searchable_snapshots.mount

	/**
	 * Mount a snapshot as a searchable index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-api-mount-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public MountResponse mount(MountRequest request) throws IOException {
		return this.transport.performRequest(request, MountRequest.ENDPOINT);
	}

	/**
	 * Mount a snapshot as a searchable index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-api-mount-snapshot.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MountResponse mount(Function<MountRequest.Builder, ObjectBuilder<MountRequest>> fn)
			throws IOException {
		return mount(fn.apply(new MountRequest.Builder()).build());
	}

	// ----- Endpoint: searchable_snapshots.stats

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public SearchableSnapshotsStatsResponse stats(SearchableSnapshotsStatsRequest request) throws IOException {
		return this.transport.performRequest(request, SearchableSnapshotsStatsRequest.ENDPOINT);
	}

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SearchableSnapshotsStatsResponse stats(
			Function<SearchableSnapshotsStatsRequest.Builder, ObjectBuilder<SearchableSnapshotsStatsRequest>> fn)
			throws IOException {
		return stats(fn.apply(new SearchableSnapshotsStatsRequest.Builder()).build());
	}

	/**
	 * Retrieve shard-level statistics about searchable snapshots.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/searchable-snapshots-apis.html">Documentation
	 *      on elastic.co</a>
	 */

	public SearchableSnapshotsStatsResponse stats() throws IOException {
		return this.transport.performRequest(new SearchableSnapshotsStatsRequest.Builder().build(),
				SearchableSnapshotsStatsRequest.ENDPOINT);
	}

}
