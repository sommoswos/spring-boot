package com.lili.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lili.service.indexService;
@Service
public class indexServiceImpl implements indexService{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addUser() {
		jdbcTemplate.update("insert into user(username,password) values(?,?)", "思阳","123");
	}

}
