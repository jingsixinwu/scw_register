package com.offcn.order.service.impl;

import com.netflix.discovery.converters.Auto;
import com.offcn.enums.OrderStatusEnumes;
import com.offcn.order.mapper.TOrderMapper;
import com.offcn.order.pojo.TOrder;
import com.offcn.order.service.OrderService;
import com.offcn.order.service.ProjectServiceFeign;
import com.offcn.order.vo.req.OrderInfoSubmitVo;
import com.offcn.order.vo.req.TReturn;
import com.offcn.response.AppResponse;
import com.offcn.util.AppDateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private TOrderMapper orderMapper;
    @Autowired
    private ProjectServiceFeign projectServiceFeign;

    /**
     * 保存订单
     * @param vo
     * @return
     */
    @Override
    public TOrder saveOrder(OrderInfoSubmitVo vo) {
        TOrder order = new TOrder();
        //获得用户访问令牌，通过令牌取出 用户id
        String accessToken = vo.getAccessToken();

        String memberId = redisTemplate.opsForValue().get(accessToken);
        //将用户id传入订单中
        order.setMemberid(Integer.parseInt(memberId));
       //项目ID
        order.setProjectid(vo.getProjectid());
        //回报项目ID 可以有多个 默认的那个
        order.setReturnid(vo.getReturnid());
        //生成订单编号
        String orderNum = UUID.randomUUID().toString().replace("-","");
        order.setOrdernum(orderNum);
        //订单创建时间
        order.setCreatedate(AppDateUtils.getFormatTime());

        //查询回报列表
        AppResponse<List<TReturn>> returnAppResponse = projectServiceFeign.detailsReturn(vo.getProjectid());
        System.out.println("vo.getProjectid():"+vo.getProjectid());
        //获得回报列表数据
        List<TReturn> returnList = returnAppResponse.getData();

        System.out.println("returnList:"+returnList);
        //取出一个回报数据，暂时处理为只取出一个
        TReturn tReturn = returnList.get(0);
        //计算回报金额   支持数量*支持金额+运费
        Integer totalMoney = vo.getRtncount() * tReturn.getSupportmoney() + tReturn.getFreight();
        order.setMoney(totalMoney);
        //回报数量
        order.setRtncount(vo.getRtncount());
        //支付状态  未支付
        order.setStatus(OrderStatusEnumes.UNPAY.getCode()+"");
        //收货地址
        order.setAddress(vo.getAddress());
        //是否开发票
        order.setInvoice(vo.getInvoice().toString());
        //发票名头
        order.setInvoictitle(vo.getInvoictitle());
        //备注
        order.setRemark(vo.getRemark());
        orderMapper.insertSelective(order);
        return order;

    }
}
