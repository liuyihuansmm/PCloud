package com.scyy.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.scyy.dao.OrgDao;
import com.scyy.domain.Org;

/**
 * OrgDao层接口实现类
 * @author LYH
 * @EditTime 2016-09-27
 */
public class OrgDaoImpl extends HibernateDaoSupport implements OrgDao{

	@Override
	public void add(Org org) {
		this.getHibernateTemplate().save(org);
	}

}
