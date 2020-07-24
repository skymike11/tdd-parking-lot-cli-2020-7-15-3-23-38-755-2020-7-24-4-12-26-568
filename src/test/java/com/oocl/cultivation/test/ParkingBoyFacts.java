package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingBoyFacts {
    @Test
    void should_return_ticket_when_parking_car_given_car() {
        //given
        String carId = "A001";
        Car car = new Car(carId);
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Ticket ticket = parkingBoy.parking(car);

        //then
        assertEquals(ticket.getToken(), "T001");
    }

    @Test
    void should_return_car_when_fetching_car_given_ticket() {
        //given
        Ticket ticket = new Ticket("A001", "T001");

        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        String carId = parkingBoy.fetching(ticket);

        //then
        assertEquals(carId, "A001");
    }


}
