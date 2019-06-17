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
 * The snmp component gives you the ability to poll SNMP capable devices or
 * receiving traps.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SnmpEndpointBuilderFactory {


    /**
     * Builder for endpoint for the SNMP component.
     */
    public interface SnmpEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedSnmpEndpointBuilder advanced() {
            return (AdvancedSnmpEndpointBuilder) this;
        }
        /**
         * Hostname of the SNMP enabled device.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Port number of the SNMP enabled device.
         * The option is a <code>java.lang.Integer</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder port(Integer port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Port number of the SNMP enabled device.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group consumer
         */
        default SnmpEndpointBuilder port(String port) {
            setProperty("port", port);
            return this;
        }
        /**
         * Defines which values you are interested in. Please have a look at the
         * Wikipedia to get a better understanding. You may provide a single OID
         * or a coma separated list of OIDs. Example:
         * oids=1.3.6.1.2.1.1.3.0,1.3.6.1.2.1.25.3.2.1.5.1,1.3.6.1.2.1.25.3.5.1.1.1,1.3.6.1.2.1.43.5.1.1.11.1.
         * The option is a <code>org.apache.camel.component.snmp.OIDList</code>
         * type.
         * @group consumer
         */
        default SnmpEndpointBuilder oids(Object oids) {
            setProperty("oids", oids);
            return this;
        }
        /**
         * Defines which values you are interested in. Please have a look at the
         * Wikipedia to get a better understanding. You may provide a single OID
         * or a coma separated list of OIDs. Example:
         * oids=1.3.6.1.2.1.1.3.0,1.3.6.1.2.1.25.3.2.1.5.1,1.3.6.1.2.1.25.3.5.1.1.1,1.3.6.1.2.1.43.5.1.1.11.1.
         * The option will be converted to a
         * <code>org.apache.camel.component.snmp.OIDList</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder oids(String oids) {
            setProperty("oids", oids);
            return this;
        }
        /**
         * Here you can select which protocol to use. You can use either udp or
         * tcp.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder protocol(String protocol) {
            setProperty("protocol", protocol);
            return this;
        }
        /**
         * Defines how often a retry is made before canceling the request.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder retries(int retries) {
            setProperty("retries", retries);
            return this;
        }
        /**
         * Defines how often a retry is made before canceling the request.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder retries(String retries) {
            setProperty("retries", retries);
            return this;
        }
        /**
         * Sets the community octet string for the snmp request.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder snmpCommunity(String snmpCommunity) {
            setProperty("snmpCommunity", snmpCommunity);
            return this;
        }
        /**
         * Sets the context engine ID field of the scoped PDU.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder snmpContextEngineId(
                String snmpContextEngineId) {
            setProperty("snmpContextEngineId", snmpContextEngineId);
            return this;
        }
        /**
         * Sets the context name field of this scoped PDU.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder snmpContextName(String snmpContextName) {
            setProperty("snmpContextName", snmpContextName);
            return this;
        }
        /**
         * Sets the snmp version for the request. The value 0 means SNMPv1, 1
         * means SNMPv2c, and the value 3 means SNMPv3.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder snmpVersion(int snmpVersion) {
            setProperty("snmpVersion", snmpVersion);
            return this;
        }
        /**
         * Sets the snmp version for the request. The value 0 means SNMPv1, 1
         * means SNMPv2c, and the value 3 means SNMPv3.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder snmpVersion(String snmpVersion) {
            setProperty("snmpVersion", snmpVersion);
            return this;
        }
        /**
         * Sets the timeout value for the request in millis.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder timeout(int timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Sets the timeout value for the request in millis.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder timeout(String timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Which operation to perform such as poll, trap, etc.
         * The option is a
         * <code>org.apache.camel.component.snmp.SnmpActionType</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder type(SnmpActionType type) {
            setProperty("type", type);
            return this;
        }
        /**
         * Which operation to perform such as poll, trap, etc.
         * The option will be converted to a
         * <code>org.apache.camel.component.snmp.SnmpActionType</code> type.
         * @group consumer
         */
        default SnmpEndpointBuilder type(String type) {
            setProperty("type", type);
            return this;
        }
        /**
         * The authentication passphrase. If not null, authenticationProtocol
         * must also be not null. RFC3414 11.2 requires passphrases to have a
         * minimum length of 8 bytes. If the length of authenticationPassphrase
         * is less than 8 bytes an IllegalArgumentException is thrown.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default SnmpEndpointBuilder authenticationPassphrase(
                String authenticationPassphrase) {
            setProperty("authenticationPassphrase", authenticationPassphrase);
            return this;
        }
        /**
         * Authentication protocol to use if security level is set to enable
         * authentication The possible values are: MD5, SHA1.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default SnmpEndpointBuilder authenticationProtocol(
                String authenticationProtocol) {
            setProperty("authenticationProtocol", authenticationProtocol);
            return this;
        }
        /**
         * The privacy passphrase. If not null, privacyProtocol must also be not
         * null. RFC3414 11.2 requires passphrases to have a minimum length of 8
         * bytes. If the length of authenticationPassphrase is less than 8 bytes
         * an IllegalArgumentException is thrown.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default SnmpEndpointBuilder privacyPassphrase(String privacyPassphrase) {
            setProperty("privacyPassphrase", privacyPassphrase);
            return this;
        }
        /**
         * The privacy protocol ID to be associated with this user. If set to
         * null, this user only supports unencrypted messages.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default SnmpEndpointBuilder privacyProtocol(String privacyProtocol) {
            setProperty("privacyProtocol", privacyProtocol);
            return this;
        }
        /**
         * Sets the security level for this target. The supplied security level
         * must be supported by the security model dependent information
         * associated with the security name set for this target. The value 1
         * means: No authentication and no encryption. Anyone can create and
         * read messages with this security level The value 2 means:
         * Authentication and no encryption. Only the one with the right
         * authentication key can create messages with this security level, but
         * anyone can read the contents of the message. The value 3 means:
         * Authentication and encryption. Only the one with the right
         * authentication key can create messages with this security level, and
         * only the one with the right encryption/decryption key can read the
         * contents of the message.
         * The option is a <code>int</code> type.
         * @group security
         */
        default SnmpEndpointBuilder securityLevel(int securityLevel) {
            setProperty("securityLevel", securityLevel);
            return this;
        }
        /**
         * Sets the security level for this target. The supplied security level
         * must be supported by the security model dependent information
         * associated with the security name set for this target. The value 1
         * means: No authentication and no encryption. Anyone can create and
         * read messages with this security level The value 2 means:
         * Authentication and no encryption. Only the one with the right
         * authentication key can create messages with this security level, but
         * anyone can read the contents of the message. The value 3 means:
         * Authentication and encryption. Only the one with the right
         * authentication key can create messages with this security level, and
         * only the one with the right encryption/decryption key can read the
         * contents of the message.
         * The option will be converted to a <code>int</code> type.
         * @group security
         */
        default SnmpEndpointBuilder securityLevel(String securityLevel) {
            setProperty("securityLevel", securityLevel);
            return this;
        }
        /**
         * Sets the security name to be used with this target.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default SnmpEndpointBuilder securityName(String securityName) {
            setProperty("securityName", securityName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SNMP component.
     */
    public interface AdvancedSnmpEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default SnmpEndpointBuilder basic() {
            return (SnmpEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSnmpEndpointBuilder basicPropertyBinding(
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
        default AdvancedSnmpEndpointBuilder basicPropertyBinding(
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
        default AdvancedSnmpEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSnmpEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.snmp.SnmpActionType</code> enum.
     */
    enum SnmpActionType {
        TRAP, POLL, GET_NEXT;
    }
    /**
     * The snmp component gives you the ability to poll SNMP capable devices or
     * receiving traps. Creates a builder to build endpoints for the SNMP
     * component.
     */
    default SnmpEndpointBuilder snmp(String path) {
        class SnmpEndpointBuilderImpl extends AbstractEndpointBuilder implements SnmpEndpointBuilder, AdvancedSnmpEndpointBuilder {
            public SnmpEndpointBuilderImpl(String path) {
                super("snmp", path);
            }
        }
        return new SnmpEndpointBuilderImpl(path);
    }
}