package com.qbb.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.qbb.model.User;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     *  @功能:分页查询
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月19日
     *  @return  
     */
    PageInfo<User> getUserAll(Map<Object, Object> map);
}