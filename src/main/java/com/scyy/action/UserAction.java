package com.scyy.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.scyy.domain.Users;
import com.scyy.service.UserService;

/**
 * UsersAction负责处理Users相关的逻辑
 * @author LYH
 * @EditTime 2016-09-20
 */
public class UserAction extends BaseAcion implements ModelDriven<Users>{
	
	/**
	 * 实现ModelDriven接口
	 */
	private Users user = new Users();
	
	@Override
	public Users getModel() {
		return this.user;
	}
	
	/**
	 * 注入UserService
	 */
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 用户登录逻辑
	 * @return
	 */
	public String login() {
		
		Users userResult = userService.login(user);
		if(userResult == null) {
			this.addActionError("用户名或密码错误！");
			return INPUT;
		}else{
			ActionContext.getContext().getSession().put("currentUser", userResult);
			return "login";
		}
	}
	
}
