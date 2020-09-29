package com.offcn.webui.controller;

import com.offcn.response.AppResponse;
import com.offcn.webui.service.MemberServiceFeign;
import com.offcn.webui.service.ProjectServiceFeign;
import com.offcn.webui.vo.resp.ProjectVo;
import com.offcn.webui.vo.resp.UserRespVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Slf4j
public class DispathcherController {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @Autowired
    private ProjectServiceFeign projectServiceFeign;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/")
    public String toIndex(Model model){
        //从redis读取项目集合
        List<ProjectVo> data  = (List<ProjectVo>) redisTemplate.opsForValue().get("projectStr");
        //判断从redis获取 项目集合是否为空
        if(data==null){
            //如果为空远程调用服务查询所有项目列表
            AppResponse<List<ProjectVo>> allProject = projectServiceFeign.all();
            //将查询响应的项目列表数据传递给data
            data=allProject.getData();
            //存储到redis缓存中一份
            redisTemplate.opsForValue().set("projectStr",data);
        }

        model.addAttribute("projectList",data);



        return "index";
    }

    /**
     *处理用户登录
     * @param loginacct
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLogin(String loginacct, String password, HttpSession session){
        //调用远程的用户登录服务来进行登录的验证
        AppResponse<UserRespVo> appResponse = memberServiceFeign.login(loginacct, password);

        //取出响应的结果登录验证后的数据
        UserRespVo userRespVo = appResponse.getData();

        log.info("登录账号:{},密码:{}",loginacct,password);

        log.info("登录用户数据:{}",userRespVo);

        if(userRespVo==null){
            //账号不存在
            return "redirect:/login.html";

        }

        //用户存在，登录用户用户信息存储session中
        session.setAttribute("sessionMember",userRespVo);

        //从session获取前缀
        String preUrl=(String)session.getAttribute("preUrl");

        if(StringUtils.isEmpty(preUrl)){
            return "redirect:/";
        }

        String url="redirect:/"+preUrl;
        System.out.println("url:"+url);

        //如果存在就跳转到前缀地址
        return url; //http://project/confirm/order/2
    }
}
