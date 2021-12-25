package com.qingyu.spring.testinit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

public class testCreateBeanObject {
    public static void main(String[] args) {
        String conf= "applicationContext.xml";
        ApplicationContext ac= new ClassPathXmlApplicationContext(conf);
        System.out.println("你好,spring!"+ac);
    }
}
