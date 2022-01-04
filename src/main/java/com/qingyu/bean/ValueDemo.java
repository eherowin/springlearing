package com.qingyu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ValueDemo {
    //利用@value 表达式注入
    @Value("#{dbParams.user}")
    private String user;
    @Value("#{dbParams.password}")
    private String password;
    @Value("#{dbParams.driver}")
    private String driver;
    @Value("#{dbParams.url}")
    private String url;

    @Override
    public String toString() {
        return "ValueDemo{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
