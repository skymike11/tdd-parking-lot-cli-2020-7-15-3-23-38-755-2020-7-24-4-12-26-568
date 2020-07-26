package com.oocl.cultivation.strategy;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ServiceManager;
import com.oocl.cultivation.Ticket;

import java.util.List;

import static com.oocl.cultivation.other.Constants.*;
import static com.oocl.cultivation.other.ParkingTips.UNRECOGNIZED_TICKET;

/**
 * @Auther Sam Li
 * @Date 2020-07-26
 */
public class DistributionStrategy implements ServiceStrategy {

    @Override
    public String parkingWay(Car car, ServiceManager serviceManager, String parkingBoyId) {
        ParkingBoy selectedParkingBoy = serviceManager.getParkingBoys()
                .stream().filter(item -> item.getId().equals(parkingBoyId)).findFirst().get();
        Ticket ticket = selectedParkingBoy.parking(car);
        return ticket != null ? PARKING_SUCCESS : PARKING_FAILED;
    }

    @Override
    public Car fetchingWay(ServiceManager serviceManager, Ticket ticket) {
        List<ParkingBoy> parkingBoys = serviceManager.getParkingBoys();
        String result = null;
        for (ParkingBoy parkingBoy : parkingBoys) {
            result = parkingBoy.fetching(ticket);
            if (!result.equals(UNRECOGNIZED_TICKET)) {
                return parkingBoy.findCarByToken(ticket.getToken());
            }
        }
        return null;
    }
}
