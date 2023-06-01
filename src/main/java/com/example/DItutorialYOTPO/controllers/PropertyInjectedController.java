package com.example.DItutorialYOTPO.controllers;

import com.example.DItutorialYOTPO.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return "PropInjectedController" + greetingService.getGreeting();
    }
}
