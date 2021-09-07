package com.myspring.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myspring.demo.entity.po.User;
import com.myspring.demo.service.UserService;
import com.myspring.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * User服务接口实现类
 * @author ZhangXD
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}




