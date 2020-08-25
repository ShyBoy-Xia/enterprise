package com.hwadee.spring01.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.hwadee.spring01.entity.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-context.xml"})
public class StudentControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void initMokcMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void testGetStudents() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/student"))
                .andReturn();

        MockHttpServletRequest request = result.getRequest();
        PageInfo<Student> students = (PageInfo<Student>) request.getAttribute("spi");

        students.getList().forEach(System.out::println);

        Assert.assertNotNull( students );
    }


}