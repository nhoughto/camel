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
package org.apache.camel.spring.config;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringRunWithTestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
public class ProducerTemplateMaximumCacheSizeTest extends SpringRunWithTestSupport {

    @Autowired
    private ProducerTemplate template;

    @Autowired
    private CamelContext context;

    @Test
    public void testTemplateMaximumCache() throws Exception {
        assertNotNull("Should have injected a producer template", template);

        ProducerTemplate lookup = context.getRegistry().lookupByNameAndType("template", ProducerTemplate.class);
        assertNotNull("Should lookup producer template", lookup);

        assertEquals(50, template.getMaximumCacheSize());
        assertEquals("Size should be 0", 0, template.getCurrentCacheSize());

        // test that we cache at most 50 producers to avoid it eating to much memory
        for (int i = 0; i < 53; i++) {
            Endpoint e = context.getEndpoint("seda:queue:" + i);
            template.sendBody(e, "Hello");
        }

        // the eviction is async so force cleanup
        template.cleanUp();

        assertTrue("Size should be around 50", template.getCurrentCacheSize() >= 50);
        template.stop();

        // should be 0
        assertEquals("Size should be 0", 0, template.getCurrentCacheSize());
    }

}