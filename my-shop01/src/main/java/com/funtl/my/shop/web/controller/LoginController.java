package com.funtl.my.shop.web.controller;

        import com.funtl.my.shop.commons.context.SpringContext;
        import com.funtl.my.shop.entity.User;
        import com.funtl.my.shop.service.UserService;

        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

public class LoginController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SpringContext context = new SpringContext();
        UserService userService = (UserService) context.getBean("userService");


        User user = userService.login("admin@qq.com", "12345");

        System.out.println(user);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
