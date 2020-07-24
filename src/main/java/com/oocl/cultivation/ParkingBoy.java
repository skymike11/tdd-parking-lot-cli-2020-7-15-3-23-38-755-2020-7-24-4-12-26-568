package com.oocl.cultivation;


public class ParkingBoy {

    private ParkingLot parkingLot;

    public Ticket parking (Car car) {
        return new Ticket(car.getCarId(), "");
    }

    public String fetching (Ticket ticket) {
        return "A001";
    }
}
