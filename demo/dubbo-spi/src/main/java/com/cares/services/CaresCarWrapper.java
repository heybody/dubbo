package com.cares.services;

import org.apache.dubbo.common.URL;

/**
 * @program: dubbo-parent
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-22 21:15
 **/
public class CaresCarWrapper implements CarInterface {

    private CarInterface carInterface;

    public CaresCarWrapper(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void open() {
        System.out.println("before");
        carInterface.open();
        System.out.println("after");

    }

    @Override
    public void move(URL url) {
        System.out.println("car wrapper before");
        carInterface.move(url);
        System.out.println("car wrapper after");
    }
}
