package com.offcn.user.service;

import com.offcn.user.pojo.TMember;
import com.offcn.user.pojo.TMemberAddress;

import java.util.List;

public interface UserService {
    /**
     * 用户注册
     * @param member
     */
    public void registerUser(TMember member);

    /**
     * 用户登录
     */
    public TMember login(String username,String userpswd);
    /**
     * 根据用户编号查询用户信息
     */
    public TMember findTmemberById(Integer id);

    /**
     * 获取用户收货地址
     * @param memberId
     * @return
     */
    List<TMemberAddress> addressList(Integer memberId);
}
