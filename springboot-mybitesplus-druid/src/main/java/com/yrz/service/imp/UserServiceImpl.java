package com.yrz.service.imp;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yrz.mapper.UserMapper;
import com.yrz.model.User;
import com.yrz.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yrz
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	@Override
	public List<User> getUserList() {
		List<User> userList = selectList(null);
		System.out.println("-----------" + userList.size());
		userList.forEach(User -> {
			System.out.println(User.toString());
		});

		return userList;

	}

}
