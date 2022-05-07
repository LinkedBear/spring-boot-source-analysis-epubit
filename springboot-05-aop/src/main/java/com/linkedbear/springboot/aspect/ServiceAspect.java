package com.linkedbear.springboot.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    
    @Before("execution(public * com.linkedbear.springboot.service.*.*(..))")
    public void beforePrint() {
        System.out.println("Service Aspect before advice run ......");
    }
}
