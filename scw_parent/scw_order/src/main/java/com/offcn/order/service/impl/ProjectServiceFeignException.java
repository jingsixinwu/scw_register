package com.offcn.order.service.impl;

import com.offcn.order.service.ProjectServiceFeign;
import com.offcn.order.vo.req.TReturn;
import com.offcn.response.AppResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ProjectServiceFeignException implements ProjectServiceFeign {
    @Override
    public AppResponse<List<TReturn>> detailsReturn(Integer projectId) {
        System.out.println("FeginException-->detailsReturn:projectId"+projectId);
        AppResponse<List<TReturn>> fail = AppResponse.fail(null);
        fail.setMsg("调用远程服务器失败【订单】");
        return fail;

    }
}
