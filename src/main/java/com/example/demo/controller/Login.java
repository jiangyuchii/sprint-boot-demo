package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Login {

    @RequestMapping("/index")
    public String login(){
        return "index";
    }
}
