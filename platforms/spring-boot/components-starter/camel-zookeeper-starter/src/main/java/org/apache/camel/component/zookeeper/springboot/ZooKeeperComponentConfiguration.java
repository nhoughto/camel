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
package org.apache.camel.component.zookeeper.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * The zookeeper component allows interaction with a ZooKeeper cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.zookeeper")
public class ZooKeeperComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the zookeeper component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a shared ZooKeeperConfiguration
     */
    private ZooKeeperConfigurationNestedConfiguration configuration;
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

    public ZooKeeperConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            ZooKeeperConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
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

    public static class ZooKeeperConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.zookeeper.ZooKeeperConfiguration.class;
        /**
         * The zookeeper server hosts
         */
        private List servers;
        /**
         * The time interval to wait on connection before timing out.
         */
        private Integer timeout = 5000;
        /**
         * Whether the children of the node should be listed
         */
        private Boolean listChildren = false;
        /**
         * The node in the ZooKeeper server (aka znode)
         */
        private String path;
        /**
         * Should changes to the znode be 'watched' and repeatedly processed.
         */
        private Boolean repeat = false;
        /**
         * Not in use
         */
        @Deprecated
        private Boolean awaitExistence = true;
        /**
         * The time interval to backoff for after an error before retrying.
         */
        private Long backoff = 5000L;
        /**
         * Should the endpoint create the node if it does not currently exist.
         */
        private Boolean create = false;
        /**
         * The create mode that should be used for the newly created node
         */
        private String createMode = "EPHEMERAL";
        /**
         * Upon the delete of a znode, should an empty message be send to the
         * consumer
         */
        private Boolean sendEmptyMessageOnDelete = true;

        public List getServers() {
            return servers;
        }

        public void setServers(List servers) {
            this.servers = servers;
        }

        public Integer getTimeout() {
            return timeout;
        }

        public void setTimeout(Integer timeout) {
            this.timeout = timeout;
        }

        public Boolean getListChildren() {
            return listChildren;
        }

        public void setListChildren(Boolean listChildren) {
            this.listChildren = listChildren;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Boolean getRepeat() {
            return repeat;
        }

        public void setRepeat(Boolean repeat) {
            this.repeat = repeat;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public Boolean getAwaitExistence() {
            return awaitExistence;
        }

        @Deprecated
        public void setAwaitExistence(Boolean awaitExistence) {
            this.awaitExistence = awaitExistence;
        }

        public Long getBackoff() {
            return backoff;
        }

        public void setBackoff(Long backoff) {
            this.backoff = backoff;
        }

        public Boolean getCreate() {
            return create;
        }

        public void setCreate(Boolean create) {
            this.create = create;
        }

        public String getCreateMode() {
            return createMode;
        }

        public void setCreateMode(String createMode) {
            this.createMode = createMode;
        }

        public Boolean getSendEmptyMessageOnDelete() {
            return sendEmptyMessageOnDelete;
        }

        public void setSendEmptyMessageOnDelete(Boolean sendEmptyMessageOnDelete) {
            this.sendEmptyMessageOnDelete = sendEmptyMessageOnDelete;
        }
    }
}