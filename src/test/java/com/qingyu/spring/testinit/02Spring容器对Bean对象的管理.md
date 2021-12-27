 
### 2.Spring容器对Bean对象的管理
 com.qingyu.spring.testinit.scope.testExample
- a.控制对象创建模式
```
Spring容器可以采用单例或非单例方式创建
对象。<bean scope="singleton|prototype">,
默认scope="singleton"单例
```
-  b.控制对象初始化和销毁
``` 
 可以为bean指定初始化方法和销毁方法。
 <bean init-method="方法名">
 <bean destroy-method="方法名">
 提示：destroy-method仅对scope=singleton有效;并且需要ac.close()触发
``` 
- c.控制单例对象的创建时机
``` 
   单例Bean默认在Spring容器实例化时创建；
  可以使用<bean lazy-init="true">推迟到
  ac.getBean()方法创建。
 提示：也可以在<beans>根元素使用
default-lazy-init,default-init-method,
default-destroy-method控制所有<bean>
 <beans default-lazy-init="true">
```