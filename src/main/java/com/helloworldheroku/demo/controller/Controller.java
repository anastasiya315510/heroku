package com.helloworldheroku.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping("/hello-heroku")
    public String hi(){
        return "Hello from Heroku";
    }
}
