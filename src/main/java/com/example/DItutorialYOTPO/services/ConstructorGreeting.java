package com.example.DItutorialYOTPO.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreeting implements GreetingService {
    @Override
    public String getGreeting() {
        return "Yo Contruct";
    }
}
