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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the indices namespace.
 */
public class ElasticsearchIndicesClient extends ApiClient {

	public ElasticsearchIndicesClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: indices.add_block

	/**
	 * Adds a block to an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public AddBlockResponse addBlock(AddBlockRequest request) throws IOException {
		return this.transport.performRequest(request, AddBlockRequest.ENDPOINT);
	}

	/**
	 * Adds a block to an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/index-modules-blocks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AddBlockResponse addBlock(Function<AddBlockRequest.Builder, ObjectBuilder<AddBlockRequest>> fn)
			throws IOException {
		return addBlock(fn.apply(new AddBlockRequest.Builder()).build());
	}

	// ----- Endpoint: indices.analyze

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public AnalyzeResponse analyze(AnalyzeRequest request) throws IOException {
		return this.transport.performRequest(request, AnalyzeRequest.ENDPOINT);
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AnalyzeResponse analyze(Function<AnalyzeRequest.Builder, ObjectBuilder<AnalyzeRequest>> fn)
			throws IOException {
		return analyze(fn.apply(new AnalyzeRequest.Builder()).build());
	}

	/**
	 * Performs the analysis process on a text and return the tokens breakdown of
	 * the text.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-analyze.html">Documentation
	 *      on elastic.co</a>
	 */

	public AnalyzeResponse analyze() throws IOException {
		return this.transport.performRequest(new AnalyzeRequest.Builder().build(), AnalyzeRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.clear_cache

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache(ClearCacheRequest request) throws IOException {
		return this.transport.performRequest(request, ClearCacheRequest.ENDPOINT);
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCacheResponse clearCache(Function<ClearCacheRequest.Builder, ObjectBuilder<ClearCacheRequest>> fn)
			throws IOException {
		return clearCache(fn.apply(new ClearCacheRequest.Builder()).build());
	}

	/**
	 * Clears all or specific caches for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clearcache.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCacheResponse clearCache() throws IOException {
		return this.transport.performRequest(new ClearCacheRequest.Builder().build(), ClearCacheRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.clone

	/**
	 * Clones an index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloneIndexResponse clone(CloneIndexRequest request) throws IOException {
		return this.transport.performRequest(request, CloneIndexRequest.ENDPOINT);
	}

	/**
	 * Clones an index
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-clone-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CloneIndexResponse clone(Function<CloneIndexRequest.Builder, ObjectBuilder<CloneIndexRequest>> fn)
			throws IOException {
		return clone(fn.apply(new CloneIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.close

	/**
	 * Closes an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public CloseIndexResponse close(CloseIndexRequest request) throws IOException {
		return this.transport.performRequest(request, CloseIndexRequest.ENDPOINT);
	}

	/**
	 * Closes an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CloseIndexResponse close(Function<CloseIndexRequest.Builder, ObjectBuilder<CloseIndexRequest>> fn)
			throws IOException {
		return close(fn.apply(new CloseIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public CreateIndexResponse create(CreateIndexRequest request) throws IOException {
		return this.transport.performRequest(request, CreateIndexRequest.ENDPOINT);
	}

	/**
	 * Creates an index with optional settings and mappings.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-create-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateIndexResponse create(Function<CreateIndexRequest.Builder, ObjectBuilder<CreateIndexRequest>> fn)
			throws IOException {
		return create(fn.apply(new CreateIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.create_data_stream

	/**
	 * Creates a data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public CreateDataStreamResponse createDataStream(CreateDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, CreateDataStreamRequest.ENDPOINT);
	}

	/**
	 * Creates a data stream
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateDataStreamResponse createDataStream(
			Function<CreateDataStreamRequest.Builder, ObjectBuilder<CreateDataStreamRequest>> fn) throws IOException {
		return createDataStream(fn.apply(new CreateDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.data_streams_stats

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public DataStreamsStatsResponse dataStreamsStats(DataStreamsStatsRequest request) throws IOException {
		return this.transport.performRequest(request, DataStreamsStatsRequest.ENDPOINT);
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DataStreamsStatsResponse dataStreamsStats(
			Function<DataStreamsStatsRequest.Builder, ObjectBuilder<DataStreamsStatsRequest>> fn) throws IOException {
		return dataStreamsStats(fn.apply(new DataStreamsStatsRequest.Builder()).build());
	}

	/**
	 * Provides statistics on operations happening in a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public DataStreamsStatsResponse dataStreamsStats() throws IOException {
		return this.transport.performRequest(new DataStreamsStatsRequest.Builder().build(),
				DataStreamsStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.delete

	/**
	 * Deletes an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteIndexResponse delete(DeleteIndexRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteIndexRequest.ENDPOINT);
	}

	/**
	 * Deletes an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-delete-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteIndexResponse delete(Function<DeleteIndexRequest.Builder, ObjectBuilder<DeleteIndexRequest>> fn)
			throws IOException {
		return delete(fn.apply(new DeleteIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_alias

	/**
	 * Deletes an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteAliasRequest.ENDPOINT);
	}

	/**
	 * Deletes an alias.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteAliasResponse deleteAlias(
			Function<DeleteAliasRequest.Builder, ObjectBuilder<DeleteAliasRequest>> fn) throws IOException {
		return deleteAlias(fn.apply(new DeleteAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_data_stream

	/**
	 * Deletes a data stream.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDataStreamResponse deleteDataStream(DeleteDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteDataStreamRequest.ENDPOINT);
	}

	/**
	 * Deletes a data stream.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDataStreamResponse deleteDataStream(
			Function<DeleteDataStreamRequest.Builder, ObjectBuilder<DeleteDataStreamRequest>> fn) throws IOException {
		return deleteDataStream(fn.apply(new DeleteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_index_template

	/**
	 * Deletes an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteIndexTemplateResponse deleteIndexTemplate(DeleteIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Deletes an index template.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteIndexTemplateResponse deleteIndexTemplate(
			Function<DeleteIndexTemplateRequest.Builder, ObjectBuilder<DeleteIndexTemplateRequest>> fn)
			throws IOException {
		return deleteIndexTemplate(fn.apply(new DeleteIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.delete_template

	/**
	 * Deletes an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteTemplateRequest.ENDPOINT);
	}

	/**
	 * Deletes an index template.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteTemplateResponse deleteTemplate(
			Function<DeleteTemplateRequest.Builder, ObjectBuilder<DeleteTemplateRequest>> fn) throws IOException {
		return deleteTemplate(fn.apply(new DeleteTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.disk_usage

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public DiskUsageResponse diskUsage(DiskUsageRequest request) throws IOException {
		return this.transport.performRequest(request, DiskUsageRequest.ENDPOINT);
	}

	/**
	 * Analyzes the disk usage of each field of an index or data stream
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-disk-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DiskUsageResponse diskUsage(Function<DiskUsageRequest.Builder, ObjectBuilder<DiskUsageRequest>> fn)
			throws IOException {
		return diskUsage(fn.apply(new DiskUsageRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse exists(ExistsRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular index exists.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse exists(Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn)
			throws IOException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_alias

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsAlias(ExistsAliasRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsAliasRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular alias exists.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsAlias(Function<ExistsAliasRequest.Builder, ObjectBuilder<ExistsAliasRequest>> fn)
			throws IOException {
		return existsAlias(fn.apply(new ExistsAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_index_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsIndexTemplate(ExistsIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsIndexTemplate(
			Function<ExistsIndexTemplateRequest.Builder, ObjectBuilder<ExistsIndexTemplateRequest>> fn)
			throws IOException {
		return existsIndexTemplate(fn.apply(new ExistsIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_template

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsTemplate(ExistsTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular index template exists.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsTemplate(
			Function<ExistsTemplateRequest.Builder, ObjectBuilder<ExistsTemplateRequest>> fn) throws IOException {
		return existsTemplate(fn.apply(new ExistsTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.exists_type

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-types-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsType(ExistsTypeRequest request) throws IOException {
		return this.transport.performRequest(request, ExistsTypeRequest.ENDPOINT);
	}

	/**
	 * Returns information about whether a particular document type exists.
	 * (DEPRECATED)
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-types-exists.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsType(Function<ExistsTypeRequest.Builder, ObjectBuilder<ExistsTypeRequest>> fn)
			throws IOException {
		return existsType(fn.apply(new ExistsTypeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.flush

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushResponse flush(FlushRequest request) throws IOException {
		return this.transport.performRequest(request, FlushRequest.ENDPOINT);
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FlushResponse flush(Function<FlushRequest.Builder, ObjectBuilder<FlushRequest>> fn)
			throws IOException {
		return flush(fn.apply(new FlushRequest.Builder()).build());
	}

	/**
	 * Performs the flush operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-flush.html">Documentation
	 *      on elastic.co</a>
	 */

	public FlushResponse flush() throws IOException {
		return this.transport.performRequest(new FlushRequest.Builder().build(), FlushRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.forcemerge

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForcemergeResponse forcemerge(ForcemergeRequest request) throws IOException {
		return this.transport.performRequest(request, ForcemergeRequest.ENDPOINT);
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ForcemergeResponse forcemerge(Function<ForcemergeRequest.Builder, ObjectBuilder<ForcemergeRequest>> fn)
			throws IOException {
		return forcemerge(fn.apply(new ForcemergeRequest.Builder()).build());
	}

	/**
	 * Performs the force merge operation on one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-forcemerge.html">Documentation
	 *      on elastic.co</a>
	 */

	public ForcemergeResponse forcemerge() throws IOException {
		return this.transport.performRequest(new ForcemergeRequest.Builder().build(), ForcemergeRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.freeze

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/freeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public FreezeResponse freeze(FreezeRequest request) throws IOException {
		return this.transport.performRequest(request, FreezeRequest.ENDPOINT);
	}

	/**
	 * Freezes an index. A frozen index has almost no overhead on the cluster
	 * (except for maintaining its metadata in memory) and is read-only.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/freeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final FreezeResponse freeze(Function<FreezeRequest.Builder, ObjectBuilder<FreezeRequest>> fn)
			throws IOException {
		return freeze(fn.apply(new FreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get

	/**
	 * Returns information about one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexResponse get(GetIndexRequest request) throws IOException {
		return this.transport.performRequest(request, GetIndexRequest.ENDPOINT);
	}

	/**
	 * Returns information about one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetIndexResponse get(Function<GetIndexRequest.Builder, ObjectBuilder<GetIndexRequest>> fn)
			throws IOException {
		return get(fn.apply(new GetIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_alias

	/**
	 * Returns an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAliasResponse getAlias(GetAliasRequest request) throws IOException {
		return this.transport.performRequest(request, GetAliasRequest.ENDPOINT);
	}

	/**
	 * Returns an alias.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetAliasResponse getAlias(Function<GetAliasRequest.Builder, ObjectBuilder<GetAliasRequest>> fn)
			throws IOException {
		return getAlias(fn.apply(new GetAliasRequest.Builder()).build());
	}

	/**
	 * Returns an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetAliasResponse getAlias() throws IOException {
		return this.transport.performRequest(new GetAliasRequest.Builder().build(), GetAliasRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_data_stream

	/**
	 * Returns data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataStreamResponse getDataStream(GetDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, GetDataStreamRequest.ENDPOINT);
	}

	/**
	 * Returns data streams.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetDataStreamResponse getDataStream(
			Function<GetDataStreamRequest.Builder, ObjectBuilder<GetDataStreamRequest>> fn) throws IOException {
		return getDataStream(fn.apply(new GetDataStreamRequest.Builder()).build());
	}

	/**
	 * Returns data streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetDataStreamResponse getDataStream() throws IOException {
		return this.transport.performRequest(new GetDataStreamRequest.Builder().build(), GetDataStreamRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_field_mapping

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetFieldMappingResponse getFieldMapping(GetFieldMappingRequest request) throws IOException {
		return this.transport.performRequest(request, GetFieldMappingRequest.ENDPOINT);
	}

	/**
	 * Returns mapping for one or more fields.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-field-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetFieldMappingResponse getFieldMapping(
			Function<GetFieldMappingRequest.Builder, ObjectBuilder<GetFieldMappingRequest>> fn) throws IOException {
		return getFieldMapping(fn.apply(new GetFieldMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.get_index_template

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexTemplateResponse getIndexTemplate(GetIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, GetIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns an index template.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetIndexTemplateResponse getIndexTemplate(
			Function<GetIndexTemplateRequest.Builder, ObjectBuilder<GetIndexTemplateRequest>> fn) throws IOException {
		return getIndexTemplate(fn.apply(new GetIndexTemplateRequest.Builder()).build());
	}

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetIndexTemplateResponse getIndexTemplate() throws IOException {
		return this.transport.performRequest(new GetIndexTemplateRequest.Builder().build(),
				GetIndexTemplateRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_mapping

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetMappingResponse getMapping(GetMappingRequest request) throws IOException {
		return this.transport.performRequest(request, GetMappingRequest.ENDPOINT);
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetMappingResponse getMapping(Function<GetMappingRequest.Builder, ObjectBuilder<GetMappingRequest>> fn)
			throws IOException {
		return getMapping(fn.apply(new GetMappingRequest.Builder()).build());
	}

	/**
	 * Returns mappings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetMappingResponse getMapping() throws IOException {
		return this.transport.performRequest(new GetMappingRequest.Builder().build(), GetMappingRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_settings

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSettingsResponse getSettings(GetSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, GetSettingsRequest.ENDPOINT);
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSettingsResponse getSettings(
			Function<GetSettingsRequest.Builder, ObjectBuilder<GetSettingsRequest>> fn) throws IOException {
		return getSettings(fn.apply(new GetSettingsRequest.Builder()).build());
	}

	/**
	 * Returns settings for one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetSettingsResponse getSettings() throws IOException {
		return this.transport.performRequest(new GetSettingsRequest.Builder().build(), GetSettingsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.get_template

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTemplateResponse getTemplate(GetTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, GetTemplateRequest.ENDPOINT);
	}

	/**
	 * Returns an index template.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTemplateResponse getTemplate(
			Function<GetTemplateRequest.Builder, ObjectBuilder<GetTemplateRequest>> fn) throws IOException {
		return getTemplate(fn.apply(new GetTemplateRequest.Builder()).build());
	}

	/**
	 * Returns an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTemplateResponse getTemplate() throws IOException {
		return this.transport.performRequest(new GetTemplateRequest.Builder().build(), GetTemplateRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.migrate_to_data_stream

	/**
	 * Migrates an alias to a data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public MigrateToDataStreamResponse migrateToDataStream(MigrateToDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, MigrateToDataStreamRequest.ENDPOINT);
	}

	/**
	 * Migrates an alias to a data stream
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MigrateToDataStreamResponse migrateToDataStream(
			Function<MigrateToDataStreamRequest.Builder, ObjectBuilder<MigrateToDataStreamRequest>> fn)
			throws IOException {
		return migrateToDataStream(fn.apply(new MigrateToDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.open

	/**
	 * Opens an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public OpenResponse open(OpenRequest request) throws IOException {
		return this.transport.performRequest(request, OpenRequest.ENDPOINT);
	}

	/**
	 * Opens an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-open-close.html">Documentation
	 *      on elastic.co</a>
	 */

	public final OpenResponse open(Function<OpenRequest.Builder, ObjectBuilder<OpenRequest>> fn) throws IOException {
		return open(fn.apply(new OpenRequest.Builder()).build());
	}

	// ----- Endpoint: indices.promote_data_stream

	/**
	 * Promotes a data stream from a replicated data stream managed by CCR to a
	 * regular data stream
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public PromoteDataStreamResponse promoteDataStream(PromoteDataStreamRequest request) throws IOException {
		return this.transport.performRequest(request, PromoteDataStreamRequest.ENDPOINT);
	}

	/**
	 * Promotes a data stream from a replicated data stream managed by CCR to a
	 * regular data stream
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/data-streams.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PromoteDataStreamResponse promoteDataStream(
			Function<PromoteDataStreamRequest.Builder, ObjectBuilder<PromoteDataStreamRequest>> fn) throws IOException {
		return promoteDataStream(fn.apply(new PromoteDataStreamRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_alias

	/**
	 * Creates or updates an alias.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAliasResponse putAlias(PutAliasRequest request) throws IOException {
		return this.transport.performRequest(request, PutAliasRequest.ENDPOINT);
	}

	/**
	 * Creates or updates an alias.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAliasResponse putAlias(Function<PutAliasRequest.Builder, ObjectBuilder<PutAliasRequest>> fn)
			throws IOException {
		return putAlias(fn.apply(new PutAliasRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_index_template

	/**
	 * Creates or updates an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutIndexTemplateResponse putIndexTemplate(PutIndexTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, PutIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Creates or updates an index template.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutIndexTemplateResponse putIndexTemplate(
			Function<PutIndexTemplateRequest.Builder, ObjectBuilder<PutIndexTemplateRequest>> fn) throws IOException {
		return putIndexTemplate(fn.apply(new PutIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_mapping

	/**
	 * Updates the index mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutMappingResponse putMapping(PutMappingRequest request) throws IOException {
		return this.transport.performRequest(request, PutMappingRequest.ENDPOINT);
	}

	/**
	 * Updates the index mappings.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-put-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutMappingResponse putMapping(Function<PutMappingRequest.Builder, ObjectBuilder<PutMappingRequest>> fn)
			throws IOException {
		return putMapping(fn.apply(new PutMappingRequest.Builder()).build());
	}

	// ----- Endpoint: indices.put_settings

	/**
	 * Updates the index settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutSettingsResponse putSettings(PutSettingsRequest request) throws IOException {
		return this.transport.performRequest(request, PutSettingsRequest.ENDPOINT);
	}

	/**
	 * Updates the index settings.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutSettingsResponse putSettings(
			Function<PutSettingsRequest.Builder, ObjectBuilder<PutSettingsRequest>> fn) throws IOException {
		return putSettings(fn.apply(new PutSettingsRequest.Builder()).build());
	}

	/**
	 * Updates the index settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutSettingsResponse putSettings() throws IOException {
		return this.transport.performRequest(new PutSettingsRequest.Builder().build(), PutSettingsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.put_template

	/**
	 * Creates or updates an index template.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTemplateResponse putTemplate(PutTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, PutTemplateRequest.ENDPOINT);
	}

	/**
	 * Creates or updates an index template.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTemplateResponse putTemplate(
			Function<PutTemplateRequest.Builder, ObjectBuilder<PutTemplateRequest>> fn) throws IOException {
		return putTemplate(fn.apply(new PutTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.recovery

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery(RecoveryRequest request) throws IOException {
		return this.transport.performRequest(request, RecoveryRequest.ENDPOINT);
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RecoveryResponse recovery(Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn)
			throws IOException {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about ongoing index shard recoveries.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public RecoveryResponse recovery() throws IOException {
		return this.transport.performRequest(new RecoveryRequest.Builder().build(), RecoveryRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.refresh

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public RefreshResponse refresh(RefreshRequest request) throws IOException {
		return this.transport.performRequest(request, RefreshRequest.ENDPOINT);
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RefreshResponse refresh(Function<RefreshRequest.Builder, ObjectBuilder<RefreshRequest>> fn)
			throws IOException {
		return refresh(fn.apply(new RefreshRequest.Builder()).build());
	}

	/**
	 * Performs the refresh operation in one or more indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-refresh.html">Documentation
	 *      on elastic.co</a>
	 */

	public RefreshResponse refresh() throws IOException {
		return this.transport.performRequest(new RefreshRequest.Builder().build(), RefreshRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.reload_search_analyzers

	/**
	 * Reloads an index's search analyzers and their resources.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public ReloadSearchAnalyzersResponse reloadSearchAnalyzers(ReloadSearchAnalyzersRequest request)
			throws IOException {
		return this.transport.performRequest(request, ReloadSearchAnalyzersRequest.ENDPOINT);
	}

	/**
	 * Reloads an index's search analyzers and their resources.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-reload-analyzers.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ReloadSearchAnalyzersResponse reloadSearchAnalyzers(
			Function<ReloadSearchAnalyzersRequest.Builder, ObjectBuilder<ReloadSearchAnalyzersRequest>> fn)
			throws IOException {
		return reloadSearchAnalyzers(fn.apply(new ReloadSearchAnalyzersRequest.Builder()).build());
	}

	// ----- Endpoint: indices.resolve_index

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ResolveIndexResponse resolveIndex(ResolveIndexRequest request) throws IOException {
		return this.transport.performRequest(request, ResolveIndexRequest.ENDPOINT);
	}

	/**
	 * Returns information about any matching indices, aliases, and data streams
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-resolve-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ResolveIndexResponse resolveIndex(
			Function<ResolveIndexRequest.Builder, ObjectBuilder<ResolveIndexRequest>> fn) throws IOException {
		return resolveIndex(fn.apply(new ResolveIndexRequest.Builder()).build());
	}

	// ----- Endpoint: indices.rollover

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-rollover-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public RolloverResponse rollover(RolloverRequest request) throws IOException {
		return this.transport.performRequest(request, RolloverRequest.ENDPOINT);
	}

	/**
	 * Updates an alias to point to a new index when the existing index is
	 * considered to be too large or too old.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-rollover-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RolloverResponse rollover(Function<RolloverRequest.Builder, ObjectBuilder<RolloverRequest>> fn)
			throws IOException {
		return rollover(fn.apply(new RolloverRequest.Builder()).build());
	}

	// ----- Endpoint: indices.segments

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments(SegmentsRequest request) throws IOException {
		return this.transport.performRequest(request, SegmentsRequest.ENDPOINT);
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SegmentsResponse segments(Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn)
			throws IOException {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Provides low-level information about segments in a Lucene index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public SegmentsResponse segments() throws IOException {
		return this.transport.performRequest(new SegmentsRequest.Builder().build(), SegmentsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.shard_stores

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShardStoresResponse shardStores(ShardStoresRequest request) throws IOException {
		return this.transport.performRequest(request, ShardStoresRequest.ENDPOINT);
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ShardStoresResponse shardStores(
			Function<ShardStoresRequest.Builder, ObjectBuilder<ShardStoresRequest>> fn) throws IOException {
		return shardStores(fn.apply(new ShardStoresRequest.Builder()).build());
	}

	/**
	 * Provides store information for shard copies of indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shards-stores.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShardStoresResponse shardStores() throws IOException {
		return this.transport.performRequest(new ShardStoresRequest.Builder().build(), ShardStoresRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.shrink

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public ShrinkResponse shrink(ShrinkRequest request) throws IOException {
		return this.transport.performRequest(request, ShrinkRequest.ENDPOINT);
	}

	/**
	 * Allow to shrink an existing index into a new index with fewer primary shards.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-shrink-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ShrinkResponse shrink(Function<ShrinkRequest.Builder, ObjectBuilder<ShrinkRequest>> fn)
			throws IOException {
		return shrink(fn.apply(new ShrinkRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_index_template

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateIndexTemplateResponse simulateIndexTemplate(SimulateIndexTemplateRequest request)
			throws IOException {
		return this.transport.performRequest(request, SimulateIndexTemplateRequest.ENDPOINT);
	}

	/**
	 * Simulate matching the given index name against the index templates in the
	 * system
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SimulateIndexTemplateResponse simulateIndexTemplate(
			Function<SimulateIndexTemplateRequest.Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn)
			throws IOException {
		return simulateIndexTemplate(fn.apply(new SimulateIndexTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: indices.simulate_template

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateTemplateResponse simulateTemplate(SimulateTemplateRequest request) throws IOException {
		return this.transport.performRequest(request, SimulateTemplateRequest.ENDPOINT);
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SimulateTemplateResponse simulateTemplate(
			Function<SimulateTemplateRequest.Builder, ObjectBuilder<SimulateTemplateRequest>> fn) throws IOException {
		return simulateTemplate(fn.apply(new SimulateTemplateRequest.Builder()).build());
	}

	/**
	 * Simulate resolving the given template name or body
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateTemplateResponse simulateTemplate() throws IOException {
		return this.transport.performRequest(new SimulateTemplateRequest.Builder().build(),
				SimulateTemplateRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.split

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-split-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public SplitResponse split(SplitRequest request) throws IOException {
		return this.transport.performRequest(request, SplitRequest.ENDPOINT);
	}

	/**
	 * Allows you to split an existing index into a new index with more primary
	 * shards.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-split-index.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SplitResponse split(Function<SplitRequest.Builder, ObjectBuilder<SplitRequest>> fn)
			throws IOException {
		return split(fn.apply(new SplitRequest.Builder()).build());
	}

	// ----- Endpoint: indices.stats

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesStatsResponse stats(IndicesStatsRequest request) throws IOException {
		return this.transport.performRequest(request, IndicesStatsRequest.ENDPOINT);
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final IndicesStatsResponse stats(
			Function<IndicesStatsRequest.Builder, ObjectBuilder<IndicesStatsRequest>> fn) throws IOException {
		return stats(fn.apply(new IndicesStatsRequest.Builder()).build());
	}

	/**
	 * Provides statistics on operations happening in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesStatsResponse stats() throws IOException {
		return this.transport.performRequest(new IndicesStatsRequest.Builder().build(), IndicesStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.unfreeze

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UnfreezeResponse unfreeze(UnfreezeRequest request) throws IOException {
		return this.transport.performRequest(request, UnfreezeRequest.ENDPOINT);
	}

	/**
	 * Unfreezes an index. When a frozen index is unfrozen, the index goes through
	 * the normal recovery process and becomes writeable again.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/unfreeze-index-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UnfreezeResponse unfreeze(Function<UnfreezeRequest.Builder, ObjectBuilder<UnfreezeRequest>> fn)
			throws IOException {
		return unfreeze(fn.apply(new UnfreezeRequest.Builder()).build());
	}

	// ----- Endpoint: indices.update_aliases

	/**
	 * Updates index aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateAliasesResponse updateAliases(UpdateAliasesRequest request) throws IOException {
		return this.transport.performRequest(request, UpdateAliasesRequest.ENDPOINT);
	}

	/**
	 * Updates index aliases.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateAliasesResponse updateAliases(
			Function<UpdateAliasesRequest.Builder, ObjectBuilder<UpdateAliasesRequest>> fn) throws IOException {
		return updateAliases(fn.apply(new UpdateAliasesRequest.Builder()).build());
	}

	/**
	 * Updates index aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-aliases.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateAliasesResponse updateAliases() throws IOException {
		return this.transport.performRequest(new UpdateAliasesRequest.Builder().build(), UpdateAliasesRequest.ENDPOINT);
	}

	// ----- Endpoint: indices.validate_query

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateQueryResponse validateQuery(ValidateQueryRequest request) throws IOException {
		return this.transport.performRequest(request, ValidateQueryRequest.ENDPOINT);
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ValidateQueryResponse validateQuery(
			Function<ValidateQueryRequest.Builder, ObjectBuilder<ValidateQueryRequest>> fn) throws IOException {
		return validateQuery(fn.apply(new ValidateQueryRequest.Builder()).build());
	}

	/**
	 * Allows a user to validate a potentially expensive query without executing it.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-validate.html">Documentation
	 *      on elastic.co</a>
	 */

	public ValidateQueryResponse validateQuery() throws IOException {
		return this.transport.performRequest(new ValidateQueryRequest.Builder().build(), ValidateQueryRequest.ENDPOINT);
	}

}
