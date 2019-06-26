package com.jiukeshuke.serviceproducernacos;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//指定扫描的mapper接口所在的包
@MapperScan("com.jiukeshuke.serviceproducernacos.**.dao")
@EnableDistributedTransaction
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProducerNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProducerNacosApplication.class, args);
    }

}
