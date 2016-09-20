package com.scyy.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action基类BaseAction,获取request,response等对象
 * @author LYH
 *
 */
public class BaseAcion extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{
	
	/**
	 * 只让子类Action才能访问，所以访问权限是protected
	 */
	protected HttpServletRequest 	request;
	protected HttpSession		 	session;
	protected ServletContext	 	application;
	protected HttpServletResponse	response;
	
	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
	}
		
}
