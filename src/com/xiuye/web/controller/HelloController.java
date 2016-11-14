package com.xiuye.web.controller;

import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
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
	public void processUpload(@RequestPart("uploadTagFileInputName")byte [] fileByte,@Validated String validateObject, Errors errors){

	}
	@RequestMapping("upload2.do")
	public void processUpload(@RequestPart("uploadTagFileInputName")Part filePart,@Validated String validateObject, Errors errors){

	}

	@RequestMapping("/{id}.do")
	public void id(@PathVariable String id){
		System.out.println(id);
	}

//	@ExceptionHandler(Exception.class)
//	public String error(){
//		return "redirect:/505";
//	}

}
