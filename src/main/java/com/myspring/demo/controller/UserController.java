package com.myspring.demo.controller;

import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.myspring.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhangXD
 * @Date 2021/9/6 10:49
 * @Description
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/all")
    public String UserIndex(@RequestParam("num") Integer num, @RequestParam("size") Integer size) {
        return userServiceImpl.getAllUsers(num, size);
    }



}
