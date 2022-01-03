package com.qingyu.bean;

import com.qingyu.bean.Computer;
import com.qingyu.bean.Cubicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Emp {
    @Resource//注入电脑对象
    private Computer ec;
    @Autowired//注入工位对象
    private Cubicle cubicle;

    public void setEc(Computer ec) {
        this.ec = ec;
    }

    public void setCubicle(Cubicle cubicle) {
        this.cubicle = cubicle;
    }

    public void show(){
        System.out.println("新进一名员工");
        ec.show();
        cubicle.show();
    }
}
