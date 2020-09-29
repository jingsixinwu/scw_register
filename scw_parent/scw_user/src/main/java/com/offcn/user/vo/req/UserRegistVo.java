package com.offcn.user.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 *  用户注册提交的数据VO
 *
 */

@ApiModel("用户提交请求数据的包装类")
@Data
public class UserRegistVo {
    @ApiModelProperty("手机号")
    private String loginacct;
    @ApiModelProperty("密码")
    private String userpswd;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("验证码")
    private String code;
}
