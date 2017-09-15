package com.afei.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afei.springmvc.dao.IUserDao;
import com.afei.springmvc.model.User;
import com.afei.springmvc.service.IUserService;

@Service
public class UserService implements IUserService{
	@Autowired
	IUserDao userDao;
	
	@Override
	public void saveUser(User user) {
		userDao.save(user);
	}
	
}
