package com.linkedbear.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebmvcStyleController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello WebFlux";
    }
    
    @GetMapping("/list")
    public List<Integer> list() {
        return Arrays.asList(1, 2, 3);
    }
    
    @GetMapping("/hello2")
    public Mono<String> hello2() {
        return Mono.just("Hello WebFlux");
    }
    
    @GetMapping("/list2")
    public Flux<Integer> list2() {
        return Flux.just(1, 2, 3);
    }
}
