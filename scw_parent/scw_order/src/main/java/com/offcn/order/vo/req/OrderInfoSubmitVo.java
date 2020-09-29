package com.offcn.order.vo.req;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderInfoSubmitVo {
    /**
     *  `id` int(11) NOT NULL AUTO_INCREMENT,
     *   `memberid` int(11) DEFAULT NULL COMMENT '会员ID',
     *   `projectid` int(11) DEFAULT NULL COMMENT '项目ID',
     *   `returnid` int(11) DEFAULT NULL COMMENT '回报ID',
     *   `ordernum` varchar(255) DEFAULT NULL COMMENT '订单编号',
     *   `createdate` char(19) DEFAULT NULL COMMENT '创建时间',
     *   `money` int(11) DEFAULT NULL COMMENT '支持金额',
     *   `rtncount` int(11) DEFAULT NULL COMMENT '回报数量',
     *   `status` char(1) DEFAULT NULL COMMENT '0 - 待付款， 1 - 交易完成， 9 - 交易关闭',
     *   `address` varchar(255) DEFAULT NULL COMMENT '收货地址',
     *   `invoice` char(1) DEFAULT NULL COMMENT '0 - 不开发票， 1 - 开发票',
     *   `invoictitle` varchar(255) DEFAULT NULL COMMENT '发票抬头',
     *   `remark` varchar(255) DEFAULT NULL COMMENT '备注'
     *
     *
     *   id` int(11) NOT NULL,
     *   `ordersn` varchar(255) DEFAULT NULL,
     *   `paysn` varchar(255) DEFAULT NULL,
     *   `memberid` int(11) DEFAULT NULL,
     *   `amount` float DEFAULT NULL,
     *   `paystate` tinyint(4) DEFAULT NULL,
     *   `source` varchar(255) DEFAULT NULL,
     *   `status` tinyint(4) DEFAULT NULL,
     *   `completiontime` varchar(19) DEFAULT NULL,
     *   `note` varchar(255) DEFAULT NULL,
     *   `createat` varchar(19) DEFAULT NULL,
     *   `updateat` varchar(19) DEFAULT NULL
     */


    private String accessToken;
    private Integer projectid;//项目ID
    private Integer returnid;//回报ID
    private Integer rtncount;//回报数量
    private String address;//收货地址
    private Byte invoice;//是否开发票 0 - 不开发票， 1 - 开发票
    private String invoictitle;//发票名头
    private String remark;//备注


}
