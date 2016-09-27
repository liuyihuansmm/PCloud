package com.scyy.action;

import com.opensymphony.xwork2.ModelDriven;
import com.scyy.domain.Depart;
import com.scyy.service.DepartService;

public class DepartAction extends BaseAcion implements ModelDriven<Depart>{
	
	/**
	 * 实现ModelDriven接口
	 */
	private Depart depart;
	
	@Override
	public Depart getModel() {
		// TODO Auto-generated method stub
		return depart;
	}
	
	/**
	 * 注入DepartService
	 */
	private DepartService departService;

	public void setDepartService(DepartService departService) {
		this.departService = departService;
	}
	
	

}
