package com.george;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@EnableDubbo
@SpringBootApplication
public class ServerApp {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServerApp.class, args);
    }
}
