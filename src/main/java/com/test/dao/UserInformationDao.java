package com.test.dao;

import java.util.List;

import com.test.model.UserInformation;

public interface UserInformationDao {
	public List<UserInformation> findAll(UserInformation uu);
}
