package com.demo.ume.demo_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public  String testUser(){
        return "testing";
    }
}
