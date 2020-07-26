package com.oocl.cultivation.test;

import com.oocl.cultivation.*;
import com.oocl.cultivation.other.ParkingTips;
import org.junit.jupiter.api.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.oocl.cultivation.other.InitTool.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParkingBoyFacts {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void should_return_ticket_when_parking_car_given_car() {
        //given
        String carId = "A001";
        Car car = new Car(carId);
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");

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
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        String carId = parkingBoy.fetching(ticket);

        //then
        assertEquals(carId, "A001");
    }

    @Test
    void should_return_unrecognized_ticket_tip_when_fetching_car_given_used_ticket() {
        //given
        Ticket ticket = new Ticket("A100", "T100");

        //when
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        String result = parkingBoy.fetching(ticket);

        //then
        assertEquals(ParkingTips.UNRECOGNIZED_TICKET, result);
    }

    @Test
    void should_return_null_when_parking_car_without_position_given_car() {
        //given
        Car car = new Car("A011");

        //when
        ParkingBoy parkingBoy = new ParkingBoy(init2FullParkinglotTestData(), "!");
        Ticket result = parkingBoy.parking(car);
        String message = "";
        if (result == null) {
            message = ParkingTips.NO_POSITION;
        }
        // TODO : 获取不到控制台打印
        assertEquals(ParkingTips.NO_POSITION, message);
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    void should_return_unrecognized_ticket_tip_when_fetching_car_given_not_ticket() {
        //given
        Ticket ticket = null;

        //when
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        String result = parkingBoy.fetching(ticket);

        assertEquals(ParkingTips.UNRECOGNIZED_TICKET, result);
    }

    @Test
    void should_return_equal_length_when_parking_smart_given_2_unfull_parkinglot() {
        //given
        String carId = "A012";
        Car car = new Car(carId);
        ParkingBoy parkingBoy = new ParkingBoy(init2UnEqualLengthParkinglotTestData(), "1");

        //when
        Ticket ticket = parkingBoy.parking(car);

        //then
        assertEquals(parkingBoy.getParkingLots().get(0).getTickets().size(),
                parkingBoy.getParkingLots().get(1).getTickets().size());
    }

    @Test
    void should_return_1_member_when_joining_given_1_serviceManager_and_1_parkingboy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        ServiceManager serviceManager = new ServiceManager();

        //when
        serviceManager.addParkingBoy(parkingBoy);
        int result = serviceManager.getParkingBoys().size();

        //then
        assertEquals(1, result);
    }

}
