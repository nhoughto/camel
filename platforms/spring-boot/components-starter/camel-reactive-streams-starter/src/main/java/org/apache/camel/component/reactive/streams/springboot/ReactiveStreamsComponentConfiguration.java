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
package org.apache.camel.component.reactive.streams.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy;
import org.apache.camel.component.reactive.streams.ReactiveStreamsComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Reactive Camel using reactive streams
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.reactive-streams")
public class ReactiveStreamsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the reactive-streams component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Configures the internal engine for Reactive Streams.
     */
    private ReactiveStreamsEngineConfigurationNestedConfiguration internalEngineConfiguration;
    /**
     * The backpressure strategy to use when pushing events to a slow
     * subscriber.
     */
    private ReactiveStreamsBackpressureStrategy backpressureStrategy = ReactiveStreamsBackpressureStrategy.BUFFER;
    /**
     * Set the type of the underlying reactive streams implementation to use.
     * The implementation is looked up from the registry or using a
     * ServiceLoader, the default implementation is
     * DefaultCamelReactiveStreamsService
     */
    private String serviceType;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public ReactiveStreamsEngineConfigurationNestedConfiguration getInternalEngineConfiguration() {
        return internalEngineConfiguration;
    }

    public void setInternalEngineConfiguration(
            ReactiveStreamsEngineConfigurationNestedConfiguration internalEngineConfiguration) {
        this.internalEngineConfiguration = internalEngineConfiguration;
    }

    public ReactiveStreamsBackpressureStrategy getBackpressureStrategy() {
        return backpressureStrategy;
    }

    public void setBackpressureStrategy(
            ReactiveStreamsBackpressureStrategy backpressureStrategy) {
        this.backpressureStrategy = backpressureStrategy;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class ReactiveStreamsEngineConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.reactive.streams.engine.ReactiveStreamsEngineConfiguration.class;
        /**
         * The name of the thread pool used by the reactive streams internal
         * engine.
         */
        private String threadPoolName;
        /**
         * The minimum number of threads used by the reactive streams internal
         * engine.
         */
        private Integer threadPoolMinSize;
        /**
         * The maximum number of threads used by the reactive streams internal
         * engine.
         */
        private Integer threadPoolMaxSize;

        public String getThreadPoolName() {
            return threadPoolName;
        }

        public void setThreadPoolName(String threadPoolName) {
            this.threadPoolName = threadPoolName;
        }

        public Integer getThreadPoolMinSize() {
            return threadPoolMinSize;
        }

        public void setThreadPoolMinSize(Integer threadPoolMinSize) {
            this.threadPoolMinSize = threadPoolMinSize;
        }

        public Integer getThreadPoolMaxSize() {
            return threadPoolMaxSize;
        }

        public void setThreadPoolMaxSize(Integer threadPoolMaxSize) {
            this.threadPoolMaxSize = threadPoolMaxSize;
        }
    }
}