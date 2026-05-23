package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1")
    public String getSample1(){
        return "this is our first sample API - returns to user";
    }

    @GetMapping("/sample2")
    public String getSample2(){
        return "this is our second sample API - returns to user";
    }
}
