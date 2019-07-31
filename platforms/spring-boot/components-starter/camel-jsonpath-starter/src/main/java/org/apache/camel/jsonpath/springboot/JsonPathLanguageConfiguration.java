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
package org.apache.camel.jsonpath.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.LanguageConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * To use JsonPath in Camel expressions or predicates.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.language.jsonpath")
public class JsonPathLanguageConfiguration
        extends
            LanguageConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the jsonpath language. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether to suppress exceptions such as PathNotFoundException.
     */
    private Boolean suppressExceptions = false;
    /**
     * Whether to allow in inlined simple exceptions in the JsonPath expression
     */
    private Boolean allowSimple = true;
    /**
     * Whether to allow using the easy predicate parser to pre-parse predicates.
     */
    private Boolean allowEasyPredicate = true;
    /**
     * Whether to write the output of each row/element as a JSON String value
     * instead of a Map/POJO value.
     */
    private Boolean writeAsString = false;
    /**
     * Name of header to use as input, instead of the message body
     */
    private String headerName;
    /**
     * Whether to trim the value to remove leading and trailing whitespaces and
     * line breaks
     */
    private Boolean trim = true;

    public Boolean getSuppressExceptions() {
        return suppressExceptions;
    }

    public void setSuppressExceptions(Boolean suppressExceptions) {
        this.suppressExceptions = suppressExceptions;
    }

    public Boolean getAllowSimple() {
        return allowSimple;
    }

    public void setAllowSimple(Boolean allowSimple) {
        this.allowSimple = allowSimple;
    }

    public Boolean getAllowEasyPredicate() {
        return allowEasyPredicate;
    }

    public void setAllowEasyPredicate(Boolean allowEasyPredicate) {
        this.allowEasyPredicate = allowEasyPredicate;
    }

    public Boolean getWriteAsString() {
        return writeAsString;
    }

    public void setWriteAsString(Boolean writeAsString) {
        this.writeAsString = writeAsString;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public Boolean getTrim() {
        return trim;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }
}