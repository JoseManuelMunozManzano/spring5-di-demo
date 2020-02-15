package com.neimerc.didemo.controllers;

import com.neimerc.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // anotación opcional cuando es por constructor
    // @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
