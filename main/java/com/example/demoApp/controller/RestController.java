package com.example.demoApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {

    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello World!!UC-1.";
    }
}
