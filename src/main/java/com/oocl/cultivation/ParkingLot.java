package com.oocl.cultivation;

import java.util.*;

public class ParkingLot {

    private Map<String, Car> cars;

    private List<Ticket> tickets;

    private Set<Ticket> historyTickets;

    public ParkingLot() {
        cars = new HashMap<>();
        tickets = new ArrayList<>();
        historyTickets = new HashSet<>();
        initParkingLotData();
    }

    public ParkingLot(Map<String, Car> cars, List<Ticket> tickets, Set<Ticket> historyTickets) {
        this.cars = cars;
        this.tickets = tickets;
        this.historyTickets = historyTickets;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public Set<Ticket> getHistoryTickets() {
        return historyTickets;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    private void initParkingLotData() {
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

        historyTickets.add(new Ticket("A100", "T100"));
    }
}
