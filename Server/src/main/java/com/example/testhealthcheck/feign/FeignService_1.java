package com.example.testhealthcheck.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name ="service1", url = "http://localhost:8088")
public interface FeignService_1 {

    @GetMapping(path = "/hello",
            headers = {"Content-Type=application/json", "Accept=application/json"}
    )
    String hello();

    @GetMapping(path = "/hello2",
            headers = {"Content-Type=application/json", "Accept=application/json"}
    )
    String hello2();
}
