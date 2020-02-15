package com.neimerc.didemo.controllers;

import com.neimerc.didemo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    // now, go to test.controllers to see a manual setter injection
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
