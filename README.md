# Coke-API
Coke API 一个提供 API 接口供开发者调用的平台

本项目是一个面向开发者的 API 平台，提供 API 接口供开发者调用。用户通过注册登录，可以开通接口调用权限，并可以浏览和调用接口，使用 SDK 轻松地在代码中调用接口。每次调用都会进行统计，用户可以根据统计数进行分析和优化。管理员可以发布接口、下线接口、接入接口，并可视化接口的调用情况和数据。

本项目为前后端分离项目，前端主要采用TypeScript、React、Antd Pro等主流开发框架。后端采用Spring Cloud SpringBoot 作为业务框架。通过Springcloud Gateway作为全局网关实现流量控制、负载均衡以及路由管理，使用Mybatis-plus作为持久层技术。使用Apache Dubbo做高性能远程服务调用。同时Nacos作为注册中心，完成服务注册与发现，通过各模块主要功能以及业务进行模块的合理划分。

**语雀-（项目开发全流程）**：https://www.yuque.com/chenhaopeng0222/ahw7ei

**主页（浏览接口）：**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image1.png)


**接口管理：**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image2.png)


**在线调试：**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image3.png)


**可视化：**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image4.png)


**使用自己开发的客户端 SDK，一行代码调用接口：**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image5.png)


**架构图**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image6.png)


**技术选型**
![](https://github.com/chenhhhppp/Coke-API/blob/main/docs/image7.png)


 详情全在语雀，请访问语雀查看。




