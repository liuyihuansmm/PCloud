package com.scyy.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.scyy.dao.UserDao;
import com.scyy.domain.Users;
import com.scyy.service.UserService;

/**
 * UserService接口实现类
 * @author LYH
 * @EditTime 2016-09-20
 */
@Transactional
public class UserServiceImpl implements UserService{
	
	/**
	 * 注入UserDao
	 */
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 用户登录逻辑
	 */
	@Override
	public Users login(Users user) {
		Users userS = userDao.findByUsernameAndPassword(user);
		return userS;
	}

}
