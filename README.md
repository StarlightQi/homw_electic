# 家电管理系统

该项目是单纯Mybatis项目，实现了对家电信息的增删改查功能的方法

## 目录结构

```
lib 项目运行需要的jar包
		mybatis-3.4.4.jar   mybatis jar包
		mysql-connector-java-8.0.11.jar   数据库连接驱动
out 编译后的文件
resource 资源目录，里边有对应每个实体对象xml映射文件，保存了操作的SQL语句
		mybatis-config.xml  总的mybatis全局配置环境
		
src 主要java文件目录
	dao包   里边记录了全局操作的接口方法，增删改查等方法
	model包 为家电管理系统的实体类，Furniture家电类，Other订单类，User用户类
	server  服务类，实现dao包中的接口，和方法实现

数据库资源文件：系统用到的的数据表等
```



具体知识详情请查看[个人博客]()

