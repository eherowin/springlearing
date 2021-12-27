package com.qingyu.spring.set;

public class Computer {
    private  String cpu;
    private  String hdd;
    private  String mainbord;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getMainbord() {
        return mainbord;
    }

    public void setMainbord(String mainbord) {
        this.mainbord = mainbord;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", mainbord='" + mainbord + '\'' +
                '}';
    }
}
