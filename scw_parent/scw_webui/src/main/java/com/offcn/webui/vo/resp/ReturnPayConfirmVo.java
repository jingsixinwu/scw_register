package com.offcn.webui.vo.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ReturnPayConfirmVo implements Serializable {

    /**
     * 项目信息
     */
    private Integer projectId;   //项目ID
    private String projectName;  //项目名称
    private String projectRemark; //项目描述

    /**
     * 发起人信息
     */
    private Integer memberId;  //会员ID
    private String memberName;  //会员名称
    /**
     * 回报的信息
     */
    private Integer id; //回报ID
    private String content;
    // 支持数量，默认数量1，不能大于signalpurchase单笔限购数量
    private Integer num;
    // 支持单价
    private Integer supportmoney;
    //运费
    private Integer freight;
    //总限购数量
    private Integer purchase;
    // 单笔限购数量
    private Integer signalpurchase;
    // 所有的double和float的运算在任何情况下都会导致丢失精度，使用BigDecimal进行计算
    // 总价 totalPrice =price* num+ freight
    private BigDecimal totalPrice;
}