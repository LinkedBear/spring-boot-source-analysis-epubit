package com.linkedbear.springboot.service;

import com.linkedbear.springboot.dao.UserDao;
import com.linkedbear.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;
    
    @Transactional(rollbackFor = Exception.class)
    public void test() {
        User user = new User();
        user.setName("test dao");
        user.setTel("1234567");
        userDao.save(user);
    
//        int i = 1 / 0;
        
        List<User> userList = userDao.findAll();
        userList.forEach(System.out::println);
    }
}
