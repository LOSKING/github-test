package com.cuiyuling.login.demo.service;

import com.cuiyuling.login.demo.entity.User;

public interface UserService {
    public User login(String loginId,String loginPwd);
}
