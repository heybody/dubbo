package com.cares.services;

import org.apache.dubbo.common.URL;

/**
 * @program: dubbo-parent
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-22 21:15
 **/
public class CaresCar implements  CarInterface {
    @Override
    public void open() {
        System.out.println("open cares car");
    }

    @Override
    public void move(URL url) {
        System.out.println("cares car move");
    }
}
