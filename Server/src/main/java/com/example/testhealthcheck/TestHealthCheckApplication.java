package com.example.testhealthcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication
@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.example.testhealthcheck")

public class TestHealthCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestHealthCheckApplication.class, args);
    }

}
