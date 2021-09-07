package com.myspring.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myspring.demo.entity.po.User;
import com.myspring.demo.service.UserService;
import com.myspring.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User服务接口实现类
 * @author ZhangXD
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    public String getAllUsers(Integer startNum, Integer pageSize) {
        PageHelper.startPage(startNum, pageSize);
        List<User> userList = userMapper.selectList(null);
        PageInfo pageInfo = new PageInfo(userList);
        String jsonOutput = JSON.toJSONString(pageInfo.getList());
        return jsonOutput;
    }

}




