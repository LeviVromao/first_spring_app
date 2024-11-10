package com.levi.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.levi.first_spring_app.services.HelloWorldService;

@RestController
@RequestMapping("/hello_world")
public class HellowWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String hellowWorldString() {
        return helloWorldService.helloWorldName("Levi gostoso");
    }
}
