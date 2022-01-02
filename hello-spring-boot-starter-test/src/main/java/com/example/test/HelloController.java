package com.example.test;

import org.example.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhouwenhua02
 * @date 2022/1/2
 */
@RequestMapping
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("test")
    public String test() {
        return helloService.sayHello();
    }
}
