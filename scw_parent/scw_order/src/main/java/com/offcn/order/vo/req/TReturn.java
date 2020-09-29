package com.offcn.order.vo.req;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class TReturn implements Serializable {
    private Integer id;

    private Integer projectid;//项目ID

    private Byte type;//回报类型 0 - 实物回报， 1 虚拟物品回报

    private Integer supportmoney;////支持金额

    private String content;//回报内容

    private Integer count;//回报数量  0 为不限回报数量

    private Integer signalpurchase;//单笔限购

    private Integer purchase;//限购数量

    private Integer freight;//运费

    private String invoice;//是否开发票  0 - 不开发票， 1 - 开发票

    private Integer rtndate;//回报时间,众筹成功后多少天进行回报


}