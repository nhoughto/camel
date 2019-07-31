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
 * Represents an endpoint which only becomes active when the CamelClusterView
 * has the leadership.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MasterEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Master component.
     */
    public interface MasterEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedMasterEndpointBuilder advanced() {
            return (AdvancedMasterEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Master component.
     */
    public interface AdvancedMasterEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default MasterEndpointBuilder basic() {
            return (MasterEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMasterEndpointBuilder basicPropertyBinding(
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
        default AdvancedMasterEndpointBuilder basicPropertyBinding(
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
        default AdvancedMasterEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedMasterEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Master (camel-master)
     * Represents an endpoint which only becomes active when the
     * CamelClusterView has the leadership.
     * 
     * Category: clustering
     * Available as of version: 2.20
     * Maven coordinates: org.apache.camel:camel-master
     * 
     * Syntax: <code>master:namespace:delegateUri</code>
     * 
     * Path parameter: namespace (required)
     * The name of the cluster namespace to use
     * 
     * Path parameter: delegateUri (required)
     * The endpoint uri to use in master/slave mode
     */
    default MasterEndpointBuilder master(String path) {
        class MasterEndpointBuilderImpl extends AbstractEndpointBuilder implements MasterEndpointBuilder, AdvancedMasterEndpointBuilder {
            public MasterEndpointBuilderImpl(String path) {
                super("master", path);
            }
        }
        return new MasterEndpointBuilderImpl(path);
    }
}