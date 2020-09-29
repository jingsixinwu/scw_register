package com.offcn.user.controller;


import com.offcn.user.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

@Api(tags = "第一个Swagger测试")
@RestController
public class UserController {

    @ApiOperation("测试方法hello")
    @ApiImplicitParams(value= {
            @ApiImplicitParam(name="name",value="姓名",required = true),
            @ApiImplicitParam(name="age",value="年龄")
    })
    @GetMapping("/hello")
    public String hello(String name){
        return "OK"+name;
    }




    @ApiOperation("保存用户")
    @ApiImplicitParams(value= {
            @ApiImplicitParam(name="name",value="姓名",required = true),
            @ApiImplicitParam(name="email",value="邮箱",required = true)
    })
    @PostMapping("/user")
    public User save(String name, String email){
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        return user;
    }





}
