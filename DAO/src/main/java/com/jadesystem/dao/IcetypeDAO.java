package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Hangtype;
import com.jadesystem.entities.Icetype;
import com.jadesystem.entities.IcetypeExample;
import com.jadesystem.mapper.HangtypeMapper;
import com.jadesystem.mapper.IcetypeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IcetypeDAO implements IcetypeMapper {
    public long countByExample(IcetypeExample example) {
        return 0;
    }

    public int deleteByExample(IcetypeExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer itid) {
        return 0;
    }

    public int insert(Icetype record) {
        return 0;
    }

    public int insertSelective(Icetype record) {
        return 0;
    }

    public List<Icetype> selectByExample(IcetypeExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        IcetypeMapper icetypeExample=session.getMapper(IcetypeMapper.class);
        List<Icetype> icetypes=icetypeExample.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return icetypes;
    }

    public Icetype selectByPrimaryKey(Integer itid) {
        return null;
    }

    public int updateByExampleSelective(Icetype record, IcetypeExample example) {
        return 0;
    }

    public int updateByExample(Icetype record, IcetypeExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Icetype record) {
        return 0;
    }

    public int updateByPrimaryKey(Icetype record) {
        return 0;
    }
}
