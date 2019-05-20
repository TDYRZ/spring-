package com.yrz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yrz.model.User;
import com.yrz.service.UserService;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yrz
 */
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUserList() {

		return ResponseEntity.ok(userService.getUserList());
	}

}
