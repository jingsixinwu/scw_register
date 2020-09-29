package com.offcn.webui.controller;

import com.netflix.discovery.converters.Auto;
import com.offcn.response.AppResponse;
import com.offcn.webui.service.MemberServiceFeign;
import com.offcn.webui.service.ProjectServiceFeign;
import com.offcn.webui.vo.resp.ProjectDetailVo;
import com.offcn.webui.vo.resp.ReturnPayConfirmVo;
import com.offcn.webui.vo.resp.UserAddressVo;
import com.offcn.webui.vo.resp.UserRespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectServiceFeign projectServiceFeign;
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @RequestMapping("/projectInfo")
    public String  index(Integer id, Model model, HttpSession session){
        //远程调用服务方法，查询项目详情
        AppResponse<ProjectDetailVo> vo = projectServiceFeign.detailsInfo(id);
        //取出查询出的数据
        ProjectDetailVo data = vo.getData();
       //绑定数据
        model.addAttribute("DetailVo",data);
        session.setAttribute("DetailVo",data);

        return "project/project";
    }

    @RequestMapping("/confirm/returns/{projectId}/{returnId}")
    public String returnInfo(@PathVariable("projectId") Integer projectId,
                             @PathVariable("returnId") Integer returnId,
                             Model model, HttpSession session){
        //从session中获取项目详细信息
        ProjectDetailVo projectDetailVo = (ProjectDetailVo)session.getAttribute("DetailVo");
       //根据项目回报编号，获取项目回报信息
        AppResponse<ReturnPayConfirmVo> returnPayConfirmVoAppResponse = projectServiceFeign.getTReturn(returnId);
        //取出回报信息
        ReturnPayConfirmVo returnPayConfirmVo = returnPayConfirmVoAppResponse.getData();
        //设置回报项目的id
        returnPayConfirmVo.setProjectId(projectId);
        //设置项目回报的项目名
        returnPayConfirmVo.setProjectName(projectDetailVo.getName());

        //根据项目发起方的id查询项目发起方的名称
        AppResponse<UserRespVo> userRespVoAppResponse = memberServiceFeign.findUser(projectDetailVo.getMemberid());
        //取出用户信息
        UserRespVo userRespVo = userRespVoAppResponse.getData();
        returnPayConfirmVo.setMemberId(projectDetailVo.getMemberid());
        returnPayConfirmVo.setMemberName(userRespVo.getRealname());
        //添加项目回报的信息到session中
        session.setAttribute("returnConfirm",returnPayConfirmVo);
        //添加项目回报到model中
        model.addAttribute("returnConfirm",returnPayConfirmVo);

        return "project/pay-step-1";



    }

    /**
     * 跳转支付确认页面
     * @param num
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/confirm/order/{num}")
    public String confirmOrder(@PathVariable("num") Integer num,Model model, HttpSession session){
          //1. 查询用户是否已登录
        UserRespVo userRespVo= (UserRespVo)session.getAttribute("sessionMember");
        // 判断是否为空
        if(userRespVo==null){
            //用户没有登录, 保存用户当前访问的页面url地址保存一下,登录成功再跳到这个页面
            session.setAttribute("preUrl","project/confirm/order/"+num);
            return "redirect:/login.html";
        }

        String accessToken = userRespVo.getAccessToken();
        //2.根据用户的令牌查询用户的收货地址列表
        AppResponse<List<UserAddressVo>> addressAppResponse = memberServiceFeign.address(accessToken);
        //取出地址列表
        List<UserAddressVo> userAddressVos = addressAppResponse.getData();
        //3.建地址列表传递走
        model.addAttribute("addresses",userAddressVos);
         //从session中取出回报的信息
        ReturnPayConfirmVo confirmVo =(ReturnPayConfirmVo) session.getAttribute("returnConfirm");

        confirmVo.setNum(num);
        //填充回报支持金额
        confirmVo.setTotalPrice(new BigDecimal(num * confirmVo.getSupportmoney() + confirmVo.getFreight()));

        session.setAttribute("returnConfirmSession",confirmVo);
        //4.转发到paystep2页面
        return "project/pay-step-2";


    }

}
