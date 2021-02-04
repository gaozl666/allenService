package com.mall.ypc.modules.mapper;

import com.mall.ypc.modules.entity.UmsMember;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UmsMember selectByPrimaryKey();
}
