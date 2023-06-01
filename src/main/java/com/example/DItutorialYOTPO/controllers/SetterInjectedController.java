package com.example.DItutorialYOTPO.controllers;

import com.example.DItutorialYOTPO.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return "SetterInjectedController" + greetingService.getGreeting();
    }
}
