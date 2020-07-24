package com.oocl.cultivation;

public class ParkingBoy {

    public Ticket parking (Car car) {
        return new Ticket(car.getCarId(), "");
    }

    public Car fetching (Ticket ticket) {
        return null;
    }
}
