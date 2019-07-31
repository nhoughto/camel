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
package org.apache.camel.component.sparkrest;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Test;

/**
 * Test based on the {@link CamelSparkParamTest} test which adds query parameters to the request.
 * @author <a href="jonathan.elliott@capgemini.com">Jon Elliott</a>
 */
public class CamelSparkQueryParamTest extends BaseSparkTest {

    @Test
    public void testSparkGet() throws Exception {
        getMockEndpoint("mock:foo").expectedMessageCount(1);
        getMockEndpoint("mock:foo").expectedHeaderReceived("name", "world");
        getMockEndpoint("mock:foo").expectedHeaderReceived("surname", "universe");

        String out = template.requestBody("http://localhost:" + getPort() + "/hello/world?surname=universe", null, String.class);
        assertEquals("Bye world", out);

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("spark-rest:get:/hello/:name")
                        .to("mock:foo")
                        .transform().simple("Bye ${header.name}");
            }
        };
    }
}