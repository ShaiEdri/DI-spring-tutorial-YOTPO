package com.example.DItutorialYOTPO.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello YO";
    }
}
