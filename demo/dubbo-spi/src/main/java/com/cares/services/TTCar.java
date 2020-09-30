package com.cares.services;

import org.apache.dubbo.common.URL;

/**
 * @program: dubbo-provider
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-27 22:42
 **/
public class TTCar implements CarInterface {

    CarInterface carInterface;

    public void setCarInterface(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void open() {
        carInterface.open();
    }

    @Override
    public void move(URL url) {
        carInterface.move(url);
    }
}
