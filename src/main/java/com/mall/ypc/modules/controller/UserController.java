package com.mall.ypc.modules.controller;

import com.mall.ypc.modules.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@Api(value = "用户Controller", tags = {"用户接口"})
public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @ApiOperation(value = "查询活动详情", notes = "查询活动详情")
//    @PostMapping("/getActivityDetail")
//    public void getVersionBusiness() {
//        userService.selectAll();
//        System.out.println("123");
//    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("hello")
    public String hello() {

        return "HelloWord";
    }

    @RequestMapping("getPort")
    public String getPort() {

        return port;
    }
}
