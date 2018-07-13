package com.service;

import com.bean.User;
import com.common.exception.UserException;


public interface IUserService {
	
	/**
	 * 用户注册
	 * @param user
	 * @throws UserException
	 */
	public boolean registerUser(User user) throws UserException;
	
	/**
	 * 用户登陆
	 * @param name
	 * @param password
	 * @return 登陆成功返回user，登陆失败返回null
	 * @throws UserException
	 */
	public User loginUser(String name,String password) throws UserException;
	
	/**
	 * 通过用户名获取用户
	 * */
	public  User getUserByName(String name) throws UserException;

	
	/**
	 * 修改用户信息
	 * */
	public User updateUserInfo(User user) throws UserException;
	
	/**
	 * 检测用户信息
	 */
	public boolean checkUser(User user) throws UserException;
}