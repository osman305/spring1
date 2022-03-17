package com.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {

    @Autowired
    Environment env;

    @Bean("rockSolid")
    public String profileName(){
        return env.getActiveProfiles()[0];
    }
    @Bean
    public String getMyProperty(){
        return env.getProperty("myProperty");
    }
}
