package com.dao;

import com.bean.User;
import com.common.exception.UserException;

public interface IUserDao {
	//根据名字查询用户
	public User selectByName(String name) throws UserException;
	//插入用户
	public void insertUser(User user) throws UserException;
	//根据id修改用户信息
	public void modifyById(int id, User user) throws UserException;
	//根据id删除用户
	public void deleteById(int id) throws UserException;
	//根据名字删除用户
	public void deleteByName(String name) throws UserException;
}
