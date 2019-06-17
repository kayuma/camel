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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The servicenow component is used to integrate Camel with ServiceNow cloud
 * services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ServiceNowEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ServiceNow component.
     */
    public interface ServiceNowEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedServiceNowEndpointBuilder advanced() {
            return (AdvancedServiceNowEndpointBuilder) this;
        }
        /**
         * The ServiceNow instance name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder instanceName(String instanceName) {
            setProperty("instanceName", instanceName);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards where the
         * indicator Display field is selected. Set this parameter to all to
         * return scorecards with any Display field value. This parameter is
         * true by default.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder display(String display) {
            setProperty("display", display);
            return this;
        }
        /**
         * Return the display value (true), actual value (false), or both (all)
         * for reference fields (default: false).
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder displayValue(String displayValue) {
            setProperty("displayValue", displayValue);
            return this;
        }
        /**
         * True to exclude Table API links for reference fields (default:
         * false).
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder excludeReferenceLink(
                Boolean excludeReferenceLink) {
            setProperty("excludeReferenceLink", excludeReferenceLink);
            return this;
        }
        /**
         * True to exclude Table API links for reference fields (default:
         * false).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder excludeReferenceLink(
                String excludeReferenceLink) {
            setProperty("excludeReferenceLink", excludeReferenceLink);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that are
         * favorites of the querying user.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder favorites(Boolean favorites) {
            setProperty("favorites", favorites);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that are
         * favorites of the querying user.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder favorites(String favorites) {
            setProperty("favorites", favorites);
            return this;
        }
        /**
         * Set this parameter to true to always return all available aggregates
         * for an indicator, including when an aggregate has already been
         * applied. If a value is not specified, this parameter defaults to
         * false and returns no aggregates.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeAggregates(
                Boolean includeAggregates) {
            setProperty("includeAggregates", includeAggregates);
            return this;
        }
        /**
         * Set this parameter to true to always return all available aggregates
         * for an indicator, including when an aggregate has already been
         * applied. If a value is not specified, this parameter defaults to
         * false and returns no aggregates.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeAggregates(
                String includeAggregates) {
            setProperty("includeAggregates", includeAggregates);
            return this;
        }
        /**
         * Set this parameter to true to return all available aggregates for an
         * indicator when no aggregate has been applied. If a value is not
         * specified, this parameter defaults to false and returns no
         * aggregates.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeAvailableAggregates(
                Boolean includeAvailableAggregates) {
            setProperty("includeAvailableAggregates", includeAvailableAggregates);
            return this;
        }
        /**
         * Set this parameter to true to return all available aggregates for an
         * indicator when no aggregate has been applied. If a value is not
         * specified, this parameter defaults to false and returns no
         * aggregates.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeAvailableAggregates(
                String includeAvailableAggregates) {
            setProperty("includeAvailableAggregates", includeAvailableAggregates);
            return this;
        }
        /**
         * Set this parameter to true to return all available breakdowns for an
         * indicator. If a value is not specified, this parameter defaults to
         * false and returns no breakdowns.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeAvailableBreakdowns(
                Boolean includeAvailableBreakdowns) {
            setProperty("includeAvailableBreakdowns", includeAvailableBreakdowns);
            return this;
        }
        /**
         * Set this parameter to true to return all available breakdowns for an
         * indicator. If a value is not specified, this parameter defaults to
         * false and returns no breakdowns.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeAvailableBreakdowns(
                String includeAvailableBreakdowns) {
            setProperty("includeAvailableBreakdowns", includeAvailableBreakdowns);
            return this;
        }
        /**
         * Set this parameter to true to return all notes associated with the
         * score. The note element contains the note text as well as the author
         * and timestamp when the note was added.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeScoreNotes(
                Boolean includeScoreNotes) {
            setProperty("includeScoreNotes", includeScoreNotes);
            return this;
        }
        /**
         * Set this parameter to true to return all notes associated with the
         * score. The note element contains the note text as well as the author
         * and timestamp when the note was added.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeScoreNotes(
                String includeScoreNotes) {
            setProperty("includeScoreNotes", includeScoreNotes);
            return this;
        }
        /**
         * Set this parameter to true to return all scores for a scorecard. If a
         * value is not specified, this parameter defaults to false and returns
         * only the most recent score value.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeScores(Boolean includeScores) {
            setProperty("includeScores", includeScores);
            return this;
        }
        /**
         * Set this parameter to true to return all scores for a scorecard. If a
         * value is not specified, this parameter defaults to false and returns
         * only the most recent score value.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder includeScores(String includeScores) {
            setProperty("includeScores", includeScores);
            return this;
        }
        /**
         * True to set raw value of input fields (default: false).
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder inputDisplayValue(
                Boolean inputDisplayValue) {
            setProperty("inputDisplayValue", inputDisplayValue);
            return this;
        }
        /**
         * True to set raw value of input fields (default: false).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder inputDisplayValue(
                String inputDisplayValue) {
            setProperty("inputDisplayValue", inputDisplayValue);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards for key
         * indicators.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder key(Boolean key) {
            setProperty("key", key);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards for key
         * indicators.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder key(String key) {
            setProperty("key", key);
            return this;
        }
        /**
         * Defines both request and response models.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder models(
                Map<String, Class<Object>> models) {
            setProperty("models", models);
            return this;
        }
        /**
         * Defines both request and response models.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder models(String models) {
            setProperty("models", models);
            return this;
        }
        /**
         * Enter the maximum number of scorecards each query can return. By
         * default this value is 10, and the maximum is 100.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder perPage(Integer perPage) {
            setProperty("perPage", perPage);
            return this;
        }
        /**
         * Enter the maximum number of scorecards each query can return. By
         * default this value is 10, and the maximum is 100.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder perPage(String perPage) {
            setProperty("perPage", perPage);
            return this;
        }
        /**
         * The ServiceNow release to target, default to Helsinki See
         * https://docs.servicenow.com.
         * The option is a
         * <code>org.apache.camel.component.servicenow.ServiceNowRelease</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder release(ServiceNowRelease release) {
            setProperty("release", release);
            return this;
        }
        /**
         * The ServiceNow release to target, default to Helsinki See
         * https://docs.servicenow.com.
         * The option will be converted to a
         * <code>org.apache.camel.component.servicenow.ServiceNowRelease</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder release(String release) {
            setProperty("release", release);
            return this;
        }
        /**
         * Defines the request model.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder requestModels(
                Map<String, Class<Object>> requestModels) {
            setProperty("requestModels", requestModels);
            return this;
        }
        /**
         * Defines the request model.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder requestModels(String requestModels) {
            setProperty("requestModels", requestModels);
            return this;
        }
        /**
         * The default resource, can be overridden by header
         * CamelServiceNowResource.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder resource(String resource) {
            setProperty("resource", resource);
            return this;
        }
        /**
         * Defines the response model.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder responseModels(
                Map<String, Class<Object>> responseModels) {
            setProperty("responseModels", responseModels);
            return this;
        }
        /**
         * Defines the response model.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder responseModels(String responseModels) {
            setProperty("responseModels", responseModels);
            return this;
        }
        /**
         * Specify the value to use when sorting results. By default, queries
         * sort records by value.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder sortBy(String sortBy) {
            setProperty("sortBy", sortBy);
            return this;
        }
        /**
         * Specify the sort direction, ascending or descending. By default,
         * queries sort records in descending order. Use sysparm_sortdir=asc to
         * sort in ascending order.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder sortDir(String sortDir) {
            setProperty("sortDir", sortDir);
            return this;
        }
        /**
         * True to suppress auto generation of system fields (default: false).
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder suppressAutoSysField(
                Boolean suppressAutoSysField) {
            setProperty("suppressAutoSysField", suppressAutoSysField);
            return this;
        }
        /**
         * True to suppress auto generation of system fields (default: false).
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder suppressAutoSysField(
                String suppressAutoSysField) {
            setProperty("suppressAutoSysField", suppressAutoSysField);
            return this;
        }
        /**
         * Set this value to true to remove the Link header from the response.
         * The Link header allows you to request additional pages of data when
         * the number of records matching your query exceeds the query limit.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder suppressPaginationHeader(
                Boolean suppressPaginationHeader) {
            setProperty("suppressPaginationHeader", suppressPaginationHeader);
            return this;
        }
        /**
         * Set this value to true to remove the Link header from the response.
         * The Link header allows you to request additional pages of data when
         * the number of records matching your query exceeds the query limit.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder suppressPaginationHeader(
                String suppressPaginationHeader) {
            setProperty("suppressPaginationHeader", suppressPaginationHeader);
            return this;
        }
        /**
         * The default table, can be overridden by header CamelServiceNowTable.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder table(String table) {
            setProperty("table", table);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that have a
         * target.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder target(Boolean target) {
            setProperty("target", target);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that have a
         * target.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder target(String target) {
            setProperty("target", target);
            return this;
        }
        /**
         * Gets only those categories whose parent is a catalog.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group producer
         */
        default ServiceNowEndpointBuilder topLevelOnly(Boolean topLevelOnly) {
            setProperty("topLevelOnly", topLevelOnly);
            return this;
        }
        /**
         * Gets only those categories whose parent is a catalog.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group producer
         */
        default ServiceNowEndpointBuilder topLevelOnly(String topLevelOnly) {
            setProperty("topLevelOnly", topLevelOnly);
            return this;
        }
        /**
         * The proxy host name.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default ServiceNowEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port number.
         * The option is a <code>java.lang.Integer</code> type.
         * @group proxy
         */
        default ServiceNowEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port number.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group proxy
         */
        default ServiceNowEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The ServiceNow REST API url.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder apiUrl(String apiUrl) {
            setProperty("apiUrl", apiUrl);
            return this;
        }
        /**
         * OAuth2 ClientID.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder oauthClientId(String oauthClientId) {
            setProperty("oauthClientId", oauthClientId);
            return this;
        }
        /**
         * OAuth2 ClientSecret.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder oauthClientSecret(
                String oauthClientSecret) {
            setProperty("oauthClientSecret", oauthClientSecret);
            return this;
        }
        /**
         * OAuth token Url.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder oauthTokenUrl(String oauthTokenUrl) {
            setProperty("oauthTokenUrl", oauthTokenUrl);
            return this;
        }
        /**
         * ServiceNow account password, MUST be provided.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Password for proxy authentication.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder proxyPassword(String proxyPassword) {
            setProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Username for proxy authentication.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder proxyUserName(String proxyUserName) {
            setProperty("proxyUserName", proxyUserName);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. See
         * http://camel.apache.org/camel-configuration-utilities.html.
         * The option is a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. See
         * http://camel.apache.org/camel-configuration-utilities.html.
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * ServiceNow user account name, MUST be provided.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default ServiceNowEndpointBuilder userName(String userName) {
            setProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ServiceNow component.
     */
    public interface AdvancedServiceNowEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ServiceNowEndpointBuilder basic() {
            return (ServiceNowEndpointBuilder) this;
        }
        /**
         * The ServiceNow REST API version, default latest.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder apiVersion(String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder basicPropertyBinding(
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
        default AdvancedServiceNowEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The date format used for Json serialization/deserialization.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder dateFormat(String dateFormat) {
            setProperty("dateFormat", dateFormat);
            return this;
        }
        /**
         * The date-time format used for Json serialization/deserialization.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder dateTimeFormat(
                String dateTimeFormat) {
            setProperty("dateTimeFormat", dateTimeFormat);
            return this;
        }
        /**
         * To configure http-client.
         * The option is a
         * <code>org.apache.cxf.transports.http.configuration.HTTPClientPolicy</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder httpClientPolicy(
                Object httpClientPolicy) {
            setProperty("httpClientPolicy", httpClientPolicy);
            return this;
        }
        /**
         * To configure http-client.
         * The option will be converted to a
         * <code>org.apache.cxf.transports.http.configuration.HTTPClientPolicy</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder httpClientPolicy(
                String httpClientPolicy) {
            setProperty("httpClientPolicy", httpClientPolicy);
            return this;
        }
        /**
         * Sets Jackson's ObjectMapper to use for request/reply.
         * The option is a
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder mapper(Object mapper) {
            setProperty("mapper", mapper);
            return this;
        }
        /**
         * Sets Jackson's ObjectMapper to use for request/reply.
         * The option will be converted to a
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder mapper(String mapper) {
            setProperty("mapper", mapper);
            return this;
        }
        /**
         * To configure proxy authentication.
         * The option is a
         * <code>org.apache.cxf.configuration.security.ProxyAuthorizationPolicy</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder proxyAuthorizationPolicy(
                Object proxyAuthorizationPolicy) {
            setProperty("proxyAuthorizationPolicy", proxyAuthorizationPolicy);
            return this;
        }
        /**
         * To configure proxy authentication.
         * The option will be converted to a
         * <code>org.apache.cxf.configuration.security.ProxyAuthorizationPolicy</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder proxyAuthorizationPolicy(
                String proxyAuthorizationPolicy) {
            setProperty("proxyAuthorizationPolicy", proxyAuthorizationPolicy);
            return this;
        }
        /**
         * Set this parameter to true to retrieve the target record when using
         * import set api. The import set result is then replaced by the target
         * record.
         * The option is a <code>java.lang.Boolean</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder retrieveTargetRecordOnImport(
                Boolean retrieveTargetRecordOnImport) {
            setProperty("retrieveTargetRecordOnImport", retrieveTargetRecordOnImport);
            return this;
        }
        /**
         * Set this parameter to true to retrieve the target record when using
         * import set api. The import set result is then replaced by the target
         * record.
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder retrieveTargetRecordOnImport(
                String retrieveTargetRecordOnImport) {
            setProperty("retrieveTargetRecordOnImport", retrieveTargetRecordOnImport);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder synchronous(
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
        default AdvancedServiceNowEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The time format used for Json serialization/deserialization.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedServiceNowEndpointBuilder timeFormat(String timeFormat) {
            setProperty("timeFormat", timeFormat);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.servicenow.ServiceNowRelease</code>
     * enum.
     */
    enum ServiceNowRelease {
        FUJI, GENEVA, HELSINKI;
    }
    /**
     * The servicenow component is used to integrate Camel with ServiceNow cloud
     * services. Creates a builder to build endpoints for the ServiceNow
     * component.
     */
    default ServiceNowEndpointBuilder serviceNow(String path) {
        class ServiceNowEndpointBuilderImpl extends AbstractEndpointBuilder implements ServiceNowEndpointBuilder, AdvancedServiceNowEndpointBuilder {
            public ServiceNowEndpointBuilderImpl(String path) {
                super("servicenow", path);
            }
        }
        return new ServiceNowEndpointBuilderImpl(path);
    }
}