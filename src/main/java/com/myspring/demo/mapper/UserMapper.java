package com.myspring.demo.mapper;

import com.myspring.demo.entity.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.myspring.demo.entity.po.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




