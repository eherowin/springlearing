package com.qingyu.Bean;

import com.qingyu.bean.DemoBean1;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemoBean1 {
    public static void main(String[] args) {
        AbstractApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        DemoBean1 demo1=  ac.getBean("demo1", DemoBean1.class);
        demo1.execute();
        ac.close();//释放同期对象资源，触发单例对象的 destory
    }
}
