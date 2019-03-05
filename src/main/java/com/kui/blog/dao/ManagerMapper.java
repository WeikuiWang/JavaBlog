package com.kui.blog.dao;

import java.util.List;

import com.kui.blog.model.Manager;

public interface ManagerMapper {
	public Manager queryManagerByAccount(String account);

	public List<Manager> queryAllManager();
}
