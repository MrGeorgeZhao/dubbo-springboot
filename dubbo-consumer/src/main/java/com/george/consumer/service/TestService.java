package com.george.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.george.comoninterface.UserService;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Reference
    private UserService userService;

    public String getHello() {

        return userService.getUserNameById(1);
    }
}
