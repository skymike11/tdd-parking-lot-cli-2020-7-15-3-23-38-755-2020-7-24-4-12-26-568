package com.oocl.cultivation.strategy;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ServiceManager;

/**
 * @Auther Sam Li
 * @Date 2020-07-26
 */
public class DistributionStrategy implements ServiceStrategy {

    @Override
    public String parkingWay(Car car, ServiceManager serviceManager) {
        return "success";
    }
}
