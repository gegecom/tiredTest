package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.model.UserInf;

public interface UserDao {
	
	public int addUser(UserInf model);
	
	public int delUser(UserInf model);
	
	public int modUser(UserInf model);
	
	public List<UserInf> getUser(UserInf model);
	
}
