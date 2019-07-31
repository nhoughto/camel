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
package org.apache.camel.spring.cloud.consul;

import java.util.Objects;
import java.util.stream.Collectors;

import com.ecwid.consul.v1.agent.model.NewService;
import org.apache.camel.cloud.ServiceDefinition;
import org.apache.camel.spring.boot.cloud.CamelCloudConfigurationProperties;
import org.springframework.cloud.consul.serviceregistry.ConsulRegistration;
import org.springframework.core.convert.converter.Converter;

public final class ServiceDefinitionToConsulRegistration implements Converter<ServiceDefinition, ConsulRegistration> {
    private final CamelCloudConfigurationProperties properties;

    public ServiceDefinitionToConsulRegistration(CamelCloudConfigurationProperties properties) {
        this.properties = properties;
    }

    @Override
    public ConsulRegistration convert(ServiceDefinition source) {
        NewService service = new NewService();
        service.setName(source.getName());
        service.setId(source.getId());
        service.setAddress(properties.getServiceRegistry().getServiceHost());
        service.setPort(source.getPort());

        service.setTags(
            source.getMetadata().entrySet().stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.toList())
        );

        return new ConsulRegistration(service, null) {
            @Override
            public boolean isSecure() {
                return service.getPort() == 443 || Objects.equals("https", source.getMetadata().get(ServiceDefinition.SERVICE_META_PROTOCOL));
            }
        };
    }
}
