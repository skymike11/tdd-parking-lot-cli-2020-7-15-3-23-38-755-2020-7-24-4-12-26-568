package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.other.ParkingTips;
import com.oocl.cultivation.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    void should_return_wrong_ticket_tip_when_fetching_car_given_wrong_ticket() {
        //given
        Ticket ticket = new Ticket("A003", "T001F");

        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        String result = parkingBoy.fetching(ticket);

        assertEquals(ParkingTips.WRONG_TICKET, result);
    }

    @Test
    void should_return_null_when_parking_car_without_position_given_car() {
        //given
        Car car = new Car("A011");

        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket result = parkingBoy.parking(car);

        assertNull(result);
    }

    @Test
    void should_return_unrecognized_ticket_tip_when_fetching_car_given_not_ticket() {
        //given
        Ticket ticket = null;

        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        String result = parkingBoy.fetching(ticket);

        assertEquals(ParkingTips.UNRECOGNIZED_TICKET, result);
    }
}
