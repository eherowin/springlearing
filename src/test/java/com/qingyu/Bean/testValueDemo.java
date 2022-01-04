package com.qingyu.Bean;

import com.qingyu.bean.ValueDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testValueDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ValueDemo valueDemo=ac.getBean("valueDemo", ValueDemo.class);
        System.out.println(valueDemo.toString());
    }
}
