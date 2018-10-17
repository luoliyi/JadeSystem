package com.jadesystem.mapper;

import com.jadesystem.entities.Hangtype;
import com.jadesystem.entities.HangtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HangtypeMapper {
    long countByExample(HangtypeExample example);

    int deleteByExample(HangtypeExample example);

    int deleteByPrimaryKey(Integer htid);

    int insert(Hangtype record);

    int insertSelective(Hangtype record);

    List<Hangtype> selectByExample(HangtypeExample example);

    Hangtype selectByPrimaryKey(Integer htid);

    int updateByExampleSelective(@Param("record") Hangtype record, @Param("example") HangtypeExample example);

    int updateByExample(@Param("record") Hangtype record, @Param("example") HangtypeExample example);

    int updateByPrimaryKeySelective(Hangtype record);

    int updateByPrimaryKey(Hangtype record);
}