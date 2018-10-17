package com.jadesystem.dao;

import com.jadesystem.entities.Color;
import com.jadesystem.entities.ColorExample;
import com.jadesystem.mapper.ColorMapper;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ColorDAOTest {

    ColorMapper colordao=null;

    @Before
    public void setUp() throws Exception {
        colordao=new ColorDAO();
    }

    @Test
    public void selectByExample() {
        List<Color> colorList=colordao.selectByExample(new ColorExample());
        System.out.println(colorList);
    }
}