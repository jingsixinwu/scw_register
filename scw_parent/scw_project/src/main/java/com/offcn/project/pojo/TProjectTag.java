package com.offcn.project.pojo;

import java.io.Serializable;

public class TProjectTag implements Serializable {
    public TProjectTag(Integer id, Integer projectid, Integer tagid) {
        this.id = id;
        this.projectid = projectid;
        this.tagid = tagid;
    }

    private Integer id;

    private Integer projectid;

    private Integer tagid;

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

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }
}