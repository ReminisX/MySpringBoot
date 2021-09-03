package com.myspring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhangXD
 * @Date 2021/9/2 9:33
 * @Description index page
 */
@Controller
@RequestMapping("/index")
@ResponseBody
public class IndexController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String showIndex(){
        return "this is a index page";
    }

}
