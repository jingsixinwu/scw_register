package com.offcn.webui.service.impl;

import com.offcn.response.AppResponse;
import com.offcn.webui.service.ProjectServiceFeign;
import com.offcn.webui.vo.resp.ProjectDetailVo;
import com.offcn.webui.vo.resp.ProjectVo;
import com.offcn.webui.vo.resp.ReturnPayConfirmVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
@Slf4j
@Component
public class ProjectServiceFeignException implements ProjectServiceFeign {
    @Override
    public AppResponse<List<ProjectVo>> all() {
        AppResponse<List<ProjectVo>> appResponse=new AppResponse<List<ProjectVo>>();
        appResponse.setMsg("远程调用失败【查询首页热点项目】");
        return appResponse;
    }

    @Override
    public AppResponse<ProjectDetailVo> detailsInfo(Integer projectId) {
        AppResponse<ProjectDetailVo> appResponse=new AppResponse<ProjectDetailVo>();
        appResponse.setMsg("远程调用失败【查询项目详情】");
        return appResponse;
    }

    @Override
    public AppResponse<ReturnPayConfirmVo> getTReturn(Integer returnId) {
        AppResponse<ReturnPayConfirmVo> appResponse=new AppResponse<ReturnPayConfirmVo>();
        appResponse.setMsg("远程调用失败【查询回报信息】");
        return appResponse;
    }
}
