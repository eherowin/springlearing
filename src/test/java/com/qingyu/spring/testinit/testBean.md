核心功能IOC容器的使用

  用IOC容器:可以管理程序中的组件,维护组件对象之间的关系。（创建对象;以低耦合方式建立对象关系）
  
  1）什么是容器？
  
  容器可以存放和管理对象的。
  
  ## List
 - a.创建容器对象
 
  ``` 
List list = new ArrayList();
  ```
  - b.向容器添加元素
  ``` 
list.add(p1);
```

- c.从容器获取元素
``` 
  list.get(0);
  ```
 ### Spring容器
 
  - a.创建容器对象
``` ApplicationContext ac = 
  new ClassPathXmlApplicationContext(xml配置文件); 
```
  - b.向容器添加元素
  
   ``` 在xml配置文件中定义组件即可
(Spring容器可以帮助我们创建和管理组件对象)
创建对象的三种方式
    <!-- 等价于new GregorianCalendar() -->
    <bean id="c1"
          class="java.util.GregorianCalendar">
    </bean>
    <!-- 等价于Calendar.getInstance 静态工厂方法 -->
    <bean id="c2"
          class="java.util.Calendar"
          factory-method="getInstance">
    </bean>
    <!-- 调用对象的方法获取实例
        Date date1 = c2.getTime(); 对象工厂方法	-->
    <bean id="date1"
          factory-bean="c2"
          factory-method="getTime">
    </bean>
``` 
  - c.从容器获取元素
  
```
ac.getBean("id属性值",组件类型);
```
``` 
list 创建比较简单，直接 new.
Spring容器与List等集合容器相似，但是功能比List强大的多。
Spring需要搭环境，还需要xml配置文件（相当于配置了一个秘书） 
```