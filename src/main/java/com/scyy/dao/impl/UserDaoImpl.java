package com.scyy.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.scyy.dao.UserDao;
import com.scyy.domain.Users;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(Users u) {
		this.getHibernateTemplate().save(u);
	}

}
