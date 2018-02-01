package com.lili.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExcetionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> excetionHandler(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "500");
		map.put("msg", "系统内部出错");
		return map;
	}

}
