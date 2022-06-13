package com.service;

import com.entity.Admin;

/*
 * 管理员
 */
public interface AdminServiceInter {
	//根据管理员loginId和password进行登录
	public Admin adminLogin(String loginId, String password);
}
