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
 * The solr component allows you to interface with an Apache Lucene Solr server.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SolrEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Solr component.
     */
    public interface SolrEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSolrEndpointBuilder advanced() {
            return (AdvancedSolrEndpointBuilder) this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder allowCompression(Boolean allowCompression) {
            setProperty("allowCompression", allowCompression);
            return this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder allowCompression(String allowCompression) {
            setProperty("allowCompression", allowCompression);
            return this;
        }
        /**
         * connectionTimeout on the underlying HttpConnectionManager.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder connectionTimeout(Integer connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * connectionTimeout on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder connectionTimeout(String connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder defaultMaxConnectionsPerHost(
                Integer defaultMaxConnectionsPerHost) {
            setProperty("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder defaultMaxConnectionsPerHost(
                String defaultMaxConnectionsPerHost) {
            setProperty("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return this;
        }
        /**
         * indicates whether redirects are used to get to the Solr server.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder followRedirects(Boolean followRedirects) {
            setProperty("followRedirects", followRedirects);
            return this;
        }
        /**
         * indicates whether redirects are used to get to the Solr server.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder followRedirects(String followRedirects) {
            setProperty("followRedirects", followRedirects);
            return this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxRetries(Integer maxRetries) {
            setProperty("maxRetries", maxRetries);
            return this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxRetries(String maxRetries) {
            setProperty("maxRetries", maxRetries);
            return this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxTotalConnections(
                Integer maxTotalConnections) {
            setProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxTotalConnections(
                String maxTotalConnections) {
            setProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * Set the request handler to be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder requestHandler(String requestHandler) {
            setProperty("requestHandler", requestHandler);
            return this;
        }
        /**
         * Read timeout on the underlying HttpConnectionManager. This is
         * desirable for queries, but probably not for indexing.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder soTimeout(Integer soTimeout) {
            setProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Read timeout on the underlying HttpConnectionManager. This is
         * desirable for queries, but probably not for indexing.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder soTimeout(String soTimeout) {
            setProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Set the queue size for the StreamingUpdateSolrServer.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder streamingQueueSize(int streamingQueueSize) {
            setProperty("streamingQueueSize", streamingQueueSize);
            return this;
        }
        /**
         * Set the queue size for the StreamingUpdateSolrServer.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder streamingQueueSize(String streamingQueueSize) {
            setProperty("streamingQueueSize", streamingQueueSize);
            return this;
        }
        /**
         * Set the number of threads for the StreamingUpdateSolrServer.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder streamingThreadCount(
                int streamingThreadCount) {
            setProperty("streamingThreadCount", streamingThreadCount);
            return this;
        }
        /**
         * Set the number of threads for the StreamingUpdateSolrServer.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder streamingThreadCount(
                String streamingThreadCount) {
            setProperty("streamingThreadCount", streamingThreadCount);
            return this;
        }
        /**
         * Sets password for basic auth plugin enabled servers.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SolrEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Sets username for basic auth plugin enabled servers.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SolrEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * Set the collection name which the solrCloud server could use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: solrCloud
         */
        default SolrEndpointBuilder collection(String collection) {
            setProperty("collection", collection);
            return this;
        }
        /**
         * Set the ZooKeeper host information which the solrCloud could use,
         * such as zkhost=localhost:8123.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: solrCloud
         */
        default SolrEndpointBuilder zkHost(String zkHost) {
            setProperty("zkHost", zkHost);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Solr component.
     */
    public interface AdvancedSolrEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SolrEndpointBuilder basic() {
            return (SolrEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Solr (camel-solr)
     * The solr component allows you to interface with an Apache Lucene Solr
     * server.
     * 
     * Category: monitoring,search
     * Available as of version: 2.9
     * Maven coordinates: org.apache.camel:camel-solr
     * 
     * Syntax: <code>solr:url</code>
     * 
     * Path parameter: url (required)
     * Hostname and port for the solr server
     */
    default SolrEndpointBuilder solr(String path) {
        class SolrEndpointBuilderImpl extends AbstractEndpointBuilder implements SolrEndpointBuilder, AdvancedSolrEndpointBuilder {
            public SolrEndpointBuilderImpl(String path) {
                super("solr", path);
            }
        }
        return new SolrEndpointBuilderImpl(path);
    }
}