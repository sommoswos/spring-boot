package com.lili.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lili.entity.User;
import com.lili.mapper.userMapper;
import com.lili.service.indexService;

@RestController
public class IndexController {
	
	@Autowired
	private indexService indexService;
	@Autowired
	private userMapper userMapper;
	
	@ResponseBody
	@RequestMapping("/index")
	public User index(ModelMap model,ModelAndView moAndView,String userName){
		userName="思阳";
		return userMapper.findUser(userName);
//		indexService.addUser();
//		moAndView.addObject("name", "萝莉");
//		moAndView.addObject("sex", "1");
//		List<String> list=new ArrayList<String>();
//		list.add("java");
//		list.add("jack");
//		list.add("php");
//		moAndView.addObject("listUser", list);
//		moAndView.setViewName("index");
	}
}
