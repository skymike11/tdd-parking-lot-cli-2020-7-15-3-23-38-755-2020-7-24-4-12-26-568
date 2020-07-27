package com.oocl.cultivation;


import java.util.*;


public class ParkingBoy extends AbstractParkingBoy {

    private String id;

    public ParkingBoy(List<ParkingLot> parkingLots, String id) {
        super(parkingLots);
        this.id = id;
    }

    @Override
    protected ParkingLot findWillBeParkedParkingLot() {
        return null;
    }

    public Car findCarByToken(String token) {
        Car car = null;
        for (ParkingLot parkingLot : parkingLots) {
            car = parkingLot.findCarByToken(token);
            if (car != null) {
                return car;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
