package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Color;
import com.jadesystem.entities.ColorExample;
import com.jadesystem.mapper.ColorMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ColorDAO implements ColorMapper {
    public long countByExample(ColorExample example) {
        return 0;
    }

    public int deleteByExample(ColorExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer cid) {
        return 0;
    }

    public int insert(Color record) {
        return 0;
    }

    public int insertSelective(Color record) {
        return 0;
    }

    public List<Color> selectByExample(ColorExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        ColorMapper colorMapper=session.getMapper(ColorMapper.class);
        List<Color> colorList=colorMapper.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return colorList;
    }

    public Color selectByPrimaryKey(Integer cid) {
        return null;
    }

    public int updateByExampleSelective(Color record, ColorExample example) {
        return 0;
    }

    public int updateByExample(Color record, ColorExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Color record) {
        return 0;
    }

    public int updateByPrimaryKey(Color record) {
        return 0;
    }
}
