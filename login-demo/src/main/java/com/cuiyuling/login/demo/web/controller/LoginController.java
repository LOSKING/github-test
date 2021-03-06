package com.cuiyuling.login.demo.web.controller;

import com.cuiyuling.login.demo.entity.User;
import com.cuiyuling.login.demo.service.UserService;
import com.cuiyuling.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
   private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginId = req.getParameter("loginId");
        String loginPwd = req.getParameter("loginPwd");

        User user = userService.login(loginId, loginPwd);
        //登录失败的处理
        if (user == null){
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }

        else {
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }
    }
}
