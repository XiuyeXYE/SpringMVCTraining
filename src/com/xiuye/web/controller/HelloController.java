package com.xiuye.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

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

	@RequestMapping("upload.do")
	public void processUpload(@RequestPart("uploadTagFileInputName")byte [] fileByte,Errors errors){

	}

}
