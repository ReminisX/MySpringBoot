package com.myspring.demo.controller;


import com.myspring.demo.server.DataServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhangXD
 * @Date 2021/9/3 9:38
 * @Description
 */

@Controller
@RequestMapping("/mydata")
@ResponseBody
public class MyDataCOntroller {

    @Autowired
    private DataServer dataServer;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public String getData(@RequestParam(name = "data")Integer data) {
        return dataServer.showData(data);
    }

    @RequestMapping(path = "size", method = RequestMethod.GET)
    public Integer showSize() {
        return dataServer.showSize();
    }

}
