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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.DefaultOperator;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.ScriptField;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.SuggestMode;
import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch.core.search.FieldCollapse;
import co.elastic.clients.elasticsearch.core.search.Highlight;
import co.elastic.clients.elasticsearch.core.search.PointInTimeReference;
import co.elastic.clients.elasticsearch.core.search.Rescore;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: async_search.submit.Request
@JsonpDeserializable
public final class SubmitRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> index;

	@Nullable
	private final String waitForCompletionTimeout;

	@Nullable
	private final Boolean keepOnCompletion;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean allowPartialSearchResults;

	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean analyzeWildcard;

	@Nullable
	private final Long batchedReduceSize;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final DefaultOperator defaultOperator;

	@Nullable
	private final String df;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Long maxConcurrentShardRequests;

	@Nullable
	private final String minCompatibleShardNode;

	@Nullable
	private final String preference;

	@Nullable
	private final Long preFilterShardSize;

	@Nullable
	private final Boolean requestCache;

	@Nullable
	private final String routing;

	@Nullable
	private final String scroll;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final String suggestField;

	@Nullable
	private final SuggestMode suggestMode;

	@Nullable
	private final Long suggestSize;

	@Nullable
	private final String suggestText;

	@Nullable
	private final Boolean typedKeys;

	@Nullable
	private final Boolean restTotalHitsAsInt;

	@Nullable
	private final List<String> sourceExcludes;

	@Nullable
	private final List<String> sourceIncludes;

	@Nullable
	private final String q;

	@Nullable
	private final Map<String, Aggregation> aggs;

	@Nullable
	private final Map<String, Aggregation> aggregations;

	@Nullable
	private final FieldCollapse collapse;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Integer from;

	@Nullable
	private final Highlight highlight;

	@Nullable
	private final JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits;

	@Nullable
	private final List<Map<String, Double>> indicesBoost;

	@Nullable
	private final JsonValue /*
							 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
							 * _global.search._types.DocValueField)
							 */ docvalueFields;

	@Nullable
	private final Double minScore;

	@Nullable
	private final Query postFilter;

	@Nullable
	private final Boolean profile;

	@Nullable
	private final Query query;

	@Nullable
	private final List<Rescore> rescore;

	@Nullable
	private final Map<String, ScriptField> scriptFields;

	@Nullable
	private final List<String> searchAfter;

	@Nullable
	private final Integer size;

	@Nullable
	private final SlicedScroll slice;

	@Nullable
	private final List<JsonValue /* _global.search._types.SortCombinations */> sort;

	@Nullable
	private final JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

	@Nullable
	private final List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

	@Nullable
	private final JsonValue /*
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
							 * (singleKey = false) | _global.search._types.SuggestContainer)
							 */ suggest;

	@Nullable
	private final Long terminateAfter;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean trackScores;

	@Nullable
	private final Boolean version;

	@Nullable
	private final Boolean seqNoPrimaryTerm;

	@Nullable
	private final List<String> storedFields;

	@Nullable
	private final PointInTimeReference pit;

	@Nullable
	private final Map<String, RuntimeField> runtimeMappings;

	@Nullable
	private final List<String> stats;

	// ---------------------------------------------------------------------------------------------

	public SubmitRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;
		this.keepOnCompletion = builder.keepOnCompletion;
		this.keepAlive = builder.keepAlive;
		this.allowNoIndices = builder.allowNoIndices;
		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.analyzer = builder.analyzer;
		this.analyzeWildcard = builder.analyzeWildcard;
		this.batchedReduceSize = builder.batchedReduceSize;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.defaultOperator = builder.defaultOperator;
		this.df = builder.df;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.lenient = builder.lenient;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.minCompatibleShardNode = builder.minCompatibleShardNode;
		this.preference = builder.preference;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.requestCache = builder.requestCache;
		this.routing = builder.routing;
		this.scroll = builder.scroll;
		this.searchType = builder.searchType;
		this.suggestField = builder.suggestField;
		this.suggestMode = builder.suggestMode;
		this.suggestSize = builder.suggestSize;
		this.suggestText = builder.suggestText;
		this.typedKeys = builder.typedKeys;
		this.restTotalHitsAsInt = builder.restTotalHitsAsInt;
		this.sourceExcludes = ModelTypeHelper.unmodifiable(builder.sourceExcludes);
		this.sourceIncludes = ModelTypeHelper.unmodifiable(builder.sourceIncludes);
		this.q = builder.q;
		this.aggs = ModelTypeHelper.unmodifiable(builder.aggs);
		this.aggregations = ModelTypeHelper.unmodifiable(builder.aggregations);
		this.collapse = builder.collapse;
		this.explain = builder.explain;
		this.from = builder.from;
		this.highlight = builder.highlight;
		this.trackTotalHits = builder.trackTotalHits;
		this.indicesBoost = ModelTypeHelper.unmodifiable(builder.indicesBoost);
		this.docvalueFields = builder.docvalueFields;
		this.minScore = builder.minScore;
		this.postFilter = builder.postFilter;
		this.profile = builder.profile;
		this.query = builder.query;
		this.rescore = ModelTypeHelper.unmodifiable(builder.rescore);
		this.scriptFields = ModelTypeHelper.unmodifiable(builder.scriptFields);
		this.searchAfter = ModelTypeHelper.unmodifiable(builder.searchAfter);
		this.size = builder.size;
		this.slice = builder.slice;
		this.sort = ModelTypeHelper.unmodifiable(builder.sort);
		this.source = builder.source;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.suggest = builder.suggest;
		this.terminateAfter = builder.terminateAfter;
		this.timeout = builder.timeout;
		this.trackScores = builder.trackScores;
		this.version = builder.version;
		this.seqNoPrimaryTerm = builder.seqNoPrimaryTerm;
		this.storedFields = ModelTypeHelper.unmodifiable(builder.storedFields);
		this.pit = builder.pit;
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);
		this.stats = ModelTypeHelper.unmodifiable(builder.stats);

	}

	public SubmitRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of index names to search; use <code>_all</code> or
	 * empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Specify the time that the request should block waiting for the final response
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public String waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	/**
	 * Control whether the response should be stored in the cluster if it completed
	 * within the provided [wait_for_completion] time (default: false)
	 * <p>
	 * API name: {@code keep_on_completion}
	 */
	@Nullable
	public Boolean keepOnCompletion() {
		return this.keepOnCompletion;
	}

	/**
	 * Update the time interval in which the results (partial or final) for this
	 * search will be available
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public String keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Indicate if an error should be returned if there is a partial search failure
	 * or timeout
	 * <p>
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * The analyzer to use for the query string
	 * <p>
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * Specify whether wildcard and prefix queries should be analyzed (default:
	 * false)
	 * <p>
	 * API name: {@code analyze_wildcard}
	 */
	@Nullable
	public Boolean analyzeWildcard() {
		return this.analyzeWildcard;
	}

	/**
	 * The number of shard results that should be reduced at once on the
	 * coordinating node. This value should be used as the granularity at which
	 * progress results will be made available.
	 * <p>
	 * API name: {@code batched_reduce_size}
	 */
	@Nullable
	public Long batchedReduceSize() {
		return this.batchedReduceSize;
	}

	/**
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * The default operator for query string query (AND or OR)
	 * <p>
	 * API name: {@code default_operator}
	 */
	@Nullable
	public DefaultOperator defaultOperator() {
		return this.defaultOperator;
	}

	/**
	 * The field to use as default where no field prefix is given in the query
	 * string
	 * <p>
	 * API name: {@code df}
	 */
	@Nullable
	public String df() {
		return this.df;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Whether specified concrete, expanded or aliased indices should be ignored
	 * when throttled
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Specify whether format-based query failures (such as providing text to a
	 * numeric field) should be ignored
	 * <p>
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * The number of concurrent shard requests per node this search executes
	 * concurrently. This value should be used to limit the impact of the search on
	 * the cluster in order to limit the number of concurrent shard requests
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public Long maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * API name: {@code min_compatible_shard_node}
	 */
	@Nullable
	public String minCompatibleShardNode() {
		return this.minCompatibleShardNode;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public String preference() {
		return this.preference;
	}

	/**
	 * API name: {@code pre_filter_shard_size}
	 */
	@Nullable
	public Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Specify if request cache should be used for this request or not, defaults to
	 * true
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public Boolean requestCache() {
		return this.requestCache;
	}

	/**
	 * A comma-separated list of specific routing values
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public String routing() {
		return this.routing;
	}

	/**
	 * API name: {@code scroll}
	 */
	@Nullable
	public String scroll() {
		return this.scroll;
	}

	/**
	 * Search operation type
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Specifies which field to use for suggestions.
	 * <p>
	 * API name: {@code suggest_field}
	 */
	@Nullable
	public String suggestField() {
		return this.suggestField;
	}

	/**
	 * Specify suggest mode
	 * <p>
	 * API name: {@code suggest_mode}
	 */
	@Nullable
	public SuggestMode suggestMode() {
		return this.suggestMode;
	}

	/**
	 * How many suggestions to return in response
	 * <p>
	 * API name: {@code suggest_size}
	 */
	@Nullable
	public Long suggestSize() {
		return this.suggestSize;
	}

	/**
	 * The source text for which the suggestions should be returned.
	 * <p>
	 * API name: {@code suggest_text}
	 */
	@Nullable
	public String suggestText() {
		return this.suggestText;
	}

	/**
	 * Specify whether aggregation and suggester names should be prefixed by their
	 * respective types in the response
	 * <p>
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * API name: {@code rest_total_hits_as_int}
	 */
	@Nullable
	public Boolean restTotalHitsAsInt() {
		return this.restTotalHitsAsInt;
	}

	/**
	 * A list of fields to exclude from the returned _source field
	 * <p>
	 * API name: {@code _source_excludes}
	 */
	@Nullable
	public List<String> sourceExcludes() {
		return this.sourceExcludes;
	}

	/**
	 * A list of fields to extract and return from the _source field
	 * <p>
	 * API name: {@code _source_includes}
	 */
	@Nullable
	public List<String> sourceIncludes() {
		return this.sourceIncludes;
	}

	/**
	 * Query in the Lucene query string syntax
	 * <p>
	 * API name: {@code q}
	 */
	@Nullable
	public String q() {
		return this.q;
	}

	/**
	 * API name: {@code aggs}
	 */
	@Nullable
	public Map<String, Aggregation> aggs() {
		return this.aggs;
	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, Aggregation> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code collapse}
	 */
	@Nullable
	public FieldCollapse collapse() {
		return this.collapse;
	}

	/**
	 * If true, returns detailed information about score computation as part of a
	 * hit.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * Starting document offset. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the search_after parameter.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * API name: {@code highlight}
	 */
	@Nullable
	public Highlight highlight() {
		return this.highlight;
	}

	/**
	 * Number of hits matching the query to count accurately. If true, the exact
	 * number of hits is returned at the cost of some performance. If false, the
	 * response does not include the total number of hits matching the query.
	 * Defaults to 10,000 hits.
	 * <p>
	 * API name: {@code track_total_hits}
	 */
	@Nullable
	public JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits() {
		return this.trackTotalHits;
	}

	/**
	 * Boosts the _score of documents from specified indices.
	 * <p>
	 * API name: {@code indices_boost}
	 */
	@Nullable
	public List<Map<String, Double>> indicesBoost() {
		return this.indicesBoost;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns doc values for field
	 * names matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code docvalue_fields}
	 */
	@Nullable
	public JsonValue /*
						 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
						 * _global.search._types.DocValueField)
						 */ docvalueFields() {
		return this.docvalueFields;
	}

	/**
	 * Minimum _score for matching documents. Documents with a lower _score are not
	 * included in the search results.
	 * <p>
	 * API name: {@code min_score}
	 */
	@Nullable
	public Double minScore() {
		return this.minScore;
	}

	/**
	 * API name: {@code post_filter}
	 */
	@Nullable
	public Query postFilter() {
		return this.postFilter;
	}

	/**
	 * API name: {@code profile}
	 */
	@Nullable
	public Boolean profile() {
		return this.profile;
	}

	/**
	 * Defines the search definition using the Query DSL.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public Query query() {
		return this.query;
	}

	/**
	 * API name: {@code rescore}
	 */
	@Nullable
	public List<Rescore> rescore() {
		return this.rescore;
	}

	/**
	 * Retrieve a script evaluation (based on different fields) for each hit.
	 * <p>
	 * API name: {@code script_fields}
	 */
	@Nullable
	public Map<String, ScriptField> scriptFields() {
		return this.scriptFields;
	}

	/**
	 * API name: {@code search_after}
	 */
	@Nullable
	public List<String> searchAfter() {
		return this.searchAfter;
	}

	/**
	 * The number of hits to return. By default, you cannot page through more than
	 * 10,000 hits using the from and size parameters. To page through more hits,
	 * use the search_after parameter.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code slice}
	 */
	@Nullable
	public SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue /* _global.search._types.SortCombinations */> sort() {
		return this.sort;
	}

	/**
	 * Indicates which source fields are returned for matching documents. These
	 * fields are returned in the hits._source property of the search response.
	 * <p>
	 * API name: {@code _source}
	 */
	@Nullable
	public JsonValue /*
						 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
						 */ source() {
		return this.source;
	}

	/**
	 * Array of wildcard (*) patterns. The request returns values for field names
	 * matching these patterns in the hits.fields property of the response.
	 * <p>
	 * API name: {@code fields}
	 */
	@Nullable
	public List<JsonValue /* Union(_types.DateField | _types.Field) */> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code suggest}
	 */
	@Nullable
	public JsonValue /*
						 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
						 * (singleKey = false) | _global.search._types.SuggestContainer)
						 */ suggest() {
		return this.suggest;
	}

	/**
	 * Maximum number of documents to collect for each shard. If a query reaches
	 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
	 * documents before sorting. Defaults to 0, which does not terminate query
	 * execution early.
	 * <p>
	 * API name: {@code terminate_after}
	 */
	@Nullable
	public Long terminateAfter() {
		return this.terminateAfter;
	}

	/**
	 * Specifies the period of time to wait for a response from each shard. If no
	 * response is received before the timeout expires, the request fails and
	 * returns an error. Defaults to no timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * If true, calculate and return document scores, even if the scores are not
	 * used for sorting.
	 * <p>
	 * API name: {@code track_scores}
	 */
	@Nullable
	public Boolean trackScores() {
		return this.trackScores;
	}

	/**
	 * If true, returns document version as part of a hit.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public Boolean version() {
		return this.version;
	}

	/**
	 * If true, returns sequence number and primary term of the last modification of
	 * each hit. See Optimistic concurrency control.
	 * <p>
	 * API name: {@code seq_no_primary_term}
	 */
	@Nullable
	public Boolean seqNoPrimaryTerm() {
		return this.seqNoPrimaryTerm;
	}

	/**
	 * List of stored fields to return as part of a hit. If no fields are specified,
	 * no stored fields are included in the response. If this field is specified,
	 * the _source parameter defaults to false. You can pass _source: true to return
	 * both source fields and stored fields in the search response.
	 * <p>
	 * API name: {@code stored_fields}
	 */
	@Nullable
	public List<String> storedFields() {
		return this.storedFields;
	}

	/**
	 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
	 * specify an &lt;index&gt; in the request path.
	 * <p>
	 * API name: {@code pit}
	 */
	@Nullable
	public PointInTimeReference pit() {
		return this.pit;
	}

	/**
	 * Defines one or more runtime fields in the search request. These fields take
	 * precedence over mapped fields with the same name.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	@Nullable
	public Map<String, RuntimeField> runtimeMappings() {
		return this.runtimeMappings;
	}

	/**
	 * Stats groups to associate with the search. Each group maintains a statistics
	 * aggregation for its associated searches. You can retrieve these stats using
	 * the indices stats API.
	 * <p>
	 * API name: {@code stats}
	 */
	@Nullable
	public List<String> stats() {
		return this.stats;
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

		if (this.aggs != null) {

			generator.writeKey("aggs");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggs.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, Aggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.collapse != null) {

			generator.writeKey("collapse");
			this.collapse.serialize(generator, mapper);

		}
		if (this.explain != null) {

			generator.writeKey("explain");
			generator.write(this.explain);

		}
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.highlight != null) {

			generator.writeKey("highlight");
			this.highlight.serialize(generator, mapper);

		}
		if (this.trackTotalHits != null) {

			generator.writeKey("track_total_hits");
			generator.write(this.trackTotalHits);

		}
		if (this.indicesBoost != null) {

			generator.writeKey("indices_boost");
			generator.writeStartArray();
			for (Map<String, Double> item0 : this.indicesBoost) {
				generator.writeStartObject();
				for (Map.Entry<String, Double> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					generator.write(item1.getValue());

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.docvalueFields != null) {

			generator.writeKey("docvalue_fields");
			generator.write(this.docvalueFields);

		}
		if (this.minScore != null) {

			generator.writeKey("min_score");
			generator.write(this.minScore);

		}
		if (this.postFilter != null) {

			generator.writeKey("post_filter");
			this.postFilter.serialize(generator, mapper);

		}
		if (this.profile != null) {

			generator.writeKey("profile");
			generator.write(this.profile);

		}
		if (this.query != null) {

			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}
		if (this.rescore != null) {

			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.scriptFields != null) {

			generator.writeKey("script_fields");
			generator.writeStartObject();
			for (Map.Entry<String, ScriptField> item0 : this.scriptFields.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.searchAfter != null) {

			generator.writeKey("search_after");
			generator.writeStartArray();
			for (String item0 : this.searchAfter) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.slice != null) {

			generator.writeKey("slice");
			this.slice.serialize(generator, mapper);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue /* _global.search._types.SortCombinations */ item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.source != null) {

			generator.writeKey("_source");
			generator.write(this.source);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (JsonValue /* Union(_types.DateField | _types.Field) */ item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.suggest != null) {

			generator.writeKey("suggest");
			generator.write(this.suggest);

		}
		if (this.terminateAfter != null) {

			generator.writeKey("terminate_after");
			generator.write(this.terminateAfter);

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}
		if (this.trackScores != null) {

			generator.writeKey("track_scores");
			generator.write(this.trackScores);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.seqNoPrimaryTerm != null) {

			generator.writeKey("seq_no_primary_term");
			generator.write(this.seqNoPrimaryTerm);

		}
		if (this.storedFields != null) {

			generator.writeKey("stored_fields");
			generator.writeStartArray();
			for (String item0 : this.storedFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.pit != null) {

			generator.writeKey("pit");
			this.pit.serialize(generator, mapper);

		}
		if (this.runtimeMappings != null) {

			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.stats != null) {

			generator.writeKey("stats");
			generator.writeStartArray();
			for (String item0 : this.stats) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SubmitRequest}.
	 */
	public static class Builder implements ObjectBuilder<SubmitRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private String waitForCompletionTimeout;

		@Nullable
		private Boolean keepOnCompletion;

		@Nullable
		private String keepAlive;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean allowPartialSearchResults;

		@Nullable
		private String analyzer;

		@Nullable
		private Boolean analyzeWildcard;

		@Nullable
		private Long batchedReduceSize;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private DefaultOperator defaultOperator;

		@Nullable
		private String df;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Long maxConcurrentShardRequests;

		@Nullable
		private String minCompatibleShardNode;

		@Nullable
		private String preference;

		@Nullable
		private Long preFilterShardSize;

		@Nullable
		private Boolean requestCache;

		@Nullable
		private String routing;

		@Nullable
		private String scroll;

		@Nullable
		private SearchType searchType;

		@Nullable
		private String suggestField;

		@Nullable
		private SuggestMode suggestMode;

		@Nullable
		private Long suggestSize;

		@Nullable
		private String suggestText;

		@Nullable
		private Boolean typedKeys;

		@Nullable
		private Boolean restTotalHitsAsInt;

		@Nullable
		private List<String> sourceExcludes;

		@Nullable
		private List<String> sourceIncludes;

		@Nullable
		private String q;

		@Nullable
		private Map<String, Aggregation> aggs;

		@Nullable
		private Map<String, Aggregation> aggregations;

		@Nullable
		private FieldCollapse collapse;

		@Nullable
		private Boolean explain;

		@Nullable
		private Integer from;

		@Nullable
		private Highlight highlight;

		@Nullable
		private JsonValue /* Union(_types.integer | internal.boolean) */ trackTotalHits;

		@Nullable
		private List<Map<String, Double>> indicesBoost;

		@Nullable
		private JsonValue /*
							 * Union(Array<Union(_global.search._types.DocValueField | _types.Field)> |
							 * _global.search._types.DocValueField)
							 */ docvalueFields;

		@Nullable
		private Double minScore;

		@Nullable
		private Query postFilter;

		@Nullable
		private Boolean profile;

		@Nullable
		private Query query;

		@Nullable
		private List<Rescore> rescore;

		@Nullable
		private Map<String, ScriptField> scriptFields;

		@Nullable
		private List<String> searchAfter;

		@Nullable
		private Integer size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private List<JsonValue /* _global.search._types.SortCombinations */> sort;

		@Nullable
		private JsonValue /*
							 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
							 */ source;

		@Nullable
		private List<JsonValue /* Union(_types.DateField | _types.Field) */> fields;

		@Nullable
		private JsonValue /*
							 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
							 * (singleKey = false) | _global.search._types.SuggestContainer)
							 */ suggest;

		@Nullable
		private Long terminateAfter;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean trackScores;

		@Nullable
		private Boolean version;

		@Nullable
		private Boolean seqNoPrimaryTerm;

		@Nullable
		private List<String> storedFields;

		@Nullable
		private PointInTimeReference pit;

		@Nullable
		private Map<String, RuntimeField> runtimeMappings;

		@Nullable
		private List<String> stats;

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to search; use <code>_all</code> or
		 * empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Specify the time that the request should block waiting for the final response
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public Builder waitForCompletionTimeout(@Nullable String value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Control whether the response should be stored in the cluster if it completed
		 * within the provided [wait_for_completion] time (default: false)
		 * <p>
		 * API name: {@code keep_on_completion}
		 */
		public Builder keepOnCompletion(@Nullable Boolean value) {
			this.keepOnCompletion = value;
			return this;
		}

		/**
		 * Update the time interval in which the results (partial or final) for this
		 * search will be available
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Indicate if an error should be returned if there is a partial search failure
		 * or timeout
		 * <p>
		 * API name: {@code allow_partial_search_results}
		 */
		public Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * The analyzer to use for the query string
		 * <p>
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Specify whether wildcard and prefix queries should be analyzed (default:
		 * false)
		 * <p>
		 * API name: {@code analyze_wildcard}
		 */
		public Builder analyzeWildcard(@Nullable Boolean value) {
			this.analyzeWildcard = value;
			return this;
		}

		/**
		 * The number of shard results that should be reduced at once on the
		 * coordinating node. This value should be used as the granularity at which
		 * progress results will be made available.
		 * <p>
		 * API name: {@code batched_reduce_size}
		 */
		public Builder batchedReduceSize(@Nullable Long value) {
			this.batchedReduceSize = value;
			return this;
		}

		/**
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * The default operator for query string query (AND or OR)
		 * <p>
		 * API name: {@code default_operator}
		 */
		public Builder defaultOperator(@Nullable DefaultOperator value) {
			this.defaultOperator = value;
			return this;
		}

		/**
		 * The field to use as default where no field prefix is given in the query
		 * string
		 * <p>
		 * API name: {@code df}
		 */
		public Builder df(@Nullable String value) {
			this.df = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed.
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
			return this;
		}

		/**
		 * Whether specified concrete, expanded or aliased indices should be ignored
		 * when throttled
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Specify whether format-based query failures (such as providing text to a
		 * numeric field) should be ignored
		 * <p>
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * The number of concurrent shard requests per node this search executes
		 * concurrently. This value should be used to limit the impact of the search on
		 * the cluster in order to limit the number of concurrent shard requests
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public Builder maxConcurrentShardRequests(@Nullable Long value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * API name: {@code min_compatible_shard_node}
		 */
		public Builder minCompatibleShardNode(@Nullable String value) {
			this.minCompatibleShardNode = value;
			return this;
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * API name: {@code pre_filter_shard_size}
		 */
		public Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Specify if request cache should be used for this request or not, defaults to
		 * true
		 * <p>
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(@Nullable Boolean value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * A comma-separated list of specific routing values
		 * <p>
		 * API name: {@code routing}
		 */
		public Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code scroll}
		 */
		public Builder scroll(@Nullable String value) {
			this.scroll = value;
			return this;
		}

		/**
		 * Search operation type
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Specifies which field to use for suggestions.
		 * <p>
		 * API name: {@code suggest_field}
		 */
		public Builder suggestField(@Nullable String value) {
			this.suggestField = value;
			return this;
		}

		/**
		 * Specify suggest mode
		 * <p>
		 * API name: {@code suggest_mode}
		 */
		public Builder suggestMode(@Nullable SuggestMode value) {
			this.suggestMode = value;
			return this;
		}

		/**
		 * How many suggestions to return in response
		 * <p>
		 * API name: {@code suggest_size}
		 */
		public Builder suggestSize(@Nullable Long value) {
			this.suggestSize = value;
			return this;
		}

		/**
		 * The source text for which the suggestions should be returned.
		 * <p>
		 * API name: {@code suggest_text}
		 */
		public Builder suggestText(@Nullable String value) {
			this.suggestText = value;
			return this;
		}

		/**
		 * Specify whether aggregation and suggester names should be prefixed by their
		 * respective types in the response
		 * <p>
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * API name: {@code rest_total_hits_as_int}
		 */
		public Builder restTotalHitsAsInt(@Nullable Boolean value) {
			this.restTotalHitsAsInt = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(@Nullable List<String> value) {
			this.sourceExcludes = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned _source field
		 * <p>
		 * API name: {@code _source_excludes}
		 */
		public Builder sourceExcludes(String... value) {
			this.sourceExcludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceExcludes(List)}, creating the list if needed.
		 */
		public Builder addSourceExcludes(String value) {
			if (this.sourceExcludes == null) {
				this.sourceExcludes = new ArrayList<>();
			}
			this.sourceExcludes.add(value);
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(@Nullable List<String> value) {
			this.sourceIncludes = value;
			return this;
		}

		/**
		 * A list of fields to extract and return from the _source field
		 * <p>
		 * API name: {@code _source_includes}
		 */
		public Builder sourceIncludes(String... value) {
			this.sourceIncludes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sourceIncludes(List)}, creating the list if needed.
		 */
		public Builder addSourceIncludes(String value) {
			if (this.sourceIncludes == null) {
				this.sourceIncludes = new ArrayList<>();
			}
			this.sourceIncludes.add(value);
			return this;
		}

		/**
		 * Query in the Lucene query string syntax
		 * <p>
		 * API name: {@code q}
		 */
		public Builder q(@Nullable String value) {
			this.q = value;
			return this;
		}

		/**
		 * API name: {@code aggs}
		 */
		public Builder aggs(@Nullable Map<String, Aggregation> value) {
			this.aggs = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Aggregation value) {
			if (this.aggs == null) {
				this.aggs = new HashMap<>();
			}
			this.aggs.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggs(Map)} to a singleton map.
		 */
		public Builder aggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggs(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggs(Map)}, creating the map if needed.
		 */
		public Builder putAggs(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggs(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, Aggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Aggregation value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.aggregations(Collections.singletonMap(key, fn.apply(new Aggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, Function<Aggregation.Builder, ObjectBuilder<Aggregation>> fn) {
			return this.putAggregations(key, fn.apply(new Aggregation.Builder()).build());
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(@Nullable FieldCollapse value) {
			this.collapse = value;
			return this;
		}

		/**
		 * API name: {@code collapse}
		 */
		public Builder collapse(Function<FieldCollapse.Builder, ObjectBuilder<FieldCollapse>> fn) {
			return this.collapse(fn.apply(new FieldCollapse.Builder()).build());
		}

		/**
		 * If true, returns detailed information about score computation as part of a
		 * hit.
		 * <p>
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Starting document offset. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(@Nullable Highlight value) {
			this.highlight = value;
			return this;
		}

		/**
		 * API name: {@code highlight}
		 */
		public Builder highlight(Function<Highlight.Builder, ObjectBuilder<Highlight>> fn) {
			return this.highlight(fn.apply(new Highlight.Builder()).build());
		}

		/**
		 * Number of hits matching the query to count accurately. If true, the exact
		 * number of hits is returned at the cost of some performance. If false, the
		 * response does not include the total number of hits matching the query.
		 * Defaults to 10,000 hits.
		 * <p>
		 * API name: {@code track_total_hits}
		 */
		public Builder trackTotalHits(@Nullable JsonValue /* Union(_types.integer | internal.boolean) */ value) {
			this.trackTotalHits = value;
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(@Nullable List<Map<String, Double>> value) {
			this.indicesBoost = value;
			return this;
		}

		/**
		 * Boosts the _score of documents from specified indices.
		 * <p>
		 * API name: {@code indices_boost}
		 */
		public Builder indicesBoost(Map<String, Double>... value) {
			this.indicesBoost = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indicesBoost(List)}, creating the list if needed.
		 */
		public Builder addIndicesBoost(Map<String, Double> value) {
			if (this.indicesBoost == null) {
				this.indicesBoost = new ArrayList<>();
			}
			this.indicesBoost.add(value);
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns doc values for field
		 * names matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code docvalue_fields}
		 */
		public Builder docvalueFields(@Nullable JsonValue /*
															 * Union(Array<Union(_global.search._types.DocValueField |
															 * _types.Field)> | _global.search._types.DocValueField)
															 */ value) {
			this.docvalueFields = value;
			return this;
		}

		/**
		 * Minimum _score for matching documents. Documents with a lower _score are not
		 * included in the search results.
		 * <p>
		 * API name: {@code min_score}
		 */
		public Builder minScore(@Nullable Double value) {
			this.minScore = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(@Nullable Query value) {
			this.postFilter = value;
			return this;
		}

		/**
		 * API name: {@code post_filter}
		 */
		public Builder postFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.postFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code profile}
		 */
		public Builder profile(@Nullable Boolean value) {
			this.profile = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Defines the search definition using the Query DSL.
		 * <p>
		 * API name: {@code query}
		 */
		public Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(@Nullable List<Rescore> value) {
			this.rescore = value;
			return this;
		}

		/**
		 * API name: {@code rescore}
		 */
		public Builder rescore(Rescore... value) {
			this.rescore = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Rescore value) {
			if (this.rescore == null) {
				this.rescore = new ArrayList<>();
			}
			this.rescore.add(value);
			return this;
		}

		/**
		 * Set {@link #rescore(List)} to a singleton list.
		 */
		public Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.rescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * Add a value to {@link #rescore(List)}, creating the list if needed.
		 */
		public Builder addRescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return this.addRescore(fn.apply(new Rescore.Builder()).build());
		}

		/**
		 * Retrieve a script evaluation (based on different fields) for each hit.
		 * <p>
		 * API name: {@code script_fields}
		 */
		public Builder scriptFields(@Nullable Map<String, ScriptField> value) {
			this.scriptFields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, ScriptField value) {
			if (this.scriptFields == null) {
				this.scriptFields = new HashMap<>();
			}
			this.scriptFields.put(key, value);
			return this;
		}

		/**
		 * Set {@link #scriptFields(Map)} to a singleton map.
		 */
		public Builder scriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.scriptFields(Collections.singletonMap(key, fn.apply(new ScriptField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #scriptFields(Map)}, creating the map if needed.
		 */
		public Builder putScriptFields(String key, Function<ScriptField.Builder, ObjectBuilder<ScriptField>> fn) {
			return this.putScriptFields(key, fn.apply(new ScriptField.Builder()).build());
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(@Nullable List<String> value) {
			this.searchAfter = value;
			return this;
		}

		/**
		 * API name: {@code search_after}
		 */
		public Builder searchAfter(String... value) {
			this.searchAfter = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searchAfter(List)}, creating the list if needed.
		 */
		public Builder addSearchAfter(String value) {
			if (this.searchAfter == null) {
				this.searchAfter = new ArrayList<>();
			}
			this.searchAfter.add(value);
			return this;
		}

		/**
		 * The number of hits to return. By default, you cannot page through more than
		 * 10,000 hits using the from and size parameters. To page through more hits,
		 * use the search_after parameter.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue /* _global.search._types.SortCombinations */> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue /* _global.search._types.SortCombinations */... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue /* _global.search._types.SortCombinations */ value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * Indicates which source fields are returned for matching documents. These
		 * fields are returned in the hits._source property of the search response.
		 * <p>
		 * API name: {@code _source}
		 */
		public Builder source(
				@Nullable JsonValue /*
									 * Union(_global.search._types.SourceFilter | _types.Fields | internal.boolean)
									 */ value) {
			this.source = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<JsonValue /* Union(_types.DateField | _types.Field) */> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Array of wildcard (*) patterns. The request returns values for field names
		 * matching these patterns in the hits.fields property of the response.
		 * <p>
		 * API name: {@code fields}
		 */
		public Builder fields(JsonValue /* Union(_types.DateField | _types.Field) */... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(JsonValue /* Union(_types.DateField | _types.Field) */ value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code suggest}
		 */
		public Builder suggest(
				@Nullable JsonValue /*
									 * Union(Dictionary<internal.string, _global.search._types.SuggestContainer>
									 * (singleKey = false) | _global.search._types.SuggestContainer)
									 */ value) {
			this.suggest = value;
			return this;
		}

		/**
		 * Maximum number of documents to collect for each shard. If a query reaches
		 * this limit, Elasticsearch terminates the query early. Elasticsearch collects
		 * documents before sorting. Defaults to 0, which does not terminate query
		 * execution early.
		 * <p>
		 * API name: {@code terminate_after}
		 */
		public Builder terminateAfter(@Nullable Long value) {
			this.terminateAfter = value;
			return this;
		}

		/**
		 * Specifies the period of time to wait for a response from each shard. If no
		 * response is received before the timeout expires, the request fails and
		 * returns an error. Defaults to no timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * If true, calculate and return document scores, even if the scores are not
		 * used for sorting.
		 * <p>
		 * API name: {@code track_scores}
		 */
		public Builder trackScores(@Nullable Boolean value) {
			this.trackScores = value;
			return this;
		}

		/**
		 * If true, returns document version as part of a hit.
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Boolean value) {
			this.version = value;
			return this;
		}

		/**
		 * If true, returns sequence number and primary term of the last modification of
		 * each hit. See Optimistic concurrency control.
		 * <p>
		 * API name: {@code seq_no_primary_term}
		 */
		public Builder seqNoPrimaryTerm(@Nullable Boolean value) {
			this.seqNoPrimaryTerm = value;
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(@Nullable List<String> value) {
			this.storedFields = value;
			return this;
		}

		/**
		 * List of stored fields to return as part of a hit. If no fields are specified,
		 * no stored fields are included in the response. If this field is specified,
		 * the _source parameter defaults to false. You can pass _source: true to return
		 * both source fields and stored fields in the search response.
		 * <p>
		 * API name: {@code stored_fields}
		 */
		public Builder storedFields(String... value) {
			this.storedFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #storedFields(List)}, creating the list if needed.
		 */
		public Builder addStoredFields(String value) {
			if (this.storedFields == null) {
				this.storedFields = new ArrayList<>();
			}
			this.storedFields.add(value);
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public Builder pit(@Nullable PointInTimeReference value) {
			this.pit = value;
			return this;
		}

		/**
		 * Limits the search to a point in time (PIT). If you provide a PIT, you cannot
		 * specify an &lt;index&gt; in the request path.
		 * <p>
		 * API name: {@code pit}
		 */
		public Builder pit(Function<PointInTimeReference.Builder, ObjectBuilder<PointInTimeReference>> fn) {
			return this.pit(fn.apply(new PointInTimeReference.Builder()).build());
		}

		/**
		 * Defines one or more runtime fields in the search request. These fields take
		 * precedence over mapped fields with the same name.
		 * <p>
		 * API name: {@code runtime_mappings}
		 */
		public Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, RuntimeField value) {
			if (this.runtimeMappings == null) {
				this.runtimeMappings = new HashMap<>();
			}
			this.runtimeMappings.put(key, value);
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #runtimeMappings(Map)}, creating the map if needed.
		 */
		public Builder putRuntimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.putRuntimeMappings(key, fn.apply(new RuntimeField.Builder()).build());
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 */
		public Builder stats(@Nullable List<String> value) {
			this.stats = value;
			return this;
		}

		/**
		 * Stats groups to associate with the search. Each group maintains a statistics
		 * aggregation for its associated searches. You can retrieve these stats using
		 * the indices stats API.
		 * <p>
		 * API name: {@code stats}
		 */
		public Builder stats(String... value) {
			this.stats = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #stats(List)}, creating the list if needed.
		 */
		public Builder addStats(String value) {
			if (this.stats == null) {
				this.stats = new ArrayList<>();
			}
			this.stats.add(value);
			return this;
		}

		/**
		 * Builds a {@link SubmitRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SubmitRequest build() {

			return new SubmitRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SubmitRequest}
	 */
	public static final JsonpDeserializer<SubmitRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SubmitRequest::setupSubmitRequestDeserializer, Builder::build);

	protected static void setupSubmitRequestDeserializer(DelegatingDeserializer<SubmitRequest.Builder> op) {

		op.add(Builder::aggs, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER), "aggs");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(Aggregation._DESERIALIZER),
				"aggregations");
		op.add(Builder::collapse, FieldCollapse._DESERIALIZER, "collapse");
		op.add(Builder::explain, JsonpDeserializer.booleanDeserializer(), "explain");
		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::highlight, Highlight._DESERIALIZER, "highlight");
		op.add(Builder::trackTotalHits, JsonpDeserializer.jsonValueDeserializer(), "track_total_hits");
		op.add(Builder::indicesBoost,
				JsonpDeserializer.arrayDeserializer(
						JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer())),
				"indices_boost");
		op.add(Builder::docvalueFields, JsonpDeserializer.jsonValueDeserializer(), "docvalue_fields");
		op.add(Builder::minScore, JsonpDeserializer.doubleDeserializer(), "min_score");
		op.add(Builder::postFilter, Query._DESERIALIZER, "post_filter");
		op.add(Builder::profile, JsonpDeserializer.booleanDeserializer(), "profile");
		op.add(Builder::query, Query._DESERIALIZER, "query");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore._DESERIALIZER), "rescore");
		op.add(Builder::scriptFields, JsonpDeserializer.stringMapDeserializer(ScriptField._DESERIALIZER),
				"script_fields");
		op.add(Builder::searchAfter, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"search_after");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");
		op.add(Builder::slice, SlicedScroll._DESERIALIZER, "slice");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");
		op.add(Builder::source, JsonpDeserializer.jsonValueDeserializer(), "_source");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"fields");
		op.add(Builder::suggest, JsonpDeserializer.jsonValueDeserializer(), "suggest");
		op.add(Builder::terminateAfter, JsonpDeserializer.longDeserializer(), "terminate_after");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::trackScores, JsonpDeserializer.booleanDeserializer(), "track_scores");
		op.add(Builder::version, JsonpDeserializer.booleanDeserializer(), "version");
		op.add(Builder::seqNoPrimaryTerm, JsonpDeserializer.booleanDeserializer(), "seq_no_primary_term");
		op.add(Builder::storedFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stored_fields");
		op.add(Builder::pit, PointInTimeReference._DESERIALIZER, "pit");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");
		op.add(Builder::stats, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "stats");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.submit}".
	 */
	private static final SimpleEndpoint<SubmitRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_async_search");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_async_search");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout);
				}
				if (request.keepOnCompletion != null) {
					params.put("keep_on_completion", String.valueOf(request.keepOnCompletion));
				}
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive);
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.allowPartialSearchResults != null) {
					params.put("allow_partial_search_results", String.valueOf(request.allowPartialSearchResults));
				}
				if (request.analyzer != null) {
					params.put("analyzer", request.analyzer);
				}
				if (request.analyzeWildcard != null) {
					params.put("analyze_wildcard", String.valueOf(request.analyzeWildcard));
				}
				if (request.batchedReduceSize != null) {
					params.put("batched_reduce_size", String.valueOf(request.batchedReduceSize));
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.defaultOperator != null) {
					params.put("default_operator", request.defaultOperator.toString());
				}
				if (request.df != null) {
					params.put("df", request.df);
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.lenient != null) {
					params.put("lenient", String.valueOf(request.lenient));
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
				if (request.minCompatibleShardNode != null) {
					params.put("min_compatible_shard_node", request.minCompatibleShardNode);
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				if (request.preFilterShardSize != null) {
					params.put("pre_filter_shard_size", String.valueOf(request.preFilterShardSize));
				}
				if (request.requestCache != null) {
					params.put("request_cache", String.valueOf(request.requestCache));
				}
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.scroll != null) {
					params.put("scroll", request.scroll);
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.suggestField != null) {
					params.put("suggest_field", request.suggestField);
				}
				if (request.suggestMode != null) {
					params.put("suggest_mode", request.suggestMode.toString());
				}
				if (request.suggestSize != null) {
					params.put("suggest_size", String.valueOf(request.suggestSize));
				}
				if (request.suggestText != null) {
					params.put("suggest_text", request.suggestText);
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				if (request.restTotalHitsAsInt != null) {
					params.put("rest_total_hits_as_int", String.valueOf(request.restTotalHitsAsInt));
				}
				if (request.sourceExcludes != null) {
					params.put("_source_excludes",
							request.sourceExcludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.sourceIncludes != null) {
					params.put("_source_includes",
							request.sourceIncludes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.q != null) {
					params.put("q", request.q);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code async_search.submit}" endpoint.
	 */
	public static <TDocument> Endpoint<SubmitRequest, SubmitResponse<TDocument>, ErrorResponse> createSubmitEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(SubmitResponse.createSubmitResponseDeserializer(tDocumentDeserializer));
	}
}
