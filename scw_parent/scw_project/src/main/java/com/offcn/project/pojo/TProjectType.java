package com.offcn.project.pojo;

import java.io.Serializable;

public class TProjectType implements Serializable {
    public TProjectType(Integer id, Integer projectid, Integer typeid) {
        this.id = id;
        this.projectid = projectid;
        this.typeid = typeid;
    }

    private Integer id;

    private Integer projectid;

    private Integer typeid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}