package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface userMapper {
	@Select("select * from user where username=#{username}")
	User findUser(@Param("username") String userName);
}
