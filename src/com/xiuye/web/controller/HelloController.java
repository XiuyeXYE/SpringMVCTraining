package com.xiuye.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value={"/","hello.do"},method=RequestMethod.GET)
	public String helloWorld(){
		System.out.println("hello");
		return "hello";
	}
	@RequestMapping("view.do")
	public String view(){
		System.out.println("view");
		return "view";
	}

}
