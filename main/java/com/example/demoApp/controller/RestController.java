package com.example.demoApp.controller;


import com.example.demoApp.model.User;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {

    //localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "home"})
    public String sayHello() {
        return "Hello World!!UC-1.";
    }

    //localhost:8080/hello/query?name=Mark
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value= "name")String name){
        return "Hello "+ name +" From Bridgelabz!!UC-2";
    }

    //curl localhost:8080/hello/param/Mark -w
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From Bridgelabz!!UC-3";
    }

    //http://localhost:8080/hello/create-user" -w "\n
    @PostMapping(value = {"/create-user","/post"})
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " From Bridgelabz";
    }



    //localhost:8080/hello/update/Mark/?lastName=Taylor
    @PutMapping("/update/{firstName}")
    public String sayHelloTaylor(@PathVariable String firstName,@RequestParam String lastName,User user){
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return "Hello "+user.getFirstName() + " " +user.getLastName() +" !";
    }

}
