package com.george.controller;

import com.george.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String sayHello() {
        // return testService.getHello();
        return testService.getHello();
    }
}