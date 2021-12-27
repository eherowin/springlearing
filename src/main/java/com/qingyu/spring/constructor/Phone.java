package com.qingyu.spring.constructor;

public class Phone {
    private  String cpu;
    private  String ram;

    public Phone(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
