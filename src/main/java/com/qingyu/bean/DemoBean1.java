package com.qingyu.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//diy id
@Component("demo1")
//@Scope("prototype") //等价与《bean scope=“”
public class DemoBean1 {
    @PostConstruct //等价于<bean init-method
    public void init() {
        System.out.println("初始化逻辑");
    }
    @PreDestroy //等价于<bean destory-method
    public void destroy() {
        System.out.println("释放资源");
    }
    public void execute() {
        System.out.println("标记时，指定自己的id");
    }
}
