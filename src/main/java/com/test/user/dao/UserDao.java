package com.test.user.dao;

import com.test.user.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDao {

    @Resource
    private SessionFactory sessionFactory;

    @Test
    public List<User> findAll() {
        List<User> list = null;
        System.out.println("findAll");
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User");
        list = query.list();
        return list;
    }


    public void testPrint(){
        System.out.println("框架学习");
    }
}