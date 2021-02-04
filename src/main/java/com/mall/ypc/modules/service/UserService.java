package com.mall.ypc.modules.service;

import com.mall.ypc.modules.entity.UmsMember;
import com.mall.ypc.modules.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UmsMember selectAll() {
        UmsMember umsMember = userMapper.selectByPrimaryKey();
        return umsMember;
    }
}
