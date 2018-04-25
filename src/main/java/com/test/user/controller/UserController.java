package com.test.user.controller;

import com.test.user.entity.User;
import com.test.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author panjie
 * @Description:com.test.user.controller
 * @date 2018/1/22 0022
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("user/list.do")
    public String list(HttpServletRequest request){
        List<User> list = userService.findAll();
        System.out.println("user/list.do");
        request.setAttribute("list", list);
        return "/user/list";
    }

    @RequestMapping("user/getList.do")
    public void getList(){
        userService.testPrint();
        System.out.println("123456");
    }

    @Test
    public void print(){
        userService.print();
    }
}
