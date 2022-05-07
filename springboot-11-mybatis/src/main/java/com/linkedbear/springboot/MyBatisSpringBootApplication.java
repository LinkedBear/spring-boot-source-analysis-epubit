package com.linkedbear.springboot;

import com.linkedbear.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MyBatisSpringBootApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(MyBatisSpringBootApplication.class, args);
        UserService userService = ctx.getBean(UserService.class);
        userService.test();
    }
}
