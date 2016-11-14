package com.xiuye.web.exception.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WebExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String error(){
		return "redirect:/505";
	}

}
