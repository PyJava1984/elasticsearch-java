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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Cpu
@JsonpDeserializable
public final class Cpu implements JsonpSerializable {
	private final int percent;

	@Nullable
	private final String sys;

	@Nullable
	private final Long sysInMillis;

	@Nullable
	private final String total;

	@Nullable
	private final Long totalInMillis;

	@Nullable
	private final String user;

	@Nullable
	private final Long userInMillis;

	@Nullable
	private final Map<String, Double> loadAverage;

	// ---------------------------------------------------------------------------------------------

	public Cpu(Builder builder) {

		this.percent = Objects.requireNonNull(builder.percent, "percent");
		this.sys = builder.sys;
		this.sysInMillis = builder.sysInMillis;
		this.total = builder.total;
		this.totalInMillis = builder.totalInMillis;
		this.user = builder.user;
		this.userInMillis = builder.userInMillis;
		this.loadAverage = ModelTypeHelper.unmodifiable(builder.loadAverage);

	}

	public Cpu(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code percent}
	 */
	public int percent() {
		return this.percent;
	}

	/**
	 * API name: {@code sys}
	 */
	@Nullable
	public String sys() {
		return this.sys;
	}

	/**
	 * API name: {@code sys_in_millis}
	 */
	@Nullable
	public Long sysInMillis() {
		return this.sysInMillis;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public String total() {
		return this.total;
	}

	/**
	 * API name: {@code total_in_millis}
	 */
	@Nullable
	public Long totalInMillis() {
		return this.totalInMillis;
	}

	/**
	 * API name: {@code user}
	 */
	@Nullable
	public String user() {
		return this.user;
	}

	/**
	 * API name: {@code user_in_millis}
	 */
	@Nullable
	public Long userInMillis() {
		return this.userInMillis;
	}

	/**
	 * API name: {@code load_average}
	 */
	@Nullable
	public Map<String, Double> loadAverage() {
		return this.loadAverage;
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

		generator.writeKey("percent");
		generator.write(this.percent);

		if (this.sys != null) {

			generator.writeKey("sys");
			generator.write(this.sys);

		}
		if (this.sysInMillis != null) {

			generator.writeKey("sys_in_millis");
			generator.write(this.sysInMillis);

		}
		if (this.total != null) {

			generator.writeKey("total");
			generator.write(this.total);

		}
		if (this.totalInMillis != null) {

			generator.writeKey("total_in_millis");
			generator.write(this.totalInMillis);

		}
		if (this.user != null) {

			generator.writeKey("user");
			generator.write(this.user);

		}
		if (this.userInMillis != null) {

			generator.writeKey("user_in_millis");
			generator.write(this.userInMillis);

		}
		if (this.loadAverage != null) {

			generator.writeKey("load_average");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.loadAverage.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Cpu}.
	 */
	public static class Builder implements ObjectBuilder<Cpu> {
		private Integer percent;

		@Nullable
		private String sys;

		@Nullable
		private Long sysInMillis;

		@Nullable
		private String total;

		@Nullable
		private Long totalInMillis;

		@Nullable
		private String user;

		@Nullable
		private Long userInMillis;

		@Nullable
		private Map<String, Double> loadAverage;

		/**
		 * Required - API name: {@code percent}
		 */
		public Builder percent(int value) {
			this.percent = value;
			return this;
		}

		/**
		 * API name: {@code sys}
		 */
		public Builder sys(@Nullable String value) {
			this.sys = value;
			return this;
		}

		/**
		 * API name: {@code sys_in_millis}
		 */
		public Builder sysInMillis(@Nullable Long value) {
			this.sysInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(@Nullable String value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_in_millis}
		 */
		public Builder totalInMillis(@Nullable Long value) {
			this.totalInMillis = value;
			return this;
		}

		/**
		 * API name: {@code user}
		 */
		public Builder user(@Nullable String value) {
			this.user = value;
			return this;
		}

		/**
		 * API name: {@code user_in_millis}
		 */
		public Builder userInMillis(@Nullable Long value) {
			this.userInMillis = value;
			return this;
		}

		/**
		 * API name: {@code load_average}
		 */
		public Builder loadAverage(@Nullable Map<String, Double> value) {
			this.loadAverage = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #loadAverage(Map)}, creating the map if needed.
		 */
		public Builder putLoadAverage(String key, Double value) {
			if (this.loadAverage == null) {
				this.loadAverage = new HashMap<>();
			}
			this.loadAverage.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link Cpu}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Cpu build() {

			return new Cpu(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Cpu}
	 */
	public static final JsonpDeserializer<Cpu> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Cpu::setupCpuDeserializer, Builder::build);

	protected static void setupCpuDeserializer(DelegatingDeserializer<Cpu.Builder> op) {

		op.add(Builder::percent, JsonpDeserializer.integerDeserializer(), "percent");
		op.add(Builder::sys, JsonpDeserializer.stringDeserializer(), "sys");
		op.add(Builder::sysInMillis, JsonpDeserializer.longDeserializer(), "sys_in_millis");
		op.add(Builder::total, JsonpDeserializer.stringDeserializer(), "total");
		op.add(Builder::totalInMillis, JsonpDeserializer.longDeserializer(), "total_in_millis");
		op.add(Builder::user, JsonpDeserializer.stringDeserializer(), "user");
		op.add(Builder::userInMillis, JsonpDeserializer.longDeserializer(), "user_in_millis");
		op.add(Builder::loadAverage, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()),
				"load_average");

	}

}
