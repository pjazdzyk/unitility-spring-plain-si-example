package com.synerset.unitility.spring.examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.synerset.unitility.jackson.module.PhysicalQuantityJacksonModulePlainSIValue;
import com.synerset.unitility.unitsystem.util.PhysicalQuantityParsingFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomModuleConfiguration {

    @Autowired
    void registerNewConfig(ObjectMapper objectMapper) {
        objectMapper.registerModule(
                new PhysicalQuantityJacksonModulePlainSIValue(PhysicalQuantityParsingFactory.getDefaultParsingFactory())
        );
    }

}