package com.levi.first_spring_app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorldName(String name) {
        return "Hello World " + name;
    }
}
