package com.offcn.webui.vo.resp;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class TOrder implements Serializable {
    private Integer id;

    private Integer memberid;

    private Integer projectid;

    private Integer returnid;

    private String ordernum;

    private String createdate;

    private Integer money;

    private Integer rtncount;

    private String status;

    private String address;

    private String invoice;

    private String invoictitle;

    private String remark;
}
