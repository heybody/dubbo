package com.cares.demo;

/**
 * @program: demo
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-25 22:36
 **/
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello() {
        System.out.println("provider say hello");
        return "call ok";
    }
}
