package com.offcn.order.service;

import com.offcn.order.pojo.TOrder;
import com.offcn.order.vo.req.OrderInfoSubmitVo;

public interface OrderService {
    /**
     * 保存订单信息
     * @param vo
     * @return
     */
    public TOrder saveOrder(OrderInfoSubmitVo vo);
}
