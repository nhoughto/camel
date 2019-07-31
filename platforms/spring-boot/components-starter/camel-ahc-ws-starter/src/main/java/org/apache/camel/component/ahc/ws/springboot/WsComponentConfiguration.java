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
package org.apache.camel.component.ahc.ws.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To exchange data with external Websocket servers using Async Http Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ahc-ws")
public class WsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ahc-ws component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a custom AsyncHttpClient. The option is a
     * org.asynchttpclient.AsyncHttpClient type.
     */
    private String client;
    /**
     * To use a custom AhcBinding which allows to control how to bind between
     * AHC and Camel. The option is a org.apache.camel.component.ahc.AhcBinding
     * type.
     */
    private String binding;
    /**
     * To configure the AsyncHttpClient to use a custom
     * com.ning.http.client.AsyncHttpClientConfig instance. The option is a
     * org.asynchttpclient.AsyncHttpClientConfig type.
     */
    private String clientConfig;
    /**
     * Reference to a org.apache.camel.support.jsse.SSLContextParameters in the
     * Registry. Note that configuring this option will override any SSL/TLS
     * configuration options provided through the clientConfig option at the
     * endpoint or component level. The option is a
     * org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private String headerFilterStrategy;
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(String clientConfig) {
        this.clientConfig = clientConfig;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public String getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(String headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
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
}