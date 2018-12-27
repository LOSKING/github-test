package com.cuiyuling.login.demo.dao.impl;

import com.cuiyuling.login.demo.dao.UserDao;
import com.cuiyuling.login.demo.entity.User;

/**
 * 用户登录
 * @param
 * @param
 * @return String 登录结果
 */
public class UserDaoImpl implements UserDao {
    public User login(String loginId, String loginPwd) {
        User user = null;
        //直接根据loginId查询出用户信息
        if ("admin".equals(loginId)){
            //再根据传入的密码匹配（防止sql注入）
            if ("admin".equals(loginPwd)){
                user = new User();
                user.setLoginId("admin");
                user.setLoginPwd("admin");
                user.setUserName("daxiong");

            }

        }
            return user;
    }

}
