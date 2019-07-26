package com.sys.dao;

import com.sys.entity.UserEntity;

public interface UserDao {

	public int inserUser(UserEntity user);
	
	public int deleteUser(String id);
}
