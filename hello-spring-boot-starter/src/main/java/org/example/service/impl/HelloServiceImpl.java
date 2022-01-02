package org.example.service.impl;

import org.example.HelloProperties;
import org.example.service.HelloService;

import javax.annotation.Resource;

/**
 * @author zhouwenhua02
 * @date 2022/1/2
 */
public class HelloServiceImpl implements HelloService {

    @Resource
    private HelloProperties helloProperties;

    public String sayHello() {
        System.out.println("hello, " + helloProperties.getName());
        return "";
    }
}
