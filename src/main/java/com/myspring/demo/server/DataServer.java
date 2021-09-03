package com.myspring.demo.server;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ZhangXD
 * @Date 2021/9/3 10:00
 * @Description
 */

@Service
public class DataServer {

    Map<Integer, String> map = new HashMap<>();

    public DataServer(List<MyDataServer> list) {
        for (MyDataServer myDataServer : list) {
            map.put(myDataServer.getData(), myDataServer.getName());
        }
    }

    public String showData(Integer num) {
        return map.get(num);
    }

    public Integer showSize() {
        return map.size();
    }

}
