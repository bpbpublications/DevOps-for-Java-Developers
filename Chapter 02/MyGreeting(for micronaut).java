package com.myproject.app;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class MyGreeting {
    private final String details;

    public MyGreeting(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}
