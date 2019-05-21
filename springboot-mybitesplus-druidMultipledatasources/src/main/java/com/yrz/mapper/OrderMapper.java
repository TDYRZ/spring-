package com.yrz.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yrz.model.Order;

import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

/**
 * @author yrz
 */
public interface OrderMapper extends BaseMapper<Order> {
    @Select("SELECT price from t_order where user_id =#{userId}")
    BigDecimal getPriceByUserId(Integer userId);
}
