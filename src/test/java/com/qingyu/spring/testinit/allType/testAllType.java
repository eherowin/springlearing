package com.qingyu.spring.testinit.allType;

import com.qingyu.spring.alltype.MessageBean;
import com.qingyu.spring.alltype.MessageUtilBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAllType {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageBean messageBean=  ac.getBean("messageBean", MessageBean.class);
        System.out.println(messageBean.toString());
        MessageUtilBean messageUtilBean=  ac.getBean("messageUtilBean", MessageUtilBean.class);
        System.out.println(messageUtilBean.toString());
    }
}
