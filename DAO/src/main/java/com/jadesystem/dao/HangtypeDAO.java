package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Color;
import com.jadesystem.entities.Hangtype;
import com.jadesystem.entities.HangtypeExample;
import com.jadesystem.mapper.ColorMapper;
import com.jadesystem.mapper.HangtypeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HangtypeDAO implements HangtypeMapper {
    public long countByExample(HangtypeExample example) {
        return 0;
    }

    public int deleteByExample(HangtypeExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer htid) {
        return 0;
    }

    public int insert(Hangtype record) {
        return 0;
    }

    public int insertSelective(Hangtype record) {
        return 0;
    }

    public List<Hangtype> selectByExample(HangtypeExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        HangtypeMapper hangtypeMapper=session.getMapper(HangtypeMapper.class);
        List<Hangtype> hangtypeList=hangtypeMapper.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return hangtypeList;
    }

    public Hangtype selectByPrimaryKey(Integer htid) {
        return null;
    }

    public int updateByExampleSelective(Hangtype record, HangtypeExample example) {
        return 0;
    }

    public int updateByExample(Hangtype record, HangtypeExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Hangtype record) {
        return 0;
    }

    public int updateByPrimaryKey(Hangtype record) {
        return 0;
    }
}
