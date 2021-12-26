package com.qingyu.spring.testinit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class testBean{
    public static void main(String[] args) {
        // 以前创建对象
        String conf= "applicationContext.xml";
        // 创建容器对象
        ApplicationContext ac= new ClassPathXmlApplicationContext(conf);
        //  Calendar c1= new GregorianCalendar();
        //从容器里面获取对象
        Calendar gc=(Calendar)ac.getBean("c1");
        Calendar gc1=ac.getBean("c1",Calendar.class);//使用泛型
        // 使用
        System.out.println(gc);
        //  Calendar c2=Calendar.getInstance();
        Calendar gc2=(Calendar)ac.getBean("c2");
        System.out.println(gc2);
        Date date =(Date)ac.getBean("date1");
        System.out.println(date);

    }
}
