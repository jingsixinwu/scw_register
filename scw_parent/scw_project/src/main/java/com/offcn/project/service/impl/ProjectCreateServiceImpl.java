package com.offcn.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.offcn.project.contants.ProjectConstant;
import com.offcn.project.enums.ProjectImageTypeEnume;
import com.offcn.project.enums.ProjectStatusEnume;
import com.offcn.project.mapper.*;
import com.offcn.project.pojo.*;
import com.offcn.project.service.ProjectCreateService;
import com.offcn.project.vo.req.ProjectRedisStorageVo;
import net.minidev.json.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProjectCreateServiceImpl implements ProjectCreateService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private TProjectMapper projectMapper;
    @Autowired
    private TProjectImagesMapper imagesMapper;
    @Autowired
    private TProjectTypeMapper typeMapper;
    @Autowired
    private TProjectTagMapper tagMapper;
    @Autowired
    private TReturnMapper returnMapper;
    @Override
    public String initCreateProject(Integer memberId) {
        String token = UUID.randomUUID().toString().replace("-", "");
        //项目的临时对象
        ProjectRedisStorageVo initVo = new ProjectRedisStorageVo();
        initVo.setMemberid(memberId);
        //initVo装换json字符串
        String jsonString = JSON.toJSONString(initVo);

        //存储到缓存中
        redisTemplate.opsForValue().set(ProjectConstant.TEMP_PROJECT_PREFIX+token,jsonString);

        return token;
    }


    @Override
    public void saveProjectInfo(ProjectStatusEnume statusEnume, ProjectRedisStorageVo vo) {
         //保存项目数据
        //1)、保存项目的基本信息，获取到数据库的id
        //页面考过来的：name,remark,money,day,memberid
        //我们自己后来操作：status,deploydate,createdate
        //自动化修改：supportmoney（已支持的金额），supporter（支持人数） ,completion（完成度）,follower（关注者人数）
        TProject projectBase = new TProject();
        //传递数据 拷贝属性值到对象projectBase
        BeanUtils.copyProperties(vo,projectBase);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        projectBase.setCreatedate(df.format(new Date()));//添加项目创建日期
        //1.1)、基本的信息插入，获取到刚才保存好的项目的自增id
        projectMapper.insertSelective(projectBase);
        //2保存图片信息
        //2.1 获取刚刚生成的id
        Integer projectId = projectBase.getId();
        String headerImage = vo.getHeaderImage();
        TProjectImages images = new TProjectImages(null, projectId, headerImage, ProjectImageTypeEnume.HEADER.getCode());
        //2、将项目上传的图片保存起来
        //2.1）、保存头图
        imagesMapper.insertSelective(images);

        //保存 项目详细图片
        List<String> detailsImage = vo.getDetailsImage();
        //遍历
        for (String string : detailsImage) {
            TProjectImages img = new TProjectImages(null, projectId, string, ProjectImageTypeEnume.DETAILS.getCode());
            imagesMapper.insertSelective(img);
        }

        //3保存项目的标签
        List<Integer> tagids = vo.getTagids();
        for (Integer tagid : tagids) {
            TProjectTag tProjectTag = new TProjectTag(null, projectId, tagid);
            tagMapper.insertSelective(tProjectTag);

        }

        //4、保存项目的分类信息
        List<Integer> typeids = vo.getTypeids();
        for (Integer tid:typeids) {
            TProjectType tProjectType = new TProjectType(null,projectId,tid);
            typeMapper.insertSelective(tProjectType);
        }

        //5.保存回报信息

        List<TReturn> returns = vo.getProjectReturns();
        //设置项目的id
        for(TReturn tReturn:returns){
            tReturn.setProjectid(projectId);
            returnMapper.insertSelective(tReturn);
        }

        //6.删除缓存的临时信息
        redisTemplate.delete(ProjectConstant.TEMP_PROJECT_PREFIX+vo.getProjectToken());

    }
}
