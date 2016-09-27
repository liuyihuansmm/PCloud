package com.scyy.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.scyy.dao.UserDao;
import com.scyy.domain.Users;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	/**
	 * 登录判断
	 */
	@Override
	public Users findByUsernameAndPassword(Users u) {
		//hql语句中的'表名' 应该是指类名而非数据库里的表名
		String sql = "from Users where username = ? and password = ?";
		List<Users> user = (List<Users>) this.getHibernateTemplate().find(sql,u.getUsername(),u.getPassword());
		if(user.size()>0) {
			return user.get(0);
		}
		return null;
	}

	/**
	 * 保存
	 */
	@Override
	public void save(Users u) {
		this.getHibernateTemplate().save(u);
	}
	
}
