package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping(value = {"/", "/home"})
    public String homepage() {
        return "dinh minh hieu"; // Trả về home.html
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("1");
        return "Service 1";
    }


    @GetMapping("/hello2")
    public String hello2() throws Exception{
        System.out.println("2");
        throw new Exception("Trường hợp lỗi");
    }

}

