package com.neimerc.didemo.controllers;

import com.neimerc.didemo.services.GreetingService;

public class ConstructorInjectedController {

    // the use of private final is a best practice.
    // This way I can't change the object
    private final GreetingService greetingService;

    // now, go to test.controllers to see a manual constructor injection
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
