package com.kui.blog.service;

import java.util.List;

import com.kui.blog.model.Manager;

public interface IManagerService {
	
	/**
	 * 根据唯一账号查询单个管理员
	 * @param account
	 * @return
	 */
	public Manager getManagerByAccount(String account);
	
	/**
	 * 获取全部管理员信息
	 * @return
	 */
	public List<Manager> getAllManagers();
	
}
