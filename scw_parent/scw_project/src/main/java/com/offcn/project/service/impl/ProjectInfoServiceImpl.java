package com.offcn.project.service.impl;

import com.offcn.project.mapper.*;
import com.offcn.project.pojo.*;
import com.offcn.project.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {

    @Autowired
    private TReturnMapper returnMapper;
    @Autowired
    private TProjectMapper projectMapper;
    @Autowired
    private TProjectImagesMapper projectImagesMapper;
    @Autowired
    private TTagMapper tagMapper;

    @Autowired
    private TTypeMapper typeMapper;

    /**
     * 根据项目id 获得项目的回报列表
     * @param projectId
     * @return
     */
    @Override
    public List<TReturn> getProjectReturns(Integer projectId) {
        TReturnExample example = new TReturnExample();
        TReturnExample.Criteria criteria = example.createCriteria();
        System.out.println("project--serviceImpl-->projectId:"+projectId);
        criteria.andProjectidEqualTo(projectId);


        return returnMapper.selectByExample(example);
    }

    /**
     * 获取系统中所有项目
     *
     * @return
     */
    @Override
    public List<TProject> getAllProjects() {
        return projectMapper.selectByExample(null);

    }
    /**
     * 获取项目图片
     *
     * @param id
     * @return
     */
    @Override
    public List<TProjectImages> getProjectImages(Integer id) {
        TProjectImagesExample example = new TProjectImagesExample();
        example.createCriteria().andProjectidEqualTo(id);
        return projectImagesMapper.selectByExample(example);
    }

    /**
     * 获取项目信息
     *
     * @param projectId
     * @return
     */
    @Override
    public TProject getProjectInfo(Integer projectId) {
        TProject project = projectMapper.selectByPrimaryKey(projectId);
        return project;
    }

    /**
     * 获得项目标签
     *
     * @return
     */
    @Override
    public List<TTag> getAllProjectTags() {
        return tagMapper.selectByExample(null);
    }

    /**
     * 获取项目分类
     *
     * @return
     */
    @Override
    public List<TType> getProjectTypes() {
        return typeMapper.selectByExample(null);
    }

    /**
     * 获取回报信息
     *
     * @param returnId
     * @return
     */
    @Override
    public TReturn getReturnInfo(Integer returnId) {
        return returnMapper.selectByPrimaryKey(returnId);
    }

}
