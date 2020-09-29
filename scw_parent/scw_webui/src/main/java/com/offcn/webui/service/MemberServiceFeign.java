package com.offcn.webui.service;

import com.offcn.response.AppResponse;
import com.offcn.webui.service.impl.MemberServiceFeignException;
import com.offcn.webui.vo.resp.UserAddressVo;
import com.offcn.webui.vo.resp.UserRespVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="SCW-USER",fallback = MemberServiceFeignException.class )
public interface MemberServiceFeign {

    @PostMapping("/user/login")
    public AppResponse<UserRespVo> login(@RequestParam("username")  String username, @RequestParam("password") String password);
    @PostMapping("/user/findUser/{id}")
    public AppResponse<UserRespVo> findUser(@PathVariable("id") Integer id);

    @GetMapping("/user/info/address")
    public AppResponse<List<UserAddressVo>> address(@RequestParam("accessToken") String accessToken);
}
