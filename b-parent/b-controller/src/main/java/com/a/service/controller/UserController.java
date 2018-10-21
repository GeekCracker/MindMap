package com.a.service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a.domain.User;
import com.a.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;

@RestController("FrontUserController")
@RequestMapping("/front/user")
public class UserController {

	@Reference(version="0.0.2")
	private UserService userService;
	
	@RequestMapping("getUserAll.action")
	public List<User> getUserAll(){
		return userService.getAll();
	}
}
