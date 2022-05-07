package com.linkedbear.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
    
    @After("execution(public * com.linkedbear.springboot.service.*.*(..))")
    public void afterPrint() {
        System.out.println("Service Aspect after advice run ......");
    }
    
    @AfterReturning("execution(public * com.linkedbear.springboot.service.*.*(..))")
    public void afterReturningPrint() {
        System.out.println("Service Aspect afterReturning advice run ......");
    }
    
    @AfterThrowing("execution(public * com.linkedbear.springboot.service.*.*(..))")
    public void afterThrowingPrint() {
        System.out.println("Service Aspect afterThrowing advice run ......");
    }
    
    @Around("execution(public * com.linkedbear.springboot.service.*.*(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Service Aspect around before run ......");
        Object ret = joinPoint.proceed();
        System.out.println("Service Aspect around after run ......");
        return ret;
    }
}
