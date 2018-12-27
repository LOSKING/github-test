package com.cuiyuling.hello.spring;

import com.cuiyuling.hello.spring.service.UserService;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    //单例的饿汉，门面，工厂
    private  static  final Logger logger = LoggerFactory.getLogger(SpringTest.class);

    public  static void  main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();

        logger.info("info级别的日志");
        logger.debug("debug级别的日志");
        logger.debug("debug级别的日志");
        logger.warn("warn级别的日志");
        logger.error("error级别的日志");
        String message = "测试";


        logger.warn("message is : {}",message);

       System.out.println(String.format("messsage is %s", message));


    }
}
