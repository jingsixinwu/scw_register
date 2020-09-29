package com.offcn.user.controller;


import com.offcn.response.AppResponse;
import com.offcn.user.pojo.TMemberAddress;
import com.offcn.user.service.UserService;
import com.offcn.user.vo.resp.UserAddressVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags="获取会员信息/更新个人信息/获取用户收货地址")
@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户收货地址")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "访问令牌", name = "accessToken", required = true)
    })
    @GetMapping("/info/address")
    public AppResponse<List<UserAddressVo>> address(String accessToken) {
        //1.得到登录会员ID
        String memberId = (String) redisTemplate.opsForValue().get(accessToken);
        if (StringUtils.isEmpty(memberId)) {
            return AppResponse.fail(null);
        }
        //2.查询该会员收货地址列表
        List<TMemberAddress> addressList = userService.addressList(Integer.parseInt(memberId));
        //3.将地址信息封装到Vo
        List<UserAddressVo> addressVoList = new ArrayList<>();
        for (TMemberAddress address : addressList) {
            UserAddressVo vo = new UserAddressVo();
            vo.setId(address.getId());
            vo.setAddress(address.getAddress());
            addressVoList.add(vo);
        }
        return AppResponse.ok(addressVoList);
    }


}
