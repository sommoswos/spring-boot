package com.lili.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lili.entity.User;

public interface userMapper {
	@Select("select * from user where username=#{username}")
	User findUser(@Param("username")String userName);
}
