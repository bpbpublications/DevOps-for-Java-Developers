package com.myproject.app;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

@Controller("/")
public class MyGreetingController {
    private static final String DefaultMessage = "Hello, %s!";

    @Get(uri = "/greet")
    public MyGreeting greet(@QueryValue(value = "name",
        defaultValue = "Java") String name) {
        return new MyGreeting(String.format(DefaultMessage, name));
    }
}
