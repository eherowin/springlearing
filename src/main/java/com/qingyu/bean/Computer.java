package com.qingyu.bean;

import org.springframework.stereotype.Component;

@Component("ec")
public class Computer {
    public void show(){
        System.out.println("给员工分配电脑");
    }
}
