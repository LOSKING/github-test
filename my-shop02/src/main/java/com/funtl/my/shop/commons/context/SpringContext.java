package com.funtl.my.shop.commons.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用来创建bean实例
 */
public final class SpringContext {

     public Object getBean( String beanId){
         ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
         return context.getBean(beanId);
     }


}
