package com.myspring.demo.server.impl;

import com.myspring.demo.server.MyDataServer;
import org.springframework.stereotype.Component;

/**
 * @Author ZhangXD
 * @Date 2021/9/3 9:37
 * @Description
 */

@Component
public class DataServerTwo implements MyDataServer {

    @Override
    public String getName() {
        return "Two";
    }

    @Override
    public Integer getData() {
        return 2;
    }
}
