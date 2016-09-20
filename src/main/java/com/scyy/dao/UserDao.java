package com.scyy.dao;

import com.scyy.domain.Users;

public interface UserDao {
	
	public Users findByUsernameAndPassword(Users u);
	
	public void save(Users u);
	
}
