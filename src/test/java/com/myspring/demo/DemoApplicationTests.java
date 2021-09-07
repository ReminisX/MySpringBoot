package com.myspring.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myspring.demo.entity.po.User;
import com.myspring.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.myspring.demo.mapper")
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        PageHelper.startPage(0, 1);
        List<User> userList = userMapper.selectList(null);
        PageInfo pageInfo = new PageInfo(userList);
        List<User> res = pageInfo.getList();
        res.forEach(System.out::println);

    }

    @Test
    void contextLoads() {
    }

}
