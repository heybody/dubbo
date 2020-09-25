package com.cares.services;

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
}
