package com.qingyu.Bean;

import com.qingyu.bean.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEmp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Emp emp=ac.getBean("emp", Emp.class);
        emp.show();
    }
}
