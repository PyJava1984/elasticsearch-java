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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.GroupBy;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: tasks.list.Request

public final class ListRequest extends RequestBase {
	@Nullable
	private final List<String> actions;

	@Nullable
	private final Boolean detailed;

	@Nullable
	private final GroupBy groupBy;

	@Nullable
	private final List<String> nodes;

	@Nullable
	private final String parentTaskId;

	@Nullable
	private final String timeout;

	@Nullable
	private final Boolean waitForCompletion;

	// ---------------------------------------------------------------------------------------------

	public ListRequest(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiable(builder.actions);
		this.detailed = builder.detailed;
		this.groupBy = builder.groupBy;
		this.nodes = ModelTypeHelper.unmodifiable(builder.nodes);
		this.parentTaskId = builder.parentTaskId;
		this.timeout = builder.timeout;
		this.waitForCompletion = builder.waitForCompletion;

	}

	public ListRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of actions that should be returned. Leave empty to
	 * return all.
	 * <p>
	 * API name: {@code actions}
	 */
	@Nullable
	public List<String> actions() {
		return this.actions;
	}

	/**
	 * Return detailed task information (default: false)
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public Boolean detailed() {
		return this.detailed;
	}

	/**
	 * Group tasks by nodes or parent/child relationships
	 * <p>
	 * API name: {@code group_by}
	 */
	@Nullable
	public GroupBy groupBy() {
		return this.groupBy;
	}

	/**
	 * A comma-separated list of node IDs or names to limit the returned
	 * information; use <code>_local</code> to return information from the node
	 * you're connecting to, leave empty to get information from all nodes
	 * <p>
	 * API name: {@code nodes}
	 */
	@Nullable
	public List<String> nodes() {
		return this.nodes;
	}

	/**
	 * Return tasks with specified parent task id (node_id:task_number). Set to -1
	 * to return all.
	 * <p>
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public String parentTaskId() {
		return this.parentTaskId;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Wait for the matching tasks to complete (default: false)
	 * <p>
	 * API name: {@code wait_for_completion}
	 */
	@Nullable
	public Boolean waitForCompletion() {
		return this.waitForCompletion;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListRequest}.
	 */
	public static class Builder implements ObjectBuilder<ListRequest> {
		@Nullable
		private List<String> actions;

		@Nullable
		private Boolean detailed;

		@Nullable
		private GroupBy groupBy;

		@Nullable
		private List<String> nodes;

		@Nullable
		private String parentTaskId;

		@Nullable
		private String timeout;

		@Nullable
		private Boolean waitForCompletion;

		/**
		 * A comma-separated list of actions that should be returned. Leave empty to
		 * return all.
		 * <p>
		 * API name: {@code actions}
		 */
		public Builder actions(@Nullable List<String> value) {
			this.actions = value;
			return this;
		}

		/**
		 * A comma-separated list of actions that should be returned. Leave empty to
		 * return all.
		 * <p>
		 * API name: {@code actions}
		 */
		public Builder actions(String... value) {
			this.actions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #actions(List)}, creating the list if needed.
		 */
		public Builder addActions(String value) {
			if (this.actions == null) {
				this.actions = new ArrayList<>();
			}
			this.actions.add(value);
			return this;
		}

		/**
		 * Return detailed task information (default: false)
		 * <p>
		 * API name: {@code detailed}
		 */
		public Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
			return this;
		}

		/**
		 * Group tasks by nodes or parent/child relationships
		 * <p>
		 * API name: {@code group_by}
		 */
		public Builder groupBy(@Nullable GroupBy value) {
			this.groupBy = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code nodes}
		 */
		public Builder nodes(@Nullable List<String> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * A comma-separated list of node IDs or names to limit the returned
		 * information; use <code>_local</code> to return information from the node
		 * you're connecting to, leave empty to get information from all nodes
		 * <p>
		 * API name: {@code nodes}
		 */
		public Builder nodes(String... value) {
			this.nodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodes(List)}, creating the list if needed.
		 */
		public Builder addNodes(String value) {
			if (this.nodes == null) {
				this.nodes = new ArrayList<>();
			}
			this.nodes.add(value);
			return this;
		}

		/**
		 * Return tasks with specified parent task id (node_id:task_number). Set to -1
		 * to return all.
		 * <p>
		 * API name: {@code parent_task_id}
		 */
		public Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Wait for the matching tasks to complete (default: false)
		 * <p>
		 * API name: {@code wait_for_completion}
		 */
		public Builder waitForCompletion(@Nullable Boolean value) {
			this.waitForCompletion = value;
			return this;
		}

		/**
		 * Builds a {@link ListRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListRequest build() {

			return new ListRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code tasks.list}".
	 */
	public static final Endpoint<ListRequest, ListResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_tasks";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.actions != null) {
					params.put("actions", request.actions.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (request.groupBy != null) {
					params.put("group_by", request.groupBy.toString());
				}
				if (request.nodes != null) {
					params.put("nodes", request.nodes.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.parentTaskId != null) {
					params.put("parent_task_id", request.parentTaskId);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				if (request.waitForCompletion != null) {
					params.put("wait_for_completion", String.valueOf(request.waitForCompletion));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ListResponse._DESERIALIZER);
}
