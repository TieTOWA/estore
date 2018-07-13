package com.service.impl;

import com.bean.User;
import com.common.exception.UserException;
import com.dao.IUserDao;
import com.dao.impl.UserDaoImpl;
import com.service.IUserService;

public class UserServiceImpl implements IUserService {

	/**
	 * 注册操作
	 */
	@Override
	public boolean registerUser(User user) throws UserException {
		IUserDao userDao = new UserDaoImpl();
		int row = userDao.insertUser(user);
		if (row != 0) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 登陆
	 */
	@Override
	public User loginUser(String name, String password) throws UserException {
		User user = getUserByName(name);
		if (user == null) {
			throw new UserException("用户不存在");
		}else {
			if (!user.getPassword().equals(password)) {
				throw new UserException("用户名或密码不存在");
			}
		}
		return user;
	}

	/**
	 * 通过名字查找用户
	 */
	@Override
	public User getUserByName(String name) throws UserException {
		IUserDao userDao = new UserDaoImpl();
		User user = userDao.selectByName(name);
		if (user != null) {
			return user;
		}
		return null;
		
	}

	/**
	 * 更新用户信息
	 */
	@Override
	public User updateUserInfo(User user) throws UserException {
		IUserDao userDao = new UserDaoImpl();
		System.out.println(user.getUsername());
		User user2 = userDao.selectByName(user.getUsername());
		user.setId(user2.getId());
		userDao.modifyById(user.getId(), user);
		return user;
	}

	/**
	 * 检测用户信息
	 */
	@Override
	public boolean checkUser(User user) throws UserException {
		if (user.getUsername() == null || user.getUsername() == "") {
			System.out.println(user.getUsername());
			return false;
		}else if (user.getPassword() == null || user.getPassword() == "") {
			System.out.println(user.getPassword());
			return false;
		}else if (user.getZip() == null || user.getZip() == "") {
			return false;
		}else if (user.getAddress() == null || user.getAddress() == "") {
			return false;
		}else if (user.getPhone() == null || user.getPhone() == "") {
			return false;
		}else if (user.getEmail() == null || user.getEmail() == "") {
			return false;
		}else {
			return true;
		}
	}

}
