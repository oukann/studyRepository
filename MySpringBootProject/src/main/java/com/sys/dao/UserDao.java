package com.sys.dao;

import java.util.List;

import com.sys.entity.UserEntity;

public interface UserDao {

	public int inserUser(UserEntity user);
	
	public int deleteUser(String id);
	
	public int updateUser(UserEntity user);
	
	public List<UserEntity> selectUser(UserEntity user);
}
