/**
 * 代号:ab 2017：厚溥
 * 文件名：UserController.java
 * 创建人：李文辉
 * 日期：2017年5月19日
 * 修改人：
 * 描述：
 */
package com.qbb.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.qbb.common.ResponseAPI;
import com.qbb.model.User;
import com.qbb.service.UserService;


/**
 * 用途：
 */
@Controller
@RequestMapping("/user")
public class userController{
	@Resource
	ResponseAPI responseAPI;
	@Resource
	UserService userService;
	
	/**
	 *  @功能:增加用户
	 *  @作者:李文辉 
	 *  @代号:ab
	 *  @时间:2017年5月19日
	 *  @return  
	 */
	@RequestMapping("/saveUser")
	@ResponseBody
	public String saveUser(User user){
		int insert = userService.insert(user);
		Map<Object , Object> map=new HashMap<>();
		if(insert>0){
			map.put("code", 200);
		}else{
			map.put("code", 500);
		}
		return responseAPI.getJsonString(map);
	}
	
	/**
	 *  @功能:查询全部用户
	 *  @作者:李文辉 
	 *  @代号:ab
	 *  @时间:2017年5月19日
	 *  @return  
	 */
	@RequestMapping("/getAll")
	@ResponseBody
	public String getAll(Integer pagenum){
		Map<Object, Object> map=new HashMap<>();
		map.put("pagenum", pagenum);
		 PageInfo<User> userAll = userService.getUserAll(map);
		return responseAPI.getJsonString(userAll);
	}
}
