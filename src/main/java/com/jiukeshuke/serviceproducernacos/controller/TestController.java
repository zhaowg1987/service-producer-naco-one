package com.jiukeshuke.serviceproducernacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @Author
 * @create 2019-06-17
 **/
@RefreshScope
@RestController
public class TestController {


    @Value("${spring.cloud.username}")
    String userName;

    @Value("${spring.cloud.age}")
    private String age;


    @RequestMapping("/user")
    public String simple() {
        return "Hello Nacos Config!" + "Hello " + userName + " " + age + "!";
    }

}
