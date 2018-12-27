package com.cuiyuling.login.demo.dao;

import com.cuiyuling.login.demo.entity.User;

public interface UserDao {
    public User login(String loginId, String loginPwd);
}
