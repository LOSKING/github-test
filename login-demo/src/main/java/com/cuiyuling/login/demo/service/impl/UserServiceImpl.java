package com.cuiyuling.login.demo.service.impl;

import com.cuiyuling.login.demo.dao.UserDao;
import com.cuiyuling.login.demo.dao.impl.UserDaoImpl;
import com.cuiyuling.login.demo.entity.User;
import com.cuiyuling.login.demo.service.UserService;

public class UserServiceImpl implements UserService {
    //数据访问层的具体实现
    private UserDao userDao = new UserDaoImpl();

    /**
     * 登录
     * @param loginId
     * @param loginPwd
     * @return
     */
    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId,loginPwd);
    }
}
