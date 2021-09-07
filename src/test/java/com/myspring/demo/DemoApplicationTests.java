package com.myspring.demo;

import com.myspring.demo.entity.po.User;
import com.myspring.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@MapperScan("com.myspring.demo.mapper")
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

}
