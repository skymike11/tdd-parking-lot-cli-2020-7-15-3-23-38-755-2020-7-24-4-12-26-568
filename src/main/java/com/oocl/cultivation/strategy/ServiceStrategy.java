package com.oocl.cultivation.strategy;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ServiceManager;

public interface ServiceStrategy {
    String parkingWay(Car car, ServiceManager serviceManager, String parkingBoyId);
}
