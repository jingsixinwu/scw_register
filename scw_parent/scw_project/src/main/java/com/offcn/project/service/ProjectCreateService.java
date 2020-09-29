package com.offcn.project.service;

import com.offcn.project.enums.ProjectStatusEnume;
import com.offcn.project.vo.req.ProjectRedisStorageVo;

public interface ProjectCreateService {
    /**
     * 初始化一个项目
     */
    public String initCreateProject(Integer memberId);

    /**
     *  保存项目
     * @param statusEnume 状态信息
     * @param vo   项目信息
     */
    public void saveProjectInfo(ProjectStatusEnume statusEnume, ProjectRedisStorageVo vo);
}
