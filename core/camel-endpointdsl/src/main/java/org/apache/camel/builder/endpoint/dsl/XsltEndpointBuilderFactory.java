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

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transforms the message using a XSLT template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface XsltEndpointBuilderFactory {


    /**
     * Builder for endpoint for the XSLT component.
     */
    public interface XsltEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedXsltEndpointBuilder advanced() {
            return (AdvancedXsltEndpointBuilder) this;
        }
        /**
         * Whether to allow using StAX as the javax.xml.transform.Source.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder allowStAX(boolean allowStAX) {
            setProperty("allowStAX", allowStAX);
            return this;
        }
        /**
         * Whether to allow using StAX as the javax.xml.transform.Source.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder allowStAX(String allowStAX) {
            setProperty("allowStAX", allowStAX);
            return this;
        }
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder contentCache(boolean contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder contentCache(String contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * If you have output=file then this option dictates whether or not the
         * output file should be deleted when the Exchange is done processing.
         * For example suppose the output file is a temporary file, then it can
         * be a good idea to delete it after use.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder deleteOutputFile(boolean deleteOutputFile) {
            setProperty("deleteOutputFile", deleteOutputFile);
            return this;
        }
        /**
         * If you have output=file then this option dictates whether or not the
         * output file should be deleted when the Exchange is done processing.
         * For example suppose the output file is a temporary file, then it can
         * be a good idea to delete it after use.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder deleteOutputFile(String deleteOutputFile) {
            setProperty("deleteOutputFile", deleteOutputFile);
            return this;
        }
        /**
         * Whether or not to throw an exception if the input body is null.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder failOnNullBody(boolean failOnNullBody) {
            setProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether or not to throw an exception if the input body is null.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder failOnNullBody(String failOnNullBody) {
            setProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Option to specify which output type to use. Possible values are:
         * string, bytes, DOM, file. The first three options are all in memory
         * based, where as file is streamed directly to a java.io.File. For file
         * you must specify the filename in the IN header with the key
         * Exchange.XSLT_FILE_NAME which is also CamelXsltFileName. Also any
         * paths leading to the filename must be created beforehand, otherwise
         * an exception is thrown at runtime.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xslt.XsltOutput</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder output(XsltOutput output) {
            setProperty("output", output);
            return this;
        }
        /**
         * Option to specify which output type to use. Possible values are:
         * string, bytes, DOM, file. The first three options are all in memory
         * based, where as file is streamed directly to a java.io.File. For file
         * you must specify the filename in the IN header with the key
         * Exchange.XSLT_FILE_NAME which is also CamelXsltFileName. Also any
         * paths leading to the filename must be created beforehand, otherwise
         * an exception is thrown at runtime.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xslt.XsltOutput</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder output(String output) {
            setProperty("output", output);
            return this;
        }
        /**
         * Whether to use Saxon as the transformerFactoryClass. If enabled then
         * the class net.sf.saxon.TransformerFactoryImpl. You would need to add
         * Saxon to the classpath.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder saxon(boolean saxon) {
            setProperty("saxon", saxon);
            return this;
        }
        /**
         * Whether to use Saxon as the transformerFactoryClass. If enabled then
         * the class net.sf.saxon.TransformerFactoryImpl. You would need to add
         * Saxon to the classpath.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder saxon(String saxon) {
            setProperty("saxon", saxon);
            return this;
        }
        /**
         * The number of javax.xml.transform.Transformer object that are cached
         * for reuse to avoid calls to Template.newTransformer().
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder transformerCacheSize(
                int transformerCacheSize) {
            setProperty("transformerCacheSize", transformerCacheSize);
            return this;
        }
        /**
         * The number of javax.xml.transform.Transformer object that are cached
         * for reuse to avoid calls to Template.newTransformer().
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default XsltEndpointBuilder transformerCacheSize(
                String transformerCacheSize) {
            setProperty("transformerCacheSize", transformerCacheSize);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the XSLT component.
     */
    public interface AdvancedXsltEndpointBuilder
            extends
                EndpointProducerBuilder {
        default XsltEndpointBuilder basic() {
            return (XsltEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder basicPropertyBinding(
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
        default AdvancedXsltEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom org.xml.sax.EntityResolver with
         * javax.xml.transform.sax.SAXSource.
         * 
         * The option is a: <code>org.xml.sax.EntityResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder entityResolver(Object entityResolver) {
            setProperty("entityResolver", entityResolver);
            return this;
        }
        /**
         * To use a custom org.xml.sax.EntityResolver with
         * javax.xml.transform.sax.SAXSource.
         * 
         * The option will be converted to a
         * <code>org.xml.sax.EntityResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder entityResolver(String entityResolver) {
            setProperty("entityResolver", entityResolver);
            return this;
        }
        /**
         * Allows to configure to use a custom
         * javax.xml.transform.ErrorListener. Beware when doing this then the
         * default error listener which captures any errors or fatal errors and
         * store information on the Exchange as properties is not in use. So
         * only use this option for special use-cases.
         * 
         * The option is a: <code>javax.xml.transform.ErrorListener</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder errorListener(Object errorListener) {
            setProperty("errorListener", errorListener);
            return this;
        }
        /**
         * Allows to configure to use a custom
         * javax.xml.transform.ErrorListener. Beware when doing this then the
         * default error listener which captures any errors or fatal errors and
         * store information on the Exchange as properties is not in use. So
         * only use this option for special use-cases.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.ErrorListener</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder errorListener(String errorListener) {
            setProperty("errorListener", errorListener);
            return this;
        }
        /**
         * Allows you to use a custom
         * org.apache.camel.builder.xml.ResultHandlerFactory which is capable of
         * using custom org.apache.camel.builder.xml.ResultHandler types.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xslt.ResultHandlerFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder resultHandlerFactory(
                Object resultHandlerFactory) {
            setProperty("resultHandlerFactory", resultHandlerFactory);
            return this;
        }
        /**
         * Allows you to use a custom
         * org.apache.camel.builder.xml.ResultHandlerFactory which is capable of
         * using custom org.apache.camel.builder.xml.ResultHandler types.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xslt.ResultHandlerFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder resultHandlerFactory(
                String resultHandlerFactory) {
            setProperty("resultHandlerFactory", resultHandlerFactory);
            return this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder saxonConfiguration(
                Object saxonConfiguration) {
            setProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option will be converted to a <code>java.lang.Object</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder saxonConfiguration(
                String saxonConfiguration) {
            setProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can comma to separate multiple values to lookup.
         * 
         * The option is a: <code>java.util.List&lt;java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder saxonExtensionFunctions(
                List<Object> saxonExtensionFunctions) {
            setProperty("saxonExtensionFunctions", saxonExtensionFunctions);
            return this;
        }
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can comma to separate multiple values to lookup.
         * 
         * The option will be converted to a
         * <code>java.util.List&lt;java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder saxonExtensionFunctions(
                String saxonExtensionFunctions) {
            setProperty("saxonExtensionFunctions", saxonExtensionFunctions);
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
        default AdvancedXsltEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedXsltEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory.
         * 
         * The option is a: <code>javax.xml.transform.TransformerFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder transformerFactory(
                Object transformerFactory) {
            setProperty("transformerFactory", transformerFactory);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.TransformerFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder transformerFactory(
                String transformerFactory) {
            setProperty("transformerFactory", transformerFactory);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory, specified as a FQN class
         * name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder transformerFactoryClass(
                String transformerFactoryClass) {
            setProperty("transformerFactoryClass", transformerFactoryClass);
            return this;
        }
        /**
         * To use a custom javax.xml.transform.URIResolver.
         * 
         * The option is a: <code>javax.xml.transform.URIResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder uriResolver(Object uriResolver) {
            setProperty("uriResolver", uriResolver);
            return this;
        }
        /**
         * To use a custom javax.xml.transform.URIResolver.
         * 
         * The option will be converted to a
         * <code>javax.xml.transform.URIResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedXsltEndpointBuilder uriResolver(String uriResolver) {
            setProperty("uriResolver", uriResolver);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.xslt.XsltOutput</code>
     * enum.
     */
    enum XsltOutput {
        string,
        bytes,
        DOM,
        file;
    }
    /**
     * XSLT (camel-xslt)
     * Transforms the message using a XSLT template.
     * 
     * Category: core,transformation
     * Available as of version: 1.3
     * Maven coordinates: org.apache.camel:camel-xslt
     * 
     * Syntax: <code>xslt:resourceUri</code>
     * 
     * Path parameter: resourceUri (required)
     * Path to the template. The following is supported by the default
     * URIResolver. You can prefix with: classpath, file, http, ref, or bean.
     * classpath, file and http loads the resource using these protocols
     * (classpath is default). ref will lookup the resource in the registry.
     * bean will call a method on a bean to be used as the resource. For bean
     * you can specify the method name after dot, eg bean:myBean.myMethod
     */
    default XsltEndpointBuilder xslt(String path) {
        class XsltEndpointBuilderImpl extends AbstractEndpointBuilder implements XsltEndpointBuilder, AdvancedXsltEndpointBuilder {
            public XsltEndpointBuilderImpl(String path) {
                super("xslt", path);
            }
        }
        return new XsltEndpointBuilderImpl(path);
    }
}