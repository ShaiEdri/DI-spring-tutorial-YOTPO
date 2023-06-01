package com.example.DItutorialYOTPO.controllers;

import com.example.DItutorialYOTPO.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return "ConstructorInjectedController" + greetingService.getGreeting();
    }
}
