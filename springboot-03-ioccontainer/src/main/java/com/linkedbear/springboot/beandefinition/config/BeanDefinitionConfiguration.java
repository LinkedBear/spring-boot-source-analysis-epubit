package com.linkedbear.springboot.beandefinition.config;

import com.linkedbear.springboot.beandefinition.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDefinitionConfiguration {
    
    @Bean
    public Person person() {
        return new Person();
    }
}
