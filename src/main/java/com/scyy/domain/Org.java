package com.scyy.domain;

import java.util.Set;

/**
 * 党组织实体类
 * @author LYH
 * @EidtTime 2016-09-27
 */
public class Org {
	
	private Integer oid; 			//主键id
	private String oname;			//组织名称
	private	String odesc;			//组织描述
	private Set<Depart> departs;  	//下属党支部
	

	public String getOdesc() {
		return odesc;
	}
	public void setOdesc(String odesc) {
		this.odesc = odesc;
	}
	public Set<Depart> getDeparts() {
		return departs;
	}
	public void setDeparts(Set<Depart> departs) {
		this.departs = departs;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	
}
