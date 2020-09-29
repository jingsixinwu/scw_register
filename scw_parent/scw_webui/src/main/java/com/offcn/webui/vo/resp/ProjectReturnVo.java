package com.offcn.webui.vo.resp;

import com.offcn.vo.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProjectReturnVo implements Serializable {
    //项目token
    private String projectToken;

    private Integer id;

    private Integer projectId;

    private Byte type;

    private Integer supportmoney;

    private String content;

    private Integer signalpurchase;

    private Integer purchase;

    private Integer freight;

    private Byte invoice;

    private Integer rtndate;
}
