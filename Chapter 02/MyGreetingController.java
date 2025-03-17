package com.myproject.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyGreetingController {
    private static final String DefaultMessage = "Hello, %s!";

    @GetMapping("/greet")
    public MyGreeting greet(@RequestParam(value = "name", defaultValue = "Java") String name) {
        return new MyGreeting(String.format(DefaultMessage, name));
    }
