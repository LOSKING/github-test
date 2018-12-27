package com.funtl.my.shop.dao;

import com.funtl.my.shop.entity.User;

/**
 * 
 */
public interface UserDao {
    /**
     * 根据邮箱或密码获取用户信息
     * @param email
     * @param password
     * @return 用户
     */
    public User getUser(String email,String password);


}
