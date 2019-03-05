package com.kui.blog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kui.blog.model.Manager;
import com.kui.blog.service.IManagerService;

import net.sf.json.JSONObject;

@Controller
public class ManagerController {
	
	@Autowired
	private IManagerService managerService;
	
	/**
	 * 管理员后台登录
	 * @param account
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "login.do")
	@ResponseBody
	public Map managerLogin(String account, String password) {	
		Map<String, String> map = new HashMap<String, String>();
		Manager manager = managerService.getManagerByAccount(account);
		if(null != manager && null != password && password.equals(manager.getManagerPassword()) ) {
			System.out.println(password);
			map.put("result", "success");
			return map;
		} else {
			map.put("result", "field");
			return map;
		}
	}
	
	/**
	 * 管理员列表查询接口
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "queryAdminList.do")
	@ResponseBody
	public JSONObject queryAdminList(Model model) {
		JSONObject jsonObject = new JSONObject();
		try {
			List<Manager> managerList = managerService.getAllManagers();
			System.out.println(managerList.size());
			if(null != managerList && managerList.size() > 0) {
				jsonObject.put("adminList", managerList);
				jsonObject.put("code", "200");
				jsonObject.put("message", "success");
			} else {
				jsonObject.put("code", "500");
				jsonObject.put("message", "no admin data");
			}
		} catch (Exception e) {
			jsonObject.put("code","400");
			jsonObject.put("message", "error");
		}
		return jsonObject;
	}
	
}
