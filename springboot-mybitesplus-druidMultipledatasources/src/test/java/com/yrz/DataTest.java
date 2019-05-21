package com.yrz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yrz.service.db1.UserService;
import com.yrz.service.db2.OrderService;

/**
 * @Author yrz
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DataTest {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    @Test
    public void test() {
       userService.getUserList().stream().forEach(item -> System.out.println(item));
      orderService.getOrderList().stream().forEach(item -> System.out.println(item));
    }

    /**
     * 测试一下注解方式
     */
    @Test
    public void test2() {
       orderService.getOrderList().stream().forEach(item -> System.out.println(item));
      System.out.println(userService.getOrderPriceByUserId(1));
    }
}
