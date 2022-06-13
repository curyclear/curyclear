package com.service;

import com.dao.AdminDAOImpl;
import com.dao.AdminDAOInter;
import com.entity.Admin;

public class AdminServiceImpl implements AdminServiceInter {
	private AdminDAOInter adminDAO = new AdminDAOImpl();
	//根据管理员loginId和password进行登录
	public Admin adminLogin(String loginId, String password){
		Admin admin = adminDAO.adminLogin(loginId, password);
		return admin;
	}
}
