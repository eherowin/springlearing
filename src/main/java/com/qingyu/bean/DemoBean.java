package com.qingyu.bean;

import org.springframework.stereotype.Component;

//相当于在xml里面的 <bean id=demoBean
@Component
public class DemoBean {
    public void execute(){
        System.out.println("开启组件扫描，测试成功");
    }
}
