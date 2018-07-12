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
	public void registerUser(User user) throws UserException {
		IUserDao userDao = new UserDaoImpl();
		userDao.insertUser(user);
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

}
