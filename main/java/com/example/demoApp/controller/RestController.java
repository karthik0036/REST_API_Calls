package com.example.demoApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {

    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello World!!UC-1.";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value= "name")String name){
        return "Hello "+ name +" From Bridgelabz";
    }
}
