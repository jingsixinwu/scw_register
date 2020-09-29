package com.offcn.webui.service;

import com.offcn.response.AppResponse;
import com.offcn.webui.config.FeignConfig;
import com.offcn.webui.service.impl.ProjectServiceFeignException;
import com.offcn.webui.vo.resp.ProjectDetailVo;
import com.offcn.webui.vo.resp.ProjectVo;
import com.offcn.webui.vo.resp.ReturnPayConfirmVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value="SCW-PROJECT",configuration = FeignConfig.class,fallback = ProjectServiceFeignException.class)
public interface ProjectServiceFeign {

    @GetMapping("/project/all")
    public AppResponse<List<ProjectVo>> all();

    @GetMapping("/project/details/info/{projectId}")
    public AppResponse<ProjectDetailVo> detailsInfo(@PathVariable("projectId") Integer projectId);

    @GetMapping("/project/returns/info/{returnId}")
    public AppResponse<ReturnPayConfirmVo> getTReturn(@PathVariable("returnId") Integer returnId);
}
