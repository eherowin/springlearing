package com.qingyu.spring.alltype;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageBean {
    private String name;
    private int age;
    private Date birth;
    private List<String> friends;
    private Set<String> cities;
    private String remark;
    private Map<String, String> books;
    private Properties db;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setBirth(String birth) {

        this.birth = Date.valueOf(birth);
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public void setBooks(Map<String, String> books) {
        this.books = books;
    }

    public void setDb(Properties db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "MessageBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", friends=" + friends +
                ", cities=" + cities +
                ", remark='" + remark + '\'' +
                ", books=" + books +
                ", db=" + db +
                '}';
    }
}
