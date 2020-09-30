package com.cares.services;

import org.apache.dubbo.common.URL;

/**
 * @program: dubbo-parent
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-22 21:15
 **/
public class WhoCar implements  CarInterface {
    @Override
    public void open() {
        System.out.println("open who car");
    }

    @Override
    public void move(URL url) {
        System.out.println("who car move");
    }
}
