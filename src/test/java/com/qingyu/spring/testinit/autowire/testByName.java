package com.qingyu.spring.testinit.autowire;

import com.qingyu.spring.autowire.byName.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class testByName {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextEditor textEditor=ac.getBean("textEditor",TextEditor.class);
        textEditor.getSpellChecker().checkSpelling();
        System.out.println(textEditor.toString());
    }
}
