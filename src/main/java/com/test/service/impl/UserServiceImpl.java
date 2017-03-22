package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.model.UserInf;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public boolean isLogin(UserInf model) {
		
//		List<UserInf> result = userDao.getUser(model);
//		
//		if(result!=null && result.size()>0){
//			return true;
//		}
		
		return false;
	}

	
}
