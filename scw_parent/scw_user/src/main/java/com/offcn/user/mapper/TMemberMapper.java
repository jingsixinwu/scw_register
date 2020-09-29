package com.offcn.user.mapper;

import com.offcn.user.pojo.TMember;
import com.offcn.user.pojo.TMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TMemberMapper {
    long countByExample(TMemberExample example);

    int deleteByExample(TMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMember record);

    int insertSelective(TMember record);

    List<TMember> selectByExample(TMemberExample example);

    TMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMember record, @Param("example") TMemberExample example);

    int updateByExample(@Param("record") TMember record, @Param("example") TMemberExample example);

    int updateByPrimaryKeySelective(TMember record);

    int updateByPrimaryKey(TMember record);
}