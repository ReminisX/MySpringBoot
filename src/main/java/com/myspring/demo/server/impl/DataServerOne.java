package com.myspring.demo.server.impl;

/**
 * @Author ZhangXD
 * @Date 2021/9/3 9:36
 * @Description
 */

import com.myspring.demo.server.MyDataServer;
import org.springframework.stereotype.Component;

@Component
public class DataServerOne implements MyDataServer {
    @Override
    public String getName() {
        return "One";
    }

    @Override
    public Integer getData() {
        return 1;
    }
}
