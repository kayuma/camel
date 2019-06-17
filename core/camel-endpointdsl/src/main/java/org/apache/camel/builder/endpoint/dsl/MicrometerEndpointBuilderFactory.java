/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * To collect various metrics directly from Camel routes using the Micrometer
 * library.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MicrometerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Micrometer component.
     */
    public interface MicrometerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMicrometerEndpointBuilder advanced() {
            return (AdvancedMicrometerEndpointBuilder) this;
        }
        /**
         * Type of metrics.
         * The option is a <code>io.micrometer.core.instrument.Meter$Type</code>
         * type.
         * @group producer
         */
        default MicrometerEndpointBuilder metricsType(Type metricsType) {
            setProperty("metricsType", metricsType);
            return this;
        }
        /**
         * Type of metrics.
         * The option will be converted to a
         * <code>io.micrometer.core.instrument.Meter$Type</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder metricsType(String metricsType) {
            setProperty("metricsType", metricsType);
            return this;
        }
        /**
         * Name of metrics.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder metricsName(String metricsName) {
            setProperty("metricsName", metricsName);
            return this;
        }
        /**
         * Tags of metrics.
         * The option is a
         * <code>java.lang.Iterable&lt;io.micrometer.core.instrument.Tag&gt;</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder tags(Iterable<Object> tags) {
            setProperty("tags", tags);
            return this;
        }
        /**
         * Tags of metrics.
         * The option will be converted to a
         * <code>java.lang.Iterable&lt;io.micrometer.core.instrument.Tag&gt;</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder tags(String tags) {
            setProperty("tags", tags);
            return this;
        }
        /**
         * Action expression when using timer type.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * Decrement value expression when using counter type.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder decrement(String decrement) {
            setProperty("decrement", decrement);
            return this;
        }
        /**
         * Increment value expression when using counter type.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder increment(String increment) {
            setProperty("increment", increment);
            return this;
        }
        /**
         * Value expression when using histogram type.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MicrometerEndpointBuilder value(String value) {
            setProperty("value", value);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Micrometer component.
     */
    public interface AdvancedMicrometerEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MicrometerEndpointBuilder basic() {
            return (MicrometerEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMicrometerEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMicrometerEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMicrometerEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMicrometerEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>io.micrometer.core.instrument.Meter$Type</code>
     * enum.
     */
    enum Type {
        COUNTER, GAUGE, LONG_TASK_TIMER, TIMER, DISTRIBUTION_SUMMARY, OTHER;
    }
    /**
     * To collect various metrics directly from Camel routes using the
     * Micrometer library. Creates a builder to build endpoints for the
     * Micrometer component.
     */
    default MicrometerEndpointBuilder micrometer(String path) {
        class MicrometerEndpointBuilderImpl extends AbstractEndpointBuilder implements MicrometerEndpointBuilder, AdvancedMicrometerEndpointBuilder {
            public MicrometerEndpointBuilderImpl(String path) {
                super("micrometer", path);
            }
        }
        return new MicrometerEndpointBuilderImpl(path);
    }
}