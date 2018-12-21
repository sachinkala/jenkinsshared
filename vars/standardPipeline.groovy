package com.capitalone.api.creditcards.applicationfraud.appfraudmicroservice.config;

import com.capitalone.api.creditcards.applicationfraud.appfraudmicroservice.rest.v3.CardAppFraudResource;
import com.capitalone.chassis.engine.jersey.extensions.config.BaseResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig extends BaseResourceConfig {
    public ResourceConfig() {
        super();
        register( CardAppFraudResource.class);
    }
}



/*
 * Copyright 2018 Capital One Financial Corporation All Rights Reserved.
 *
 * This software contains valuable trade secrets and proprietary information of Capital One and is protected by law. It
 * may not be copied or distributed in any form or medium, disclosed to third parties, reverse engineered or used in any
 * manner without prior written authorization from Capital One.
 */
