package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Brand;
import com.jadesystem.entities.BrandExample;
import com.jadesystem.mapper.BrandMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BrandDAO implements BrandMapper {

    public long countByExample(BrandExample example) {
        return 0;
    }

    public int deleteByExample(BrandExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer bid) {
        return 0;
    }

    public int insert(Brand record) {
        return 0;
    }

    public int insertSelective(Brand record) {
        return 0;
    }

    public List<Brand> selectByExample(BrandExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        BrandMapper brandMapper=session.getMapper(BrandMapper.class);
        List<Brand> brandList=brandMapper.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return brandList;
    }

    public Brand selectByPrimaryKey(Integer bid) {
        return null;
    }

    public int updateByExampleSelective(Brand record, BrandExample example) {
        return 0;
    }

    public int updateByExample(Brand record, BrandExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Brand record) {
        return 0;
    }

    public int updateByPrimaryKey(Brand record) {
        return 0;
    }
}
