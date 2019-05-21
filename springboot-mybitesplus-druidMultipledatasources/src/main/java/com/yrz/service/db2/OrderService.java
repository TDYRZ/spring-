package com.yrz.service.db2;

import com.baomidou.mybatisplus.service.IService;
import com.yrz.model.Order;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yrz
 */
public interface OrderService extends IService<Order> {
    List<Order> getOrderList();
    BigDecimal getOrderPriceByUserId(Integer userId);
}
