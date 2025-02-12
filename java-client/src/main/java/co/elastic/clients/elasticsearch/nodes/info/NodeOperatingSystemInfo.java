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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeOperatingSystemInfo
@JsonpDeserializable
public final class NodeOperatingSystemInfo implements JsonpSerializable {
	private final String arch;

	private final int availableProcessors;

	@Nullable
	private final Integer allocatedProcessors;

	private final String name;

	private final String prettyName;

	private final int refreshIntervalInMillis;

	private final String version;

	@Nullable
	private final NodeInfoOSCPU cpu;

	@Nullable
	private final NodeInfoMemory mem;

	@Nullable
	private final NodeInfoMemory swap;

	// ---------------------------------------------------------------------------------------------

	public NodeOperatingSystemInfo(Builder builder) {

		this.arch = Objects.requireNonNull(builder.arch, "arch");
		this.availableProcessors = Objects.requireNonNull(builder.availableProcessors, "available_processors");
		this.allocatedProcessors = builder.allocatedProcessors;
		this.name = Objects.requireNonNull(builder.name, "name");
		this.prettyName = Objects.requireNonNull(builder.prettyName, "pretty_name");
		this.refreshIntervalInMillis = Objects.requireNonNull(builder.refreshIntervalInMillis,
				"refresh_interval_in_millis");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.cpu = builder.cpu;
		this.mem = builder.mem;
		this.swap = builder.swap;

	}

	public NodeOperatingSystemInfo(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Name of the JVM architecture (ex: amd64, x86)
	 * <p>
	 * API name: {@code arch}
	 */
	public String arch() {
		return this.arch;
	}

	/**
	 * Required - Number of processors available to the Java virtual machine
	 * <p>
	 * API name: {@code available_processors}
	 */
	public int availableProcessors() {
		return this.availableProcessors;
	}

	/**
	 * The number of processors actually used to calculate thread pool size. This
	 * number can be set with the node.processors setting of a node and defaults to
	 * the number of processors reported by the OS.
	 * <p>
	 * API name: {@code allocated_processors}
	 */
	@Nullable
	public Integer allocatedProcessors() {
		return this.allocatedProcessors;
	}

	/**
	 * Required - Name of the operating system (ex: Linux, Windows, Mac OS X)
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code pretty_name}
	 */
	public String prettyName() {
		return this.prettyName;
	}

	/**
	 * Required - Refresh interval for the OS statistics
	 * <p>
	 * API name: {@code refresh_interval_in_millis}
	 */
	public int refreshIntervalInMillis() {
		return this.refreshIntervalInMillis;
	}

	/**
	 * Required - Version of the operating system
	 * <p>
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code cpu}
	 */
	@Nullable
	public NodeInfoOSCPU cpu() {
		return this.cpu;
	}

	/**
	 * API name: {@code mem}
	 */
	@Nullable
	public NodeInfoMemory mem() {
		return this.mem;
	}

	/**
	 * API name: {@code swap}
	 */
	@Nullable
	public NodeInfoMemory swap() {
		return this.swap;
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

		generator.writeKey("arch");
		generator.write(this.arch);

		generator.writeKey("available_processors");
		generator.write(this.availableProcessors);

		if (this.allocatedProcessors != null) {

			generator.writeKey("allocated_processors");
			generator.write(this.allocatedProcessors);

		}

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("pretty_name");
		generator.write(this.prettyName);

		generator.writeKey("refresh_interval_in_millis");
		generator.write(this.refreshIntervalInMillis);

		generator.writeKey("version");
		generator.write(this.version);

		if (this.cpu != null) {

			generator.writeKey("cpu");
			this.cpu.serialize(generator, mapper);

		}
		if (this.mem != null) {

			generator.writeKey("mem");
			this.mem.serialize(generator, mapper);

		}
		if (this.swap != null) {

			generator.writeKey("swap");
			this.swap.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeOperatingSystemInfo}.
	 */
	public static class Builder implements ObjectBuilder<NodeOperatingSystemInfo> {
		private String arch;

		private Integer availableProcessors;

		@Nullable
		private Integer allocatedProcessors;

		private String name;

		private String prettyName;

		private Integer refreshIntervalInMillis;

		private String version;

		@Nullable
		private NodeInfoOSCPU cpu;

		@Nullable
		private NodeInfoMemory mem;

		@Nullable
		private NodeInfoMemory swap;

		/**
		 * Required - Name of the JVM architecture (ex: amd64, x86)
		 * <p>
		 * API name: {@code arch}
		 */
		public Builder arch(String value) {
			this.arch = value;
			return this;
		}

		/**
		 * Required - Number of processors available to the Java virtual machine
		 * <p>
		 * API name: {@code available_processors}
		 */
		public Builder availableProcessors(int value) {
			this.availableProcessors = value;
			return this;
		}

		/**
		 * The number of processors actually used to calculate thread pool size. This
		 * number can be set with the node.processors setting of a node and defaults to
		 * the number of processors reported by the OS.
		 * <p>
		 * API name: {@code allocated_processors}
		 */
		public Builder allocatedProcessors(@Nullable Integer value) {
			this.allocatedProcessors = value;
			return this;
		}

		/**
		 * Required - Name of the operating system (ex: Linux, Windows, Mac OS X)
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code pretty_name}
		 */
		public Builder prettyName(String value) {
			this.prettyName = value;
			return this;
		}

		/**
		 * Required - Refresh interval for the OS statistics
		 * <p>
		 * API name: {@code refresh_interval_in_millis}
		 */
		public Builder refreshIntervalInMillis(int value) {
			this.refreshIntervalInMillis = value;
			return this;
		}

		/**
		 * Required - Version of the operating system
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code cpu}
		 */
		public Builder cpu(@Nullable NodeInfoOSCPU value) {
			this.cpu = value;
			return this;
		}

		/**
		 * API name: {@code cpu}
		 */
		public Builder cpu(Function<NodeInfoOSCPU.Builder, ObjectBuilder<NodeInfoOSCPU>> fn) {
			return this.cpu(fn.apply(new NodeInfoOSCPU.Builder()).build());
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(@Nullable NodeInfoMemory value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(Function<NodeInfoMemory.Builder, ObjectBuilder<NodeInfoMemory>> fn) {
			return this.mem(fn.apply(new NodeInfoMemory.Builder()).build());
		}

		/**
		 * API name: {@code swap}
		 */
		public Builder swap(@Nullable NodeInfoMemory value) {
			this.swap = value;
			return this;
		}

		/**
		 * API name: {@code swap}
		 */
		public Builder swap(Function<NodeInfoMemory.Builder, ObjectBuilder<NodeInfoMemory>> fn) {
			return this.swap(fn.apply(new NodeInfoMemory.Builder()).build());
		}

		/**
		 * Builds a {@link NodeOperatingSystemInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeOperatingSystemInfo build() {

			return new NodeOperatingSystemInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeOperatingSystemInfo}
	 */
	public static final JsonpDeserializer<NodeOperatingSystemInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeOperatingSystemInfo::setupNodeOperatingSystemInfoDeserializer, Builder::build);

	protected static void setupNodeOperatingSystemInfoDeserializer(
			DelegatingDeserializer<NodeOperatingSystemInfo.Builder> op) {

		op.add(Builder::arch, JsonpDeserializer.stringDeserializer(), "arch");
		op.add(Builder::availableProcessors, JsonpDeserializer.integerDeserializer(), "available_processors");
		op.add(Builder::allocatedProcessors, JsonpDeserializer.integerDeserializer(), "allocated_processors");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::prettyName, JsonpDeserializer.stringDeserializer(), "pretty_name");
		op.add(Builder::refreshIntervalInMillis, JsonpDeserializer.integerDeserializer(), "refresh_interval_in_millis");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::cpu, NodeInfoOSCPU._DESERIALIZER, "cpu");
		op.add(Builder::mem, NodeInfoMemory._DESERIALIZER, "mem");
		op.add(Builder::swap, NodeInfoMemory._DESERIALIZER, "swap");

	}

}
