package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private Map<String, Car> cars;

    private List<Ticket> tickets;

    public ParkingLot() {
        cars = new HashMap<>();
        tickets = new ArrayList<>();
        initParkingLotData();
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    private void initParkingLotData() {
        Map<String, Car> cars = new HashMap<>();
        cars.put("T001", new Car("A001"));
        cars.put("T002", new Car("A002"));
        cars.put("T003", new Car("A003"));

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A001", "T001"));
        tickets.add(new Ticket("A002", "T002"));
        tickets.add(new Ticket("A003", "T003"));

        this.cars = cars;
        this.tickets = tickets;
    }
}
