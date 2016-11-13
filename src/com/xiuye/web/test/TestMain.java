package com.xiuye.web.test;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.mock.web.MockBodyContent;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;
import org.testng.annotations.Test;

import com.xiuye.web.bean.Apple;
import com.xiuye.web.controller.HelloController;
import com.xiuye.web.dao.AppleDao;

public class TestMain {

	@Test
	public void testHelloController(){
		HelloController hc = new HelloController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(hc).build();
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("hello"));
			mockMvc.perform(MockMvcRequestBuilders.get("/hello.do")).andExpect(MockMvcResultMatchers.view().name("hello"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testHelloController2(){

		HelloController hc = new HelloController();

		MockMvc mvcMock = MockMvcBuilders.standaloneSetup(hc).setSingleView(new InternalResourceView("/WEB-INF/views/view.html")).build();
		try {
			mvcMock.perform(MockMvcRequestBuilders.get("/view.do")).andExpect(MockMvcResultMatchers.view().name("view"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test
	public void testAppleDao(){

		AppleDao appleDao =  Mockito.mock(AppleDao.class);
		List<Apple> list = new ArrayList<Apple>();
		Apple a = new Apple();
		a.setKind("white");
		a.setType("fruit");
		a.setWeight(0.8);
		list.add(a);
		Apple c = new Apple();
		c.setKind("red");
		c.setType("fruit");
		c.setWeight(0.9);
		list.add(c);
		Mockito.when(appleDao.findAll()).thenReturn(list);
		List<Apple> l = appleDao.findAll();
		for(Apple apple : l){
			System.out.println(apple);
		}
	}
}
