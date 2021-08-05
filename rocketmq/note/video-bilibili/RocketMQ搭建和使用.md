# ßRocketMQ 搭建和使用

[本文总结自视频](https://www.bilibili.com/video/BV1cf4y157sz)

## 基本概念

### 消息

Message，消息是指消息系统所传输信息的物理载体，生产和消费数据的最小单位，每条消息必须属于一个主题。

### 主题ß

Topic，表示一类消息的集合，每个主题包含若干条消息，每个消息只能属于一个主题，是 RocketMQ 进行消息订阅的基本单位。

一个生产者可以同时发送多种 Topic 的消息，而一个消费者只对某种特定的 Topic 感兴趣，即只可以订阅和消费一种 Topic 的消息。

### 标签

ßTag，消息标签，二级消息类型，用来进一步区分某个Topic下的消息分类。

### 队列

Queue，存储消息的物理实体，一个 Tpoic 可以包含多个 Queue，每个 Queue 中存放的就是该 Topic 的消息。一个 Topic 的 Queue 也被称为一个 Topic 中消息的分区（Partition）。

### 消息标识

MessageId/Key，



## 系统架构



## 单机安装与启动



## 控制台安装与启动



## 集群搭建理论



## 磁盘阵列 RAID



## 集群搭建实践



## mqadmin 命令



## 总结

