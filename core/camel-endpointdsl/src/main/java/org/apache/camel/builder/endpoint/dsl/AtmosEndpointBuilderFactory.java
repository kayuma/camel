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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The atmos component is used for integrating with EMC's Atomos Storage.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtmosEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Atmos component.
     */
    public interface AtmosEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedAtmosEndpointConsumerBuilder advanced() {
            return (AdvancedAtmosEndpointConsumerBuilder) this;
        }
        /**
         * Atmos name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * Operation to perform.
         * The option is a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder operation(AtmosOperation operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder enableSslValidation(
                boolean enableSslValidation) {
            setProperty("enableSslValidation", enableSslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder enableSslValidation(
                String enableSslValidation) {
            setProperty("enableSslValidation", enableSslValidation);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder fullTokenId(String fullTokenId) {
            setProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * Local path to put files.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder localPath(String localPath) {
            setProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder newRemotePath(String newRemotePath) {
            setProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder query(String query) {
            setProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder remotePath(String remotePath) {
            setProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos shared secret.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atomos server uri.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointConsumerBuilder uri(String uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default AtmosEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default AtmosEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Atmos component.
     */
    public interface AdvancedAtmosEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AtmosEndpointConsumerBuilder basic() {
            return (AtmosEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedAtmosEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAtmosEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedAtmosEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedAtmosEndpointConsumerBuilder synchronous(
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
        default AdvancedAtmosEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Atmos component.
     */
    public interface AtmosEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedAtmosEndpointProducerBuilder advanced() {
            return (AdvancedAtmosEndpointProducerBuilder) this;
        }
        /**
         * Atmos name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * Operation to perform.
         * The option is a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         * @group common
         */
        default AtmosEndpointProducerBuilder operation(AtmosOperation operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         * @group common
         */
        default AtmosEndpointProducerBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder enableSslValidation(
                boolean enableSslValidation) {
            setProperty("enableSslValidation", enableSslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder enableSslValidation(
                String enableSslValidation) {
            setProperty("enableSslValidation", enableSslValidation);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder fullTokenId(String fullTokenId) {
            setProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * Local path to put files.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder localPath(String localPath) {
            setProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder newRemotePath(String newRemotePath) {
            setProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder query(String query) {
            setProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder remotePath(String remotePath) {
            setProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos shared secret.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atomos server uri.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointProducerBuilder uri(String uri) {
            setProperty("uri", uri);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default AtmosEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default AtmosEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Atmos component.
     */
    public interface AdvancedAtmosEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AtmosEndpointProducerBuilder basic() {
            return (AtmosEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAtmosEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedAtmosEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedAtmosEndpointProducerBuilder synchronous(
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
        default AdvancedAtmosEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Atmos component.
     */
    public interface AtmosEndpointBuilder
            extends
                AtmosEndpointConsumerBuilder, AtmosEndpointProducerBuilder {
        default AdvancedAtmosEndpointBuilder advanced() {
            return (AdvancedAtmosEndpointBuilder) this;
        }
        /**
         * Atmos name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * Operation to perform.
         * The option is a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         * @group common
         */
        default AtmosEndpointBuilder operation(AtmosOperation operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.atmos.util.AtmosOperation</code>
         * type.
         * @group common
         */
        default AtmosEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * The option is a <code>boolean</code> type.
         * @group common
         */
        default AtmosEndpointBuilder enableSslValidation(
                boolean enableSslValidation) {
            setProperty("enableSslValidation", enableSslValidation);
            return this;
        }
        /**
         * Atmos SSL validation.
         * The option will be converted to a <code>boolean</code> type.
         * @group common
         */
        default AtmosEndpointBuilder enableSslValidation(
                String enableSslValidation) {
            setProperty("enableSslValidation", enableSslValidation);
            return this;
        }
        /**
         * Atmos client fullTokenId.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder fullTokenId(String fullTokenId) {
            setProperty("fullTokenId", fullTokenId);
            return this;
        }
        /**
         * Local path to put files.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder localPath(String localPath) {
            setProperty("localPath", localPath);
            return this;
        }
        /**
         * New path on Atmos when moving files.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder newRemotePath(String newRemotePath) {
            setProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Search query on Atmos.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder query(String query) {
            setProperty("query", query);
            return this;
        }
        /**
         * Where to put files on Atmos.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder remotePath(String remotePath) {
            setProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Atmos shared secret.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder secretKey(String secretKey) {
            setProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Atomos server uri.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AtmosEndpointBuilder uri(String uri) {
            setProperty("uri", uri);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Atmos component.
     */
    public interface AdvancedAtmosEndpointBuilder
            extends
                AdvancedAtmosEndpointConsumerBuilder, AdvancedAtmosEndpointProducerBuilder {
        default AtmosEndpointBuilder basic() {
            return (AtmosEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAtmosEndpointBuilder basicPropertyBinding(
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
        default AdvancedAtmosEndpointBuilder basicPropertyBinding(
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
        default AdvancedAtmosEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAtmosEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.atmos.util.AtmosOperation</code> enum.
     */
    enum AtmosOperation {
        put, del, search, get, move;
    }
    /**
     * The atmos component is used for integrating with EMC's Atomos Storage.
     * Creates a builder to build endpoints for the Atmos component.
     */
    default AtmosEndpointBuilder atmos(String path) {
        class AtmosEndpointBuilderImpl extends AbstractEndpointBuilder implements AtmosEndpointBuilder, AdvancedAtmosEndpointBuilder {
            public AtmosEndpointBuilderImpl(String path) {
                super("atmos", path);
            }
        }
        return new AtmosEndpointBuilderImpl(path);
    }
}