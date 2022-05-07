package com.linkedbear.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class GracefulTestController {
    
    @GetMapping("/test")
    public String test() throws Exception {
        System.out.println(System.currentTimeMillis());
        TimeUnit.SECONDS.sleep(10);
        System.out.println(System.currentTimeMillis());
        return "success";
    }
}
