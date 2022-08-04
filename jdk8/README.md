
# Java源码阅读调试环境搭建

Java源码阅读和调试环境搭建....

## 搭建步骤

1. 创建一个最普通的 Java 基础项目。

2. 创建两个包。

* source：用于放 JDK 源码。
* test：用于写测试代码。

![效果](https://rcbb-blog.oss-cn-guangzhou.aliyuncs.com/2021/09/20210901151623-00106a.png?x-oss-process=style/yuantu_shuiyin)

<!-- more -->

3. 导入JDK源码。

将 JDK 安装目录下的 src.zip 解压放到 source 下即可。

![src.zip内容](https://rcbb-blog.oss-cn-guangzhou.aliyuncs.com/2021/09/20210901151709-384dc8.png?x-oss-process=style/yuantu_shuiyin)

4. 将 SDKs 中关联的 JDK 源码路径修改为我们这个项目路径下的。

![修改JDK源码路径](https://rcbb-blog.oss-cn-guangzhou.aliyuncs.com/2021/09/20210901151919-05d7d5.png?x-oss-process=style/yuantu_shuiyin)


## 遇到的问题

### swing包下的一些内容报错。

解决方法：直接把 `java.swing` 整个删掉。

![内容找不到](https://rcbb-blog.oss-cn-guangzhou.aliyuncs.com/2021/09/20210901152209-d9c171.png?x-oss-process=style/yuantu_shuiyin)

### com.sun.source包下报错。

解决方法：直接把 `com.sun.source` 整个删掉。

### 启动调试时 Build 报错，提示系统资源不足。

解决方法：加大Build process heap size。

![加大Build process heap size](https://rcbb-blog.oss-cn-guangzhou.aliyuncs.com/2021/09/20210901152410-3b8dd0.png?x-oss-process=style/yuantu_shuiyin)

### F7进不去JDK源码。

因为调试时，JDK源码受保护，一般单步调试不让进，但是可以设置。

解决方法：

![设置调试可进入](https://rcbb-blog.oss-cn-guangzhou.aliyuncs.com/2021/09/20210901153633-3fb39d.png?x-oss-process=style/yuantu_shuiyin)

## 总结

JDK 源码肯定是要看的：
1. 面试跑不掉。
2. 弄懂原理才不慌。
3. 学习优秀的代码、思想和模式。

我上传的 JDK8 的源码：

> https://github.com/rcbb-cc/study-source-code