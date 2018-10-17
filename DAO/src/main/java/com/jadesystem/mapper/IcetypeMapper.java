package com.jadesystem.mapper;

import com.jadesystem.entities.Icetype;
import com.jadesystem.entities.IcetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcetypeMapper {
    long countByExample(IcetypeExample example);

    int deleteByExample(IcetypeExample example);

    int deleteByPrimaryKey(Integer itid);

    int insert(Icetype record);

    int insertSelective(Icetype record);

    List<Icetype> selectByExample(IcetypeExample example);

    Icetype selectByPrimaryKey(Integer itid);

    int updateByExampleSelective(@Param("record") Icetype record, @Param("example") IcetypeExample example);

    int updateByExample(@Param("record") Icetype record, @Param("example") IcetypeExample example);

    int updateByPrimaryKeySelective(Icetype record);

    int updateByPrimaryKey(Icetype record);
}