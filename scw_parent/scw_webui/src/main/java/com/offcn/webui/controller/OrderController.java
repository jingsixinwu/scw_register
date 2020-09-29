package com.offcn.webui.controller;

import com.offcn.response.AppResponse;
import com.offcn.webui.service.MemberServiceFeign;
import com.offcn.webui.service.OrderServiceFeign;
import com.offcn.webui.service.ProjectServiceFeign;
import com.offcn.webui.vo.resp.*;
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
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceFeign orderServiceFeign;

    //保存订单
    //@ResponseBody
    @RequestMapping("/save")
    public String OrderPay(OrderFormInfoSubmitVo vo, HttpSession session){
        //1. 查询用户是否已登录
        UserRespVo userRespVo= (UserRespVo)session.getAttribute("sessionMember");
        // 判断是否为空
        if(userRespVo==null){

            return "redirect:/login.html";
        }
        //获取登录用户的令牌
        String accessToken = userRespVo.getAccessToken();
        vo.setAccessToken(accessToken);
       //从session中获取回报列表的数据
        ReturnPayConfirmVo confirmVo =(ReturnPayConfirmVo) session.getAttribute("returnConfirmSession");
        if(confirmVo==null){

            return "redirect:/login.html";
        }
        vo.setProjectid(confirmVo.getProjectId());
        vo.setReturnid(confirmVo.getId());
        vo.setRtncount(confirmVo.getNum());
        
        //创建订单
        AppResponse<TOrder> order = orderServiceFeign.createOrder(vo);
        //取出订单信息
        TOrder data = order.getData();

        //下单成功，打印相关信息待处理
        String orderName = confirmVo.getProjectName();
        System.out.println("orderNum:"+data.getOrdernum());
        System.out.println("money:"+data.getMoney());
        System.out.println("orderName:"+orderName);
        System.out.println("Remark:"+vo.getRemark());

        return "/member/minecrowdfunding";

    }



}
