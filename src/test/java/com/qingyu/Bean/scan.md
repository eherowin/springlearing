可以按指定的包路径，将包下所有组件

扫描,如果发现组件类定义前有以下标记，

会将组件扫描到Spring容器. <bean>

@Component/ /其他组件

@Controller/ /控制层组件

@Service/ /业务层组件

@Repository//数据访问层组件Dao

@Named(需要引入第三方标准包)
