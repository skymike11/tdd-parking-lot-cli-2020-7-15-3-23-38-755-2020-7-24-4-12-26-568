package com.oocl.cultivation;


import com.oocl.cultivation.other.ParkingTips;

public class ParkingBoy {

    private ParkingLot parkingLot;

    public Ticket parking (Car car) {
        return new Ticket(car.getCarId(), "");
    }

    public String fetching (Ticket ticket) {
        if (ticket.getToken().equals("T001F")) {
            return ParkingTips.WRONG_TICKET;
        }
        return "A001";
    }
}
