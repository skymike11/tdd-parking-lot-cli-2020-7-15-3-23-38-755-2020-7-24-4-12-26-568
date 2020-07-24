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
        cars.put("T004", new Car("A004"));
        cars.put("T005", new Car("A005"));
        cars.put("T006", new Car("A006"));
        cars.put("T007", new Car("A007"));
        cars.put("T008", new Car("A008"));
        cars.put("T009", new Car("A009"));
        cars.put("T0010", new Car("A010"));

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A001", "T001"));
        tickets.add(new Ticket("A002", "T002"));
        tickets.add(new Ticket("A003", "T003"));
        tickets.add(new Ticket("A004", "T004"));
        tickets.add(new Ticket("A005", "T005"));
        tickets.add(new Ticket("A006", "T006"));
        tickets.add(new Ticket("A007", "T007"));
        tickets.add(new Ticket("A008", "T008"));
        tickets.add(new Ticket("A009", "T009"));
        tickets.add(new Ticket("A010", "T0010"));

        this.cars = cars;
        this.tickets = tickets;
    }
}
