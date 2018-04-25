package com.test.user.service;

import com.test.user.dao.UserDao;
import com.test.user.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panjie
 * @Description:com.test.user.service
 * @date 2018/1/24 0024
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Test
    public void testPrint(){
        userDao.testPrint();
    }

    @Test
    public void print(){
        System.out.println(123456);
    }
}
