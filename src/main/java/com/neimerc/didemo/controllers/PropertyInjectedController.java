package com.neimerc.didemo.controllers;

import com.neimerc.didemo.services.GreetingService;

public class PropertyInjectedController {

    // now, go to test.controllers to see a manual property injection
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
