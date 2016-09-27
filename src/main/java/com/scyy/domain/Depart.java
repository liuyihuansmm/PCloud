package com.scyy.domain;

/**
 * 党支部实体类
 * @author LYH
 * @EditTime 2016-09-27
 */
public class Depart {
	
	private Integer did;		//党支部主键id
	private String 	dname;		//党支部名称
	private String 	ddesc;		//党支部描述
	private Org		org;		//所属党组织（多对一）
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	public String getDdesc() {
		return ddesc;
	}
	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}
	
	
}
