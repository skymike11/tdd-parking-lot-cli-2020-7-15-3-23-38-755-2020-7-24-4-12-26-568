package com.oocl.cultivation;


import com.oocl.cultivation.other.ParkingTips;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingBoy {

    private ParkingLot parkingLot;

    public ParkingBoy() {
        this.parkingLot = new ParkingLot();
    }

    public Ticket parking(Car car) {
        if (parkingLot.getTickets().size() >= 10) {
            return null;
        }
        return new Ticket(car.getCarId(), "T001");
    }

    public String fetching(Ticket ticket) {
        if (isNullTicket(ticket) || isUsedTicket(ticket)) {
            return ParkingTips.UNRECOGNIZED_TICKET;
        }

        boolean isExistTicket = parkingLot.getTickets().stream().anyMatch(
                item -> item.getToken().equals(ticket.getToken()));
        if (!isExistTicket) {
            return ParkingTips.WRONG_TICKET;
        }
        return parkingLot.getCars().get(ticket.getToken()).getCarId();
    }

    private boolean isNullTicket(Ticket ticket) {
        return ticket == null;
    }

    private boolean isUsedTicket(Ticket ticket) {
        return parkingLot.getHistoryTickets().contains(ticket);
    }
}
