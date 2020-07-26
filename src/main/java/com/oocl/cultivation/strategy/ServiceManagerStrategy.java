package com.oocl.cultivation.strategy;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ServiceManager;
import com.oocl.cultivation.Ticket;

import java.util.List;

import static com.oocl.cultivation.other.Constants.PARKING_SUCCESS;
import static com.oocl.cultivation.other.ParkingTips.UNRECOGNIZED_TICKET;

/**
 * @Auther Sam Li
 * @Date 2020-07-26
 */
public class ServiceManagerStrategy implements ServiceStrategy {
    @Override
    public String parkingWay(Car car, ServiceManager serviceManager, String parkingBoyId) {
        return PARKING_SUCCESS;
    }

    @Override
    public Car fetchingWay(ServiceManager serviceManager, Ticket ticket) {
        return serviceManager.findCarByToken(ticket.getToken());
    }
}
