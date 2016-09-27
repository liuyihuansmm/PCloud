package com.scyy.service.impl;

import com.scyy.dao.OrgDao;
import com.scyy.domain.Org;
import com.scyy.service.OrgService;

/**
 * OrgService接口实现类
 * @author LYH
 * @EditTime 2016-09-27
 */
public class OrgServiceImpl implements OrgService{
	
	/**
	 * 注入OrgDao
	 */
	private OrgDao orgDao;
	
	public void setOrgDao(OrgDao orgDao) {
		this.orgDao = orgDao;
	}
	
	@Override
	public void add(Org org) {
		
	}

}
