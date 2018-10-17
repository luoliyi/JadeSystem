package com.jadesystem.dao;

import com.jadesystem.entities.Products;
import com.jadesystem.entities.ProductsExample;
import com.jadesystem.mapper.ProductsMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductsDAOTest {

    ProductsMapper productsdao=null;
    @Before
    public void setUp() throws Exception {
        productsdao=new ProductsDAO();
    }

    @Test
    public void selectByExample() {
       List<Products>productsList=productsdao.selectByExample(new ProductsExample());
        System.out.println(productsList);
    }
    @Test
    public void selectByExample2() {
        ProductsExample productsExample=new ProductsExample();
        productsExample.createCriteria().andPcidEqualTo(3);
        List<Products>productsList=productsdao.selectByExample(productsExample);
        System.out.println(productsList);
    }
}