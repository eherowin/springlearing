package com.qingyu.spring.testinit.phone;


import com.qingyu.spring.constructor.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPhoneBySpring {
    public static void main(String[] args) {
        String conf= "applicationContext.xml";
        // 创建容器对象
        ApplicationContext ac= new ClassPathXmlApplicationContext(conf);
        Phone phone=ac.getBean("phone",Phone.class);
        System.out.println(phone.toString());
    }
}
