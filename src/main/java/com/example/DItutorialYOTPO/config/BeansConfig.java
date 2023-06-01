package com.example.DItutorialYOTPO.config;

import com.example.DItutorialYOTPO.controllers.PropertyInjectedController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    public PropertyInjectedController propertyInjectedController(){
        return new PropertyInjectedController();
    }
}
