package com.oocl.cultivation.strategy;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ServiceManager;
import com.oocl.cultivation.Ticket;

import static com.oocl.cultivation.other.Constants.*;

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
}
