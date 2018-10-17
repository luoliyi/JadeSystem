package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Icetype;
import com.jadesystem.entities.Inlay;
import com.jadesystem.entities.InlayExample;
import com.jadesystem.mapper.IcetypeMapper;
import com.jadesystem.mapper.InlayMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class InlayDAO implements InlayMapper {
    public long countByExample(InlayExample example) {
        return 0;
    }

    public int deleteByExample(InlayExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer iid) {
        return 0;
    }

    public int insert(Inlay record) {
        return 0;
    }

    public int insertSelective(Inlay record) {
        return 0;
    }

    public List<Inlay> selectByExample(InlayExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        InlayMapper inlayMapper=session.getMapper(InlayMapper.class);
        List<Inlay> inlays=inlayMapper.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return inlays;
    }

    public Inlay selectByPrimaryKey(Integer iid) {
        return null;
    }

    public int updateByExampleSelective(Inlay record, InlayExample example) {
        return 0;
    }

    public int updateByExample(Inlay record, InlayExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Inlay record) {
        return 0;
    }

    public int updateByPrimaryKey(Inlay record) {
        return 0;
    }
}
