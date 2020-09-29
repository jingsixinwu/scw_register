package com.offcn.project.mapper;

import com.offcn.project.pojo.TProjectType;
import com.offcn.project.pojo.TProjectTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TProjectTypeMapper {
    long countByExample(TProjectTypeExample example);

    int deleteByExample(TProjectTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TProjectType record);

    int insertSelective(TProjectType record);

    List<TProjectType> selectByExample(TProjectTypeExample example);

    TProjectType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TProjectType record, @Param("example") TProjectTypeExample example);

    int updateByExample(@Param("record") TProjectType record, @Param("example") TProjectTypeExample example);

    int updateByPrimaryKeySelective(TProjectType record);

    int updateByPrimaryKey(TProjectType record);
}