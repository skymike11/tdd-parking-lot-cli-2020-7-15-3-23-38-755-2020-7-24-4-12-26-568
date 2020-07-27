package com.oocl.cultivation;


import java.util.*;


public class ParkingBoy extends AbstractParkingBoy {

    private String id;

    public ParkingBoy(List<ParkingLot> parkingLots, String id) {
        super(parkingLots);
        this.id = id;
    }

    @Override
    public ParkingLot findWillBeParkedParkingLot() throws NoAvailableParkingLotException {
        return parkingLots.stream()
                .filter(parkingLot -> !parkingLot.isFull())
                .findFirst()
                .orElseThrow(NoAvailableParkingLotException::new);
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
