package com.qingyu.spring.testinit.computer;


import com.qingyu.spring.set.Computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer c =new Computer();
        c.setCpu("i5");
        c.setHdd("希捷");
        c.setMainbord("华为");
        System.out.println(c.toString());
    }
}
