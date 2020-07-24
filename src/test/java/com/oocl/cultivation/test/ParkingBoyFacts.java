package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingBoyFacts {
    @Test
    void should_return_ticket_num_when_parking_car_given_car() {
        //given
        Car car = new Car();

        //when
        ParkingBoy parkingBoy = new ParkingBoy();
        String result = parkingBoy.parking(car);

        //then
        assertEquals("A001", result);
    }

}
