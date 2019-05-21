package com.yrz.service.imp;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yrz.comm.DBTypeEnum;
import com.yrz.comm.DataSourceSwitch;
import com.yrz.mapper.OrderMapper;
import com.yrz.mapper.UserMapper;
import com.yrz.model.User;
import com.yrz.service.db1.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yrz
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	@Resource
	private OrderMapper orderMapper;
	@Override
	public List<User> getUserList() {
		return  selectList(null);
	}
	
	@DataSourceSwitch(value = DBTypeEnum.db2)
	@Override
	public BigDecimal getOrderPriceByUserId(Integer userId) {
		return orderMapper.getPriceByUserId(userId);
	}

 

}
