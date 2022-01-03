package com.qingyu.spring.alltype;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageUtilBean {
    private String name;
    private int age;
    private List<String> friends;
    private Set<String> cities;
    private Map<String, String> books;
    private Properties db;

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MessageUtilBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                ", cities=" + cities +
                ", books=" + books +
                ", db=" + db +
                '}';
    }
}
