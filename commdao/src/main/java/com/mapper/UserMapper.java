package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	@Select("select * from user where username=#{username}")
	User findUser(@Param("username") String userName);
}
