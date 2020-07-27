package com.oocl.cultivation.other;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.Ticket;

import java.util.*;

/**
 * @Auther Sam Li
 * @Date 2020-07-26
 */
public class InitTool {
    public static List<ParkingLot> initTestData() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot(initCarData(), initTicketData(), initHistoryData()));
        parkingLots.add(new ParkingLot(new HashMap<>(), new ArrayList<>(), new HashSet<>()));
        return parkingLots;
    }

    public static List<ParkingLot> init2FullParkinglotTestData() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot(initCarData(), initTicketData(), initHistoryData()));
        parkingLots.add(new ParkingLot(initCarData(), initTicketData(), initHistoryData()));
        return parkingLots;
    }

    public static List<ParkingLot> init2UnEqualLengthParkinglotTestData() {
        List<ParkingLot> parkingLots = new ArrayList<>();

        Map<String, Car> cars = new HashMap<>();
        List<Ticket> tickets = new ArrayList<>();
        cars.put("T001", new Car("A001"));
        cars.put("T002", new Car("A002"));

        tickets.add(new Ticket("A001", "T001"));
        tickets.add(new Ticket("A002", "T002"));

        parkingLots.add(new ParkingLot(cars, tickets, new HashSet<>()));

        cars.put("T003", new Car("A003"));
        tickets.add(new Ticket("A003", "T003"));
        parkingLots.add(new ParkingLot(cars, tickets, new HashSet<>()));

        return parkingLots;
    }

    private static Map<String, Car> initCarData() {
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

        return cars;
    }

    private static List<Ticket> initTicketData() {

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
        return tickets;
    }

    private static Set<Ticket> initHistoryData() {
        Set<Ticket> historyTickets = new HashSet<>();
        historyTickets.add(new Ticket("A100", "T100"));
        return historyTickets;
    }

    public static String createTokenByCar (Car car) {
        return String.format("%s%s", "T", car.getCarId());
    }
}
