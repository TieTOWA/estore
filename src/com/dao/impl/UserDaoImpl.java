package com.dao.impl;
import java.util.Date;
import java.util.List;

import com.bean.User;
import com.common.exception.UserException;
import com.dao.IUserDao;
import com.utils.BaseDao;


public class UserDaoImpl extends BaseDao implements IUserDao{
	/**
	 * 根据名字查询用户
	 * @param name
	 * @return user
	 */
	@Override
	public User selectByName(String name) throws UserException {
		BaseDao baseDao = new BaseDao();
		String sql = "select * from s_user where username = ?";
		Object[] param = {
			name
		};
		List<User> list = baseDao.find(sql, param, User.class);
		User user = list.get(0);
		return user;
	}
	
	/**
	 * 插入用户
	 * @param user
	 * @return void
	 */
	@Override
	public void insertUser(User user) throws UserException {
		BaseDao baseDao = new BaseDao();
		Date date = new Date();
		user.setDob(date);
		String sql = "insert into s_user(username,password,zip,address,phone,email,dob) values(?,?,?,?,?,?,?)";
		Object[] param = {
			user.getUsername(),
			user.getPassword(),
			user.getZip(),
			user.getAddress(),
			user.getPhone(),
			user.getEmail(),
			user.getDob()	
		};
		int row = baseDao.executeUpdate(sql, param);
	}
	
	/**
	 * 根据id修改用户信息
	 * @param id
	 * @return void
	 */
	@Override
	public void modifyById(int id,User user) throws UserException {
		BaseDao baseDao = new BaseDao();
		String sql = "update s_user set password=?,zip=?,address=?,phone=?,email=? where id = "+id+"";
		Object[] param = {
				user.getPassword(),
				user.getZip(),
				user.getAddress(),
				user.getPhone(),
				user.getEmail()
		};
		baseDao.executeUpdate(sql, param);
	}
	
	/**
	 * 根据id删除用户
	 * @param id
	 * @return void
	 */
	@Override
	public void deleteById(int id) throws UserException {
		BaseDao baseDao = new BaseDao();
		String sql = "delete from s_user where id = ?";
		baseDao.executeUpdate(sql, new Object[] {id});
	}
	
	/**
	 * 根据名字删除用户
	 * @param name
	 * @return void
	 */
	@Override
	public void deleteByName(String name) throws UserException {
		BaseDao baseDao = new BaseDao();
		String sql = "delete from s_user where name = ?";
		baseDao.executeUpdate(sql, new Object[] {name});
	}

}