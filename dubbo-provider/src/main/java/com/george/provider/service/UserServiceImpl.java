package com.george.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.george.comoninterface.UserService;
import org.springframework.stereotype.Component;

@Service
public class UserServiceImpl implements UserService {
    public String getUserNameById(long id) {
        return "George id is " + id;
    }
}
