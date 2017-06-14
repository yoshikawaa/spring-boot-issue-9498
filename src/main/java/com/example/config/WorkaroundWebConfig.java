package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

@Profile("workaround")
@Configuration
@EnableWebMvc
public class WorkaroundWebConfig extends WebConfig {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.beanName();
    }
}
