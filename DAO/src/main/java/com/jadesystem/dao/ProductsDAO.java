package com.jadesystem.dao;

import MyUtils.MyBatisUtil;
import com.jadesystem.entities.Products;
import com.jadesystem.entities.ProductsExample;
import com.jadesystem.mapper.ProductsMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProductsDAO implements ProductsMapper {
    public long countByExample(ProductsExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        ProductsMapper productsMapper=session.getMapper(ProductsMapper.class);

       long sum=productsMapper.countByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return sum;
    }

    public int deleteByExample(ProductsExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    public int insert(Products record) {
        return 0;
    }

    public int insertSelective(Products record) {
        return 0;
    }

    public List<Products> selectByExample(ProductsExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        ProductsMapper productsMapper=session.getMapper(ProductsMapper.class);
        List<Products>productsList=productsMapper.selectByExample(example);
        //关闭连接对象，否则Waiting as long as 20000 milliseconds for connection.
        session.close();
        return productsList;
    }

    public Products selectByPrimaryKey(Integer pid) {
        return null;
    }

    public int updateByExampleSelective(Products record, ProductsExample example) {
        return 0;
    }

    public int updateByExample(Products record, ProductsExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Products record) {
        return 0;
    }

    public int updateByPrimaryKey(Products record) {
        return 0;
    }
}
