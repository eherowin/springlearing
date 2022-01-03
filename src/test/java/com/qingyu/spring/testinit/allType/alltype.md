## 各种类型信息的注入配置格式.

a.注入字符串,数值单个数值
<property name= ""value="">

b.注入bean对象

c.注入集合list, set, map, properties

d. spring表达式注入

###  #{表达式}
### #{id名.属性}或#{ id名.key}
如果是对象属性，需要有getXXX方法
