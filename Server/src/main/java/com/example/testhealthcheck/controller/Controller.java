package com.example.testhealthcheck.controller;

import com.example.testhealthcheck.feign.FeignService_1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final FeignService_1 feignService;

    public Controller(FeignService_1 feignService) {
        this.feignService = feignService;
    }

    @GetMapping("/")
    public String home() {
        return feignService.hello();
    }

    @GetMapping("/123")
    public String home1() {
        return "hieu 2002";
    }
}
