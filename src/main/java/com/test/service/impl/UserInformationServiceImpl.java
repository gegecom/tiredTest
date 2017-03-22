package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserInformationDao;
import com.test.model.UserInformation;
import com.test.service.UserInformationService;
@Service
public class UserInformationServiceImpl implements UserInformationService {
	@Autowired
	UserInformationDao userInformationDao;
	@Override
	public List<UserInformation> userInformation(UserInformation uu) {
		List<UserInformation> userInformation = userInformationDao.findAll(uu);
		return userInformation;
	}

}
