/**
 * 代号:ab 2017：厚溥
 * 文件名：UserServiceImpl.java
 * 创建人：李文辉
 * 日期：2017年5月19日
 * 修改人：
 * 描述：
 */
package com.qbb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qbb.dao.UserDao;
import com.qbb.model.User;
import com.qbb.service.UserService;

/**
 * 用途：
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource 
	UserDao userDao;
	@Override
	public int deleteByPrimaryKey(Integer id) {

		return 0;
	}

	@Override
	public int insert(User record) {

		return userDao.insert(record);
	}

	@Override
	public int insertSelective(User record) {

		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {

		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {

		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {

		return 0;
	}

	/**
	 *  @功能:查询全部用户
	 *  @作者:李文辉 
	 *  @代号:ab
	 *  @时间:2017年5月19日
	 *  @return  
	 */
	@Override
	public List<User> getUserAll() {
		
		return userDao.getUserAll();
	}

}
