package com.jadesystem.mapper;

import com.jadesystem.entities.Inlay;
import com.jadesystem.entities.InlayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InlayMapper {
    long countByExample(InlayExample example);

    int deleteByExample(InlayExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(Inlay record);

    int insertSelective(Inlay record);

    List<Inlay> selectByExample(InlayExample example);

    Inlay selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") Inlay record, @Param("example") InlayExample example);

    int updateByExample(@Param("record") Inlay record, @Param("example") InlayExample example);

    int updateByPrimaryKeySelective(Inlay record);

    int updateByPrimaryKey(Inlay record);
}