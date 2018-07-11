package com.service.impl;

import java.util.Date;

import com.bean.User;
import com.common.exception.UserException;
import com.dao.IUserDao;
import com.dao.impl.UserDaoImpl;
import com.service.IUserService;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class UserServiceImpl implements IUserService {

	/**
	 * 注册操作
	 */
	@Override
	public void registerUser(User user) throws UserException {
		IUserDao userDao = new UserDaoImpl();
		userDao.insertUser(user);
	}

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

	@Override
	public User getUserByName(String name) throws UserException {
		IUserDao userDao = new UserDaoImpl();
		User user = userDao.selectByName(name);
		if (user != null) {
			return user;
		}
		return null;
		
	}

	@Override
	public void updateUserInfo(User user) throws UserException {
		// TODO Auto-generated method stub
		
	}

}
