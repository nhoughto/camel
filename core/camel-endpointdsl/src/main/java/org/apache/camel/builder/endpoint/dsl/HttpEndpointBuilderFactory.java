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
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * For calling out to external HTTP servers using Apache HTTP Client 4.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HttpEndpointBuilderFactory {


    /**
     * Builder for endpoint for the HTTP4 component.
     */
    public interface HttpEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedHttpEndpointBuilder advanced() {
            return (AdvancedHttpEndpointBuilder) this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http/http4 producer will by default cache the
         * response body stream. If setting this option to true, then the
         * producers will not cache the response body stream but use the
         * response stream as-is as the message body.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default HttpEndpointBuilder disableStreamCache(
                boolean disableStreamCache) {
            setProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http/http4 producer will by default cache the
         * response body stream. If setting this option to true, then the
         * producers will not cache the response body stream but use the
         * response stream as-is as the message body.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default HttpEndpointBuilder disableStreamCache(String disableStreamCache) {
            setProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: common
         */
        default HttpEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            setProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: common
         */
        default HttpEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            setProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default HttpEndpointBuilder chunked(boolean chunked) {
            setProperty("chunked", chunked);
            return this;
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default HttpEndpointBuilder chunked(String chunked) {
            setProperty("chunked", chunked);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default HttpEndpointBuilder transferException(boolean transferException) {
            setProperty("transferException", transferException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default HttpEndpointBuilder transferException(String transferException) {
            setProperty("transferException", transferException);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. Important: Only one
         * instance of org.apache.camel.util.jsse.SSLContextParameters is
         * supported per HttpComponent. If you need to use 2 or more different
         * instances, you need to define a new HttpComponent per instance you
         * need.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default HttpEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. Important: Only one
         * instance of org.apache.camel.util.jsse.SSLContextParameters is
         * supported per HttpComponent. If you need to use 2 or more different
         * instances, you need to define a new HttpComponent per instance you
         * need.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default HttpEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            setProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To use a custom X509HostnameVerifier such as DefaultHostnameVerifier
         * or org.apache.http.conn.ssl.NoopHostnameVerifier.
         * 
         * The option is a: <code>javax.net.ssl.HostnameVerifier</code> type.
         * 
         * Group: security
         */
        default HttpEndpointBuilder x509HostnameVerifier(
                Object x509HostnameVerifier) {
            setProperty("x509HostnameVerifier", x509HostnameVerifier);
            return this;
        }
        /**
         * To use a custom X509HostnameVerifier such as DefaultHostnameVerifier
         * or org.apache.http.conn.ssl.NoopHostnameVerifier.
         * 
         * The option will be converted to a
         * <code>javax.net.ssl.HostnameVerifier</code> type.
         * 
         * Group: security
         */
        default HttpEndpointBuilder x509HostnameVerifier(
                String x509HostnameVerifier) {
            setProperty("x509HostnameVerifier", x509HostnameVerifier);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the HTTP4 component.
     */
    public interface AdvancedHttpEndpointBuilder
            extends
                EndpointProducerBuilder {
        default HttpEndpointBuilder basic() {
            return (HttpEndpointBuilder) this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option is a:
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         * 
         * Group: common (advanced)
         */
        default AdvancedHttpEndpointBuilder httpBinding(Object httpBinding) {
            setProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         * 
         * Group: common (advanced)
         */
        default AdvancedHttpEndpointBuilder httpBinding(String httpBinding) {
            setProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder basicPropertyBinding(
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
        default AdvancedHttpEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Provide access to the http client request parameters used on new
         * RequestConfig instances used by producers or consumers of this
         * endpoint.
         * 
         * The option is a:
         * <code>org.apache.http.impl.client.HttpClientBuilder</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder clientBuilder(Object clientBuilder) {
            setProperty("clientBuilder", clientBuilder);
            return this;
        }
        /**
         * Provide access to the http client request parameters used on new
         * RequestConfig instances used by producers or consumers of this
         * endpoint.
         * 
         * The option will be converted to a
         * <code>org.apache.http.impl.client.HttpClientBuilder</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder clientBuilder(String clientBuilder) {
            setProperty("clientBuilder", clientBuilder);
            return this;
        }
        /**
         * To use a custom HttpClientConnectionManager to manage connections.
         * 
         * The option is a:
         * <code>org.apache.http.conn.HttpClientConnectionManager</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder clientConnectionManager(
                Object clientConnectionManager) {
            setProperty("clientConnectionManager", clientConnectionManager);
            return this;
        }
        /**
         * To use a custom HttpClientConnectionManager to manage connections.
         * 
         * The option will be converted to a
         * <code>org.apache.http.conn.HttpClientConnectionManager</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder clientConnectionManager(
                String clientConnectionManager) {
            setProperty("clientConnectionManager", clientConnectionManager);
            return this;
        }
        /**
         * The maximum number of connections per route.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder connectionsPerRoute(
                int connectionsPerRoute) {
            setProperty("connectionsPerRoute", connectionsPerRoute);
            return this;
        }
        /**
         * The maximum number of connections per route.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder connectionsPerRoute(
                String connectionsPerRoute) {
            setProperty("connectionsPerRoute", connectionsPerRoute);
            return this;
        }
        /**
         * Sets a custom HttpClient to be used by the producer.
         * 
         * The option is a: <code>org.apache.http.client.HttpClient</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpClient(Object httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
        /**
         * Sets a custom HttpClient to be used by the producer.
         * 
         * The option will be converted to a
         * <code>org.apache.http.client.HttpClient</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpClient(String httpClient) {
            setProperty("httpClient", httpClient);
            return this;
        }
        /**
         * Register a custom configuration strategy for new HttpClient instances
         * created by producers or consumers such as to configure authentication
         * mechanisms etc.
         * 
         * The option is a:
         * <code>org.apache.camel.component.http4.HttpClientConfigurer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpClientConfigurer(
                Object httpClientConfigurer) {
            setProperty("httpClientConfigurer", httpClientConfigurer);
            return this;
        }
        /**
         * Register a custom configuration strategy for new HttpClient instances
         * created by producers or consumers such as to configure authentication
         * mechanisms etc.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.http4.HttpClientConfigurer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpClientConfigurer(
                String httpClientConfigurer) {
            setProperty("httpClientConfigurer", httpClientConfigurer);
            return this;
        }
        /**
         * To configure the HttpClient using the key/values from the Map.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpClientOptions(
                Map<String, Object> httpClientOptions) {
            setProperty("httpClientOptions", httpClientOptions);
            return this;
        }
        /**
         * To configure the HttpClient using the key/values from the Map.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpClientOptions(
                String httpClientOptions) {
            setProperty("httpClientOptions", httpClientOptions);
            return this;
        }
        /**
         * To use a custom HttpContext instance.
         * 
         * The option is a: <code>org.apache.http.protocol.HttpContext</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpContext(Object httpContext) {
            setProperty("httpContext", httpContext);
            return this;
        }
        /**
         * To use a custom HttpContext instance.
         * 
         * The option will be converted to a
         * <code>org.apache.http.protocol.HttpContext</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder httpContext(String httpContext) {
            setProperty("httpContext", httpContext);
            return this;
        }
        /**
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder mapHttpMessageBody(
                boolean mapHttpMessageBody) {
            setProperty("mapHttpMessageBody", mapHttpMessageBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder mapHttpMessageBody(
                String mapHttpMessageBody) {
            setProperty("mapHttpMessageBody", mapHttpMessageBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder mapHttpMessageFormUrlEncodedBody(
                boolean mapHttpMessageFormUrlEncodedBody) {
            setProperty("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder mapHttpMessageFormUrlEncodedBody(
                String mapHttpMessageFormUrlEncodedBody) {
            setProperty("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder mapHttpMessageHeaders(
                boolean mapHttpMessageHeaders) {
            setProperty("mapHttpMessageHeaders", mapHttpMessageHeaders);
            return this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder mapHttpMessageHeaders(
                String mapHttpMessageHeaders) {
            setProperty("mapHttpMessageHeaders", mapHttpMessageHeaders);
            return this;
        }
        /**
         * The maximum number of connections.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder maxTotalConnections(
                int maxTotalConnections) {
            setProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * The maximum number of connections.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder maxTotalConnections(
                String maxTotalConnections) {
            setProperty("maxTotalConnections", maxTotalConnections);
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
        default AdvancedHttpEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedHttpEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * To use System Properties as fallback for configuration.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder useSystemProperties(
                boolean useSystemProperties) {
            setProperty("useSystemProperties", useSystemProperties);
            return this;
        }
        /**
         * To use System Properties as fallback for configuration.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHttpEndpointBuilder useSystemProperties(
                String useSystemProperties) {
            setProperty("useSystemProperties", useSystemProperties);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.http.common.HttpMethods</code>
     * enum.
     */
    enum HttpMethods {
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        PATCH;
    }
    /**
     * HTTP4 (camel-http4)
     * For calling out to external HTTP servers using Apache HTTP Client 4.x.
     * 
     * Category: http
     * Available as of version: 2.3
     * Maven coordinates: org.apache.camel:camel-http4
     * 
     * Syntax: <code>http:httpUri</code>
     * 
     * Path parameter: httpUri (required)
     * The url of the HTTP endpoint to call.
     */
    default HttpEndpointBuilder http(String path) {
        class HttpEndpointBuilderImpl extends AbstractEndpointBuilder implements HttpEndpointBuilder, AdvancedHttpEndpointBuilder {
            public HttpEndpointBuilderImpl(String path) {
                super("http", path);
            }
        }
        return new HttpEndpointBuilderImpl(path);
    }
}