package com.scyy.service.impl;

import com.scyy.dao.DepartDao;
import com.scyy.service.DepartService;

/**
 * DepartService接口实现类
 * @author LYH
 * @EditTime 2016-09-27
 */
public class DepartServiceImpl implements DepartService{
	
	/**
	 * 注入DepartDao
	 */
	private DepartDao departDao;

	public void setDepartDao(DepartDao departDao) {
		this.departDao = departDao;
	}
	
	
	
}
