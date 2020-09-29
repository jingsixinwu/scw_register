package com.offcn.user.controller;

import com.offcn.response.AppResponse;
import com.offcn.user.component.SmsTemplate;
import com.offcn.user.pojo.TMember;
import com.offcn.user.service.UserService;
import com.offcn.user.vo.req.UserRegistVo;
import com.offcn.user.vo.resp.UserRespVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Api(tags = "用户登录/注册模块（包含有忘记密码等）")
@RestController
@RequestMapping("/user")
@Slf4j
public class UserLoginController {
    @Autowired
    private SmsTemplate smsTemplate;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @ApiOperation("获取注册的验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNo", value = "手机号", required = true)
    })//@ApiImplicitParams：描述所有参数；@ApiImplicitParam描述某个参数
    @PostMapping("/sendCode")
    public AppResponse<Object> sendCode(String phoneNo) {
        //1、生成验证码保存到服务器，准备用户提交上来进行对比
        String code = UUID.randomUUID().toString().substring(0, 4);
        //2、保存验证码和手机号的对应关系,设置验证码过期时间
        redisTemplate.opsForValue().set(phoneNo, code, 10000, TimeUnit.MINUTES);
        //3、短信发送构造参数
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", phoneNo);
        querys.put("param", "code:" + code);
        querys.put("tpl_id", "TP1711063");//短信模板
        //4、发送短信
        String sendCode = smsTemplate.sendCode(querys);
        if (sendCode.equals("") || sendCode.equals("fail")) {
            //短信失败
            return AppResponse.fail("短信发送失败");
        }
        return AppResponse.ok(sendCode);
    }

    /**
     * 用户注册
     */
    @ApiOperation("用户注册")
    @PostMapping("/regist")
    public AppResponse<Object> regist(UserRegistVo userRegistVo) {
       //1、校验短信验证码
        String code = redisTemplate.opsForValue().get(userRegistVo.getLoginacct());

        if(!StringUtils.isEmpty(code)){  //redis中存在验证码
            boolean b = code.equals(userRegistVo.getCode());
            if(b){//手机短信验证码相同

                TMember member = new TMember();
                //将请求的数据封装到 member中
                BeanUtils.copyProperties(userRegistVo,member);
                //3、将用户信息注册到数据库
                try {
                    userService.registerUser(member);
                    log.debug("用户信息注册成功：{}", member.getLoginacct());
                    //4、注册成功后，删除验证码
                    redisTemplate.delete(userRegistVo.getLoginacct());
                    return AppResponse.ok("注册成功...");
                } catch (Exception e) {
                    log.error("用户信息注册失败：{}", member.getLoginacct());
                    return AppResponse.fail(e.getMessage());
                }
            }else{
                return AppResponse.fail("验证码错误");
            }


        }else{
            return AppResponse.fail("验证码过期，请重新获取");
        }

    }


    @ApiOperation("用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true),
            @ApiImplicitParam(name = "username", value = "密码", required = true)
    })//@ApiImplicitParams：描述所有参数；@ApiImplicitParam描述某个参数
    @PostMapping("/login")
    public AppResponse<UserRespVo> login(String username,String password) {
        //1. 尝试登录
        TMember member = userService.login(username, password);
        if(member==null){
            //登录失败
            AppResponse<UserRespVo> fail = AppResponse.fail(null);
            fail.setMsg("用户名密码错误");
            return fail;

        }

        //登录成功：生成令牌
        String token=UUID.randomUUID().toString().replaceAll("-","");

        UserRespVo vo = new UserRespVo();
        BeanUtils.copyProperties(member,vo);
        vo.setAccessToken(token);

        //将令牌保存到redis中
        redisTemplate.opsForValue().set(token,member.getId()+"",2,TimeUnit.HOURS);



        return AppResponse.ok(vo);
    }

    /**
     * 根据用户id查询用户信息
     */
    @ApiOperation("根据用户的id查询用户信息")
    @PostMapping("/findUser/{id}")
    public AppResponse<UserRespVo> findUser(@PathVariable("id") Integer id) {
        TMember tmember = userService.findTmemberById(id);
        UserRespVo userRespVo = new UserRespVo();
        BeanUtils.copyProperties(tmember,userRespVo);
        return AppResponse.ok(userRespVo);

    }



}
