package com.yrz;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yrz.mapper.UserMapper;
import com.yrz.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatiesApplicationTests {

	@Resource
	private UserMapper userMapper;
	@Test
	public void contextLoads() {
	}

	@Test
	public void getAllUsers() {
		List<User> userList=userMapper.getAllUser();
		userList.stream().forEach(User -> System.out.println("姓名:"+User.getUserName()+"性别:"+User.getUserSex()));
	}
}
