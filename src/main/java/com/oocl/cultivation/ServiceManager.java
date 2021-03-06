package com.oocl.cultivation;

import com.oocl.cultivation.strategy.ServiceStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther Sam Li
 * @Date 2020-07-26
 */
public class ServiceManager extends AbstractParkingBoy {
    private List<ParkingBoy> parkingBoys;

    private ServiceStrategy serviceStrategy;

    public ServiceManager() {
        parkingBoys = new ArrayList<>();
    }

    @Override
    public ParkingLot findWillBeParkedParkingLot() {
        return null;
    }

    public ServiceManager(List<ParkingLot> parkingLots, ServiceStrategy serviceStrategy) {
        super(parkingLots);
        this.serviceStrategy = serviceStrategy;
        parkingBoys = new ArrayList<>();
    }

    public void addParkingBoy(ParkingBoy parkingBoy) {
        this.parkingBoys.add(parkingBoy);
    }

    public List<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public String parkingService(Car car, String parkingBoyId) {
        return serviceStrategy.parkingWay(car, this, parkingBoyId);
    }

    public Car fetchingService (Ticket ticket) {
        return serviceStrategy.fetchingWay(this, ticket);
    }

}
