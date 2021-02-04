package com.mall.ypc.modules.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {
    int  selectByParamTotal();
}
