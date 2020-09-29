package com.offcn.user.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("测试实体")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @ApiModelProperty(value="主键")
    private Integer id;
    @ApiModelProperty(value="姓名")
    private String  name;
    @ApiModelProperty(value="邮箱")
    private String email;


}
