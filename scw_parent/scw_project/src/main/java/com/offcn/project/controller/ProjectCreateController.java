package com.offcn.project.controller;

import com.alibaba.fastjson.JSON;
import com.offcn.project.contants.ProjectConstant;
import com.offcn.project.enums.ProjectStatusEnume;
import com.offcn.project.pojo.TReturn;
import com.offcn.project.service.ProjectCreateService;
import com.offcn.project.vo.req.ProjectBaseInfoVo;
import com.offcn.project.vo.req.ProjectRedisStorageVo;
import com.offcn.project.vo.req.ProjectReturnVo;
import com.offcn.response.AppResponse;
import com.offcn.vo.BaseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "项目基本功能模块（创建、保存、项目信息获取、文件上传等）")
@RestController
@RequestMapping("/project")
@Slf4j
public class ProjectCreateController {
    @Autowired
    private ProjectCreateService projectCreateService;
    @Autowired
    private StringRedisTemplate redisTemplate;


    @ApiOperation("项目发起第1步-阅读同意协议")
    @GetMapping("/init")
    public AppResponse<String> init(BaseVo vo){
       String accessToken=vo.getAccessToken();
       //通过登录令牌取出登录用户的id
        String memberId = redisTemplate.opsForValue().get(accessToken);
        if(StringUtils.isEmpty(memberId)){

          return AppResponse.fail("无此权限，请你登录");

        }

        //将String转换成Integer
        int id = Integer.parseInt(memberId);
        //创建临时的项目
        String projectToken = projectCreateService.initCreateProject(id);

         return AppResponse.ok(projectToken);
    }


    @ApiOperation("项目发起第2步-保存项目的基本信息")
    @PostMapping("/savebaseInfo")
    public AppResponse<String> savebaseInfo(ProjectBaseInfoVo vo){
       //1.取出redis中之前存储Json结构的项目信息
        String orignal = redisTemplate.opsForValue().get(ProjectConstant.TEMP_PROJECT_PREFIX + vo.getProjectToken());
        //2.将json结构的项目信息转换成ProjectRedisStorageVo对象
       //{"memberid":8}
        ProjectRedisStorageVo projectRedisStorageVo = JSON.parseObject(orignal, ProjectRedisStorageVo.class);
       //3.将页面接收的参数专递到projectRedisStorageVo中
        BeanUtils.copyProperties(vo,projectRedisStorageVo);
        //4. 再次将包含有项目基本信息的对象装换json字符串

        String jsonString = JSON.toJSONString(projectRedisStorageVo);

        //5.将包含项目基本信息的json字符串存入到缓存中
        redisTemplate.opsForValue().set(ProjectConstant.TEMP_PROJECT_PREFIX+vo.getProjectToken(),jsonString);

       return AppResponse.ok("OK");

    }

    @ApiOperation("项目发起第3步-保存项目的回报信息")
    @PostMapping("/saveReturnInfo")
    public AppResponse<String> saveReturnInfo(@RequestBody List<ProjectReturnVo> pro){
        ProjectReturnVo returnVo = pro.get(0);
        //取出项目的令牌
        String projectToken = returnVo.getProjectToken();
        //根据项目的令牌从缓存中取出项目信息
        String projectContext = redisTemplate.opsForValue().get(ProjectConstant.TEMP_PROJECT_PREFIX + projectToken);
        //将json转换回ProjectRedisStorageVo
        ProjectRedisStorageVo projectRedisStorageVo = JSON.parseObject(projectContext, ProjectRedisStorageVo.class);
         //将页面收集的回报输出 重新存储到 对象 再次缓存到redis
        List<TReturn> list=new ArrayList<TReturn>();

        for (ProjectReturnVo vo : pro) {
            TReturn tReturn = new TReturn();
            BeanUtils.copyProperties(vo,tReturn);
            list.add(tReturn);
        }
        //更新集合信息
        projectRedisStorageVo.setProjectReturns(list);

        //重新放入缓存中

        String jsonString = JSON.toJSONString(projectRedisStorageVo);

        redisTemplate.opsForValue().set(ProjectConstant.TEMP_PROJECT_PREFIX+projectToken,jsonString);
        return AppResponse.ok("OK");

    }

    @ApiOperation("项目发起第4步-保存项目保存回报信息")
    @ApiImplicitParams(
            {
               @ApiImplicitParam(name="accessToken" ,value = "用户的令牌",required = true),
               @ApiImplicitParam(name="projectToken" ,value = "项目的令牌",required = true),
                @ApiImplicitParam(name="ops" ,value = "用户操作类型 0-保存草稿 1-提交审核",required = true)

            }
    )
    @PostMapping("/submit")
    public AppResponse<String> submit(String accessToken,String projectToken,String ops){
        //1.前置校验 检查 accessToken 有没有对应的用户信息
        String memberId = redisTemplate.opsForValue().get(accessToken);
        if(StringUtils.isEmpty(memberId)){

            return AppResponse.fail("无权限,请先登录");
        }
        //2. 根据项目projectToken 取出存在缓存中的项目信息
        String projectJsonStr = redisTemplate.opsForValue().get(ProjectConstant.TEMP_PROJECT_PREFIX + projectToken);
        //3.将json字符串转换为对象
        ProjectRedisStorageVo storageVo = JSON.parseObject(projectJsonStr, ProjectRedisStorageVo.class);
        //4.判断用户操作类型是否为空
        if(!StringUtils.isEmpty(ops)){//不为空
            //判断类型
            if(ops.equals("1")){//提交审核
             //获取项目状态提交枚举
                ProjectStatusEnume submitAuth = ProjectStatusEnume.SUBMIT_AUTH;
                //保存项目信息
                projectCreateService.saveProjectInfo(submitAuth,storageVo);

                return AppResponse.ok(null);

            }else if(ops.equals("0")){//保存草稿

                 //获取项目状态提交枚举
                ProjectStatusEnume submitAuth = ProjectStatusEnume.DRAFT;
                //保存项目信息
                projectCreateService.saveProjectInfo(submitAuth,storageVo);

                return AppResponse.ok(null);

            }else{// 支持操作

                AppResponse<String> appResponse = AppResponse.fail(null);
                appResponse.setMsg("不支持此操作");
                return appResponse;

            }



        }


        return AppResponse.fail(null);

    }
}
