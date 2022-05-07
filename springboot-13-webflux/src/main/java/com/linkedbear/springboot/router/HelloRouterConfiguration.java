package com.linkedbear.springboot.router;

import com.linkedbear.springboot.handler.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class HelloRouterConfiguration {
    
    @Autowired
    private HelloHandler helloHandler;
    
    @Bean
    public RouterFunction<ServerResponse> helloRouter() {
        return RouterFunctions.route(GET("/hello3").and(accept(MediaType.TEXT_PLAIN)), helloHandler::hello3)
                .andRoute(GET("/list3").and(accept(MediaType.APPLICATION_JSON)), helloHandler::list3);
    }
}
