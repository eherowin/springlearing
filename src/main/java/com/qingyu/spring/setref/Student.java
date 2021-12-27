package com.qingyu.spring.setref;

import com.qingyu.spring.constructor.Phone;
import com.qingyu.spring.set.Computer;

public class Student {
    private Computer computer;
    private Phone phone;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "computer=" + computer +
                ", phone=" + phone +
                '}';
    }
}
