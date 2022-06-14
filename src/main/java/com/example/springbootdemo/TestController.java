package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-demo
 * @description:
 * @author: xiebinbin
 * @create: 2022-06-14 21:53
 **/

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
