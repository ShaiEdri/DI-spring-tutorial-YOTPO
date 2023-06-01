package com.example.DItutorialYOTPO.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PropertyGreeting implements GreetingService{
    @Override
    public String getGreeting() {
        return "YO in prop";
    }
}
