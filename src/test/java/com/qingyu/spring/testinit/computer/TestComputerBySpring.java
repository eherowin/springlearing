package com.qingyu.spring.testinit.computer;

import com.qingyu.spring.set.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputerBySpring {
    public static void main(String[] args) {
        String conf= "applicationContext.xml";
        // 创建容器对象
        ApplicationContext ac= new ClassPathXmlApplicationContext(conf);
        Computer computer=(Computer)ac.getBean("compute");
        System.out.println(computer.toString());
    }
}
