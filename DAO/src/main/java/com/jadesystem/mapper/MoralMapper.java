package com.jadesystem.mapper;

import com.jadesystem.entities.Moral;
import com.jadesystem.entities.MoralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoralMapper {
    long countByExample(MoralExample example);

    int deleteByExample(MoralExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Moral record);

    int insertSelective(Moral record);

    List<Moral> selectByExample(MoralExample example);

    Moral selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Moral record, @Param("example") MoralExample example);

    int updateByExample(@Param("record") Moral record, @Param("example") MoralExample example);

    int updateByPrimaryKeySelective(Moral record);

    int updateByPrimaryKey(Moral record);
}