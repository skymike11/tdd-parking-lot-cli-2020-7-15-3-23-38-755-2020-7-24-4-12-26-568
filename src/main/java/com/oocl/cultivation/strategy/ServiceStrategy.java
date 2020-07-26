package com.oocl.cultivation.strategy;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ServiceManager;
import com.oocl.cultivation.Ticket;

public interface ServiceStrategy {
    String parkingWay(Car car, ServiceManager serviceManager, String parkingBoyId);

    Car fetchingWay(ServiceManager serviceManager, Ticket token);
}
