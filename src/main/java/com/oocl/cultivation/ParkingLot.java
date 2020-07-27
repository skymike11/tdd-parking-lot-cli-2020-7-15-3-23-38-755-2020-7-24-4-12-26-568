package com.oocl.cultivation;

import java.util.*;

import static com.oocl.cultivation.other.InitTool.createTokenByCar;

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

    public Ticket parkingCar(Car car) {
        Ticket ticket = new Ticket(car.getCarId(), createTokenByCar(car));
        tickets.add(ticket);
        cars.put(ticket.getToken(), car);
        return ticket;
    }

    public Car fetchCar (Ticket ticket) {
        return cars.get(ticket.getToken());

    }

    public boolean isFull () {
        return cars.size() == 10;
    }

    public Car findCarByToken(String token) {
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

}
