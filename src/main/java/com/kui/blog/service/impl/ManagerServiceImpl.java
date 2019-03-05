package com.kui.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kui.blog.dao.ManagerMapper;
import com.kui.blog.model.Manager;
import com.kui.blog.service.IManagerService;
@Service("managerService")
public class ManagerServiceImpl implements IManagerService {
	@Autowired
	private ManagerMapper managerMapper;
	
	public Manager getManagerByAccount(String account) {
		return managerMapper.queryManagerByAccount(account);
	}

	public List<Manager> getAllManagers() {
		List<Manager> managerList = managerMapper.queryAllManager();
		
		return managerMapper.queryAllManager();
	}

}
