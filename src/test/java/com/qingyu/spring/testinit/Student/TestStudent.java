package com.qingyu.spring.testinit.Student;
import com.qingyu.spring.setref.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        String conf= "applicationContext.xml";
        // 创建容器对象
        ApplicationContext ac= new ClassPathXmlApplicationContext(conf);
        Student student=(Student)ac.getBean("student");
        System.out.println(student.toString());
    }
}
