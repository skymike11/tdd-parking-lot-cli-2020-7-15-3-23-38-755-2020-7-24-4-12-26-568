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
    }

    public ParkingLot(Map<String, Car> cars, List<Ticket> tickets, Set<Ticket> historyTickets) {
        this.cars = cars;
        this.tickets = tickets;
        this.historyTickets = historyTickets;
    }

    public Car findCarByToken (String token) {
        return cars.get(token);
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
}
