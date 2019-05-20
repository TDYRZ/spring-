package com.yrz.service;

import com.baomidou.mybatisplus.service.IService;
import com.yrz.model.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yrz
 */
public interface UserService extends IService<User> {
    List<User> getUserList();
}
