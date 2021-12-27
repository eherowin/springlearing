package com.qingyu.spring.scope;

public class ExampleBean {
    public ExampleBean() {
        System.out.println("构造器方法");
    }

    public void init() {
        System.out.println("解析其他文件");
    }

    // ExampleBean  和 init  有类似，init会晚于构造方法
    public void execute() {
        System.out.println("调用execute");
    }

    public void mydestroy() {
        //单例模式才可以使用销毁模式
        //AbstractApplicationContext 才有这个方法
        System.out.println("调用mydestroy");
    }


}
