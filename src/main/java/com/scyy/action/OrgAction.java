package com.scyy.action;

import com.opensymphony.xwork2.ModelDriven;
import com.scyy.domain.Org;
import com.scyy.service.OrgService;

/**
 * OrgAction负责处理Org相关的逻辑
 * @author LYH
 * @EditTime 2016-09-27
 */
public class OrgAction extends BaseAcion implements ModelDriven<Org> {
	
	/**
	 * 实现ModelDriven接口
	 */
	private Org org;
	
	@Override
	public Org getModel() {
		// TODO Auto-generated method stub
		return org;
	}
	
	/**
	 * 注入OrgService
	 */
	private OrgService orgService;
		
	public void setOrgService(OrgService orgService) {
		this.orgService = orgService;
	}

	/**
	 * 跳转新增党组织页面
	 * @return
	 */
	public String addUI(){
		return "addUI";
	}
	
	/**
	 * 新增党组织
	 * @return
	 */
	public String add(){
		return null;
	}
	
}
