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
        parkingLots.add(new ParkingLot());
        parkingLots.add(new ParkingLot(new HashMap<>(), new ArrayList<>(), new HashSet<>()));
        return parkingLots;
    }

    public static List<ParkingLot> init2FullParkinglotTestData() {
        List<ParkingLot> parkingLots = new ArrayList<>();
        parkingLots.add(new ParkingLot());
        parkingLots.add(new ParkingLot());
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
}
