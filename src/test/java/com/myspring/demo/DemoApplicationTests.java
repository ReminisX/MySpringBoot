package com.myspring.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myspring.demo.entity.po.User;
import com.myspring.demo.mapper.UserMapper;
import com.myspring.demo.util.RedisUtil;
import io.lettuce.core.RedisURI;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
@MapperScan("com.myspring.demo.mapper")
class DemoApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testSelect() {
        List res = redisUtil.lGet("l", 0, -1);
        System.out.println(res);
    }

    @Test
    void contextLoads() {
    }

}
