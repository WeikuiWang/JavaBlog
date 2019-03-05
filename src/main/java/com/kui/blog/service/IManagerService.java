package com.kui.blog.service;

import java.util.List;

import com.kui.blog.model.Manager;

public interface IManagerService {
	
	/**
	 * ����Ψһ�˺Ų�ѯ��������Ա
	 * @param account
	 * @return
	 */
	public Manager getManagerByAccount(String account);
	
	/**
	 * ��ȡȫ������Ա��Ϣ
	 * @return
	 */
	public List<Manager> getAllManagers();
	
}
