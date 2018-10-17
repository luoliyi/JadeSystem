package com.jadesystem.dao;

import com.jadesystem.entities.Brand;
import com.jadesystem.entities.BrandExample;
import com.jadesystem.mapper.BrandMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BrandDAOTest {

    BrandMapper brandDAO=null;

    @Before
    public void setUp() throws Exception {
        brandDAO=new BrandDAO();

    }

    @Test
    public void selectByExample() {
        List<Brand> brandList=brandDAO.selectByExample(new BrandExample());
        System.out.println(brandList);
    }
}