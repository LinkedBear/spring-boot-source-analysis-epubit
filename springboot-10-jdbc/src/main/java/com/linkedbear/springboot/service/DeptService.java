package com.linkedbear.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeptService {
    
    @Autowired
    private UserService userService;
    
    @Transactional(rollbackFor = Exception.class)
    public void save() {
        System.out.println("DeptService save run ......");
        userService.test();
    }
}
