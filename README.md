# dubbo-zookeeper
dubbo zookeeper环境搭建
zookeeper环境自己搭建  下载地址https://zookeeper.apache.org/releases.html#download
注意 zookeeper版本一定要和jar版本一致
分为三个项目
consumer 消费端
provider 服务端
api 对外提供接口
顾名思义
必须引入的 jar文件 处女座一样的干净 没有杂念 最外层pom引入  子项目里只需要引入父类项目就 ok  
先启动provider项目 
再启动 consumer项目 即可运行
 <dependencies>
        <dependency>
            <groupId>com.101tec</groupId>
            <artifactId>zkclient</artifactId>
            <version>0.10</version>
        </dependency>

        <dependency>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
            <version>3.4.10</version>
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>dubbo</artifactId>
            <version>2.6.0</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    一言不合就上手，自己跑跑吧入门级别
