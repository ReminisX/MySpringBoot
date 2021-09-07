package com.myspring.demo.service.impl;

import com.myspring.demo.service.MyDataServer;
import org.springframework.stereotype.Component;

/**
 * @Author ZhangXD
 * @Date 2021/9/3 9:37
 * @Description
 */

@Component
public class DataServerThree implements MyDataServer {
    @Override
    public String getName() {
        return "Three";
    }

    @Override
    public Integer getData() {
        return 3;
    }
}
