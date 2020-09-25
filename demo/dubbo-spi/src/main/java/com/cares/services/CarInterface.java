package com.cares.services;

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
}
