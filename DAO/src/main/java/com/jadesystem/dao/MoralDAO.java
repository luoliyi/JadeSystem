package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Inlay;
import com.jadesystem.entities.Moral;
import com.jadesystem.entities.MoralExample;
import com.jadesystem.mapper.InlayMapper;
import com.jadesystem.mapper.MoralMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MoralDAO implements MoralMapper {
    public long countByExample(MoralExample example) {
        return 0;
    }

    public int deleteByExample(MoralExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer mid) {
        return 0;
    }

    public int insert(Moral record) {
        return 0;
    }

    public int insertSelective(Moral record) {
        return 0;
    }

    public List<Moral> selectByExample(MoralExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        MoralMapper moralMapper=session.getMapper(MoralMapper.class);
        List<Moral> moralList=moralMapper.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return moralList;
    }

    public Moral selectByPrimaryKey(Integer mid) {
        return null;
    }

    public int updateByExampleSelective(Moral record, MoralExample example) {
        return 0;
    }

    public int updateByExample(Moral record, MoralExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Moral record) {
        return 0;
    }

    public int updateByPrimaryKey(Moral record) {
        return 0;
    }
}
