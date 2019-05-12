package com.yrz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yrz.model.User;
@Mapper
public interface UserMapper {
	
	List<User> getAllUser();

	
	User getOne(Long id);


	void insert(User user);

	void update(User user);

	void delete(Long id);
}
