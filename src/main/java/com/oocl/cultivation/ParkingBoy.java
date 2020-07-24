package com.oocl.cultivation;


import com.oocl.cultivation.other.ParkingTips;

import java.util.*;

import static com.oocl.cultivation.other.ParkingTips.NO_POSITION;

public class ParkingBoy {

    private List<ParkingLot> parkingLots;

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Ticket parking(Car car) {
        if (!isExistedPosition()) {
            System.out.print(NO_POSITION);
            return null;
        }
        Ticket ticket = new Ticket(car.getCarId(), "T001");
        int index = getMaxUsedRateCarsParkingLot();
        ParkingLot parkingLot = parkingLots.get(index);
        parkingLot.getTickets().add(ticket);
        parkingLot.getCars().put(ticket.getToken(), car);

        parkingLots.set(index, parkingLot);
        return ticket;
    }

    public String fetching(Ticket ticket) {
        if (isNullTicket(ticket) || isUsedTicket(ticket)) {
            return ParkingTips.UNRECOGNIZED_TICKET;
        }
        boolean isExistTicket = true;
        ParkingLot selectedParkingLot = null;
        for (ParkingLot parkingLot : parkingLots) {
            isExistTicket = parkingLot.getTickets().stream().anyMatch(
                    item -> item.getToken().equals(ticket.getToken()));
            if (!isExistTicket) {
                return ParkingTips.WRONG_TICKET;
            } else {
                selectedParkingLot = parkingLot;
                break;
            }
        }
        return selectedParkingLot.getCars().get(ticket.getToken()).getCarId();
    }

    private boolean isNullTicket(Ticket ticket) {
        return ticket == null;
    }

    private boolean isUsedTicket(Ticket ticket) {
        return parkingLots.stream().anyMatch(parkingLot -> parkingLot.getHistoryTickets().contains(ticket));
    }

    private boolean isExistedPosition() {
        return parkingLots.stream().anyMatch(parkingLot -> parkingLot.getTickets().size() < 10);
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public int getMaxUsedRateCarsParkingLot () {
        int max = 0;
        int index = 0;
        for (int i = 0; i < parkingLots.size(); i++) {
            if ((10 - parkingLots.get(i).getTickets().size()) % 10 > max ) {
                index = i;
            }
        }
        return index;
    }
}
