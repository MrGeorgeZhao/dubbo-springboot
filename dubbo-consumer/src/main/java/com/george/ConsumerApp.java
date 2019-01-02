package com.george;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.george.comoninterface.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ConsumerApp {


    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
