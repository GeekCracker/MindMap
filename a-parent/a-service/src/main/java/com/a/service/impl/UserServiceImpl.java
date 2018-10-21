package com.a.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.a.domain.User;
import com.a.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service(version="0.0.2")
public class UserServiceImpl implements UserService{

	@Override
	public List<User> getAll() {
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setId("1");
		user1.setUserName("张一");
		user1.setUserAge(21);
		Date date = new Date();
		user1.setCreatedTime(date);
		user1.setUpdatedTime(date);
		User user2 = new User();
		user2.setId("2");
		user2.setUserName("张二");
		user2.setUserAge(22);
		user2.setCreatedTime(date);
		user2.setUpdatedTime(date);
		User user3 = new User();
		user3.setId("3");
		user3.setUserName("张三");
		user3.setUserAge(23);
		user3.setCreatedTime(date);
		user3.setUpdatedTime(date);
		User user4 = new User();
		user4.setId("4");
		user4.setUserName("张五");
		user4.setUserAge(24);
		user4.setCreatedTime(date);
		user4.setUpdatedTime(date);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		return list;
	}
}
