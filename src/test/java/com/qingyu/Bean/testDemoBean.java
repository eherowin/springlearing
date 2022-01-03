package com.qingyu.Bean;

import com.qingyu.bean.DemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemoBean {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        DemoBean demoBean=  ac.getBean("demoBean", DemoBean.class);
        demoBean.execute();

    }
}
