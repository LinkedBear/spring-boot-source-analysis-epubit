package com.linkedbear.springboot;

import com.linkedbear.springboot.service.DeptService;
import com.linkedbear.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootJdbcApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJdbcApplication.class, args);
//        UserService userService = ctx.getBean(UserService.class);
//        userService.test();
        DeptService deptService = ctx.getBean(DeptService.class);
        deptService.save();
    }
}
