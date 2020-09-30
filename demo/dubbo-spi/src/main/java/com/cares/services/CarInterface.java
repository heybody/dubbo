package com.cares.services;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @program: dubbo-parent
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-22 20:20
 **/
@SPI
public interface  CarInterface {
    public void open();

    @Adaptive("car")
    public void move(URL url);
}
