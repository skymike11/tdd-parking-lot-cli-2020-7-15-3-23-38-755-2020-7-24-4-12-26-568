package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ServiceManager;
import com.oocl.cultivation.Ticket;
import com.oocl.cultivation.other.Constants;
import com.oocl.cultivation.other.ParkingTips;
import com.oocl.cultivation.strategy.DistributionStrategy;
import com.oocl.cultivation.strategy.ServiceManagerStrategy;
import org.junit.jupiter.api.Test;

import static com.oocl.cultivation.other.Constants.PARKING_SUCCESS;
import static com.oocl.cultivation.other.InitTool.initTestData;
import static org.junit.jupiter.api.Assertions.*;

class ServiceManagerTest {
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

    @Test
    void should_return_success_when_assign_parkingboy_parking_given_1_car_and_target_parkingboy_id() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        ServiceManager serviceManager = new ServiceManager(initTestData(), new DistributionStrategy());
        serviceManager.addParkingBoy(parkingBoy);
        Car car = new Car("B001");

        //when
        String result = serviceManager.parkingService(car, parkingBoy.getId());
        //then
        assertEquals(PARKING_SUCCESS, result);
    }

    @Test
    void should_return_car_when_assign_parkingboy_fetching_given_1_ticket() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        ServiceManager serviceManager = new ServiceManager(initTestData(), new DistributionStrategy());
        serviceManager.addParkingBoy(parkingBoy);

        Ticket ticket = new Ticket("A001", "T001");
        //when
        Car car = serviceManager.fetchingService(ticket);
        //then
        assertEquals("A001", car.getCarId());
    }

    @Test
    void should_return_ticket_when_manager_parking_given_1_car() {
        //given
        ServiceManager serviceManager = new ServiceManager(initTestData(), new ServiceManagerStrategy());
        Car car = new Car("B001");

        //when
        String result = serviceManager.parkingService(car, null);
        //then
        assertEquals(PARKING_SUCCESS, result);
    }

    @Test
    void should_return_car_when_manager_fetching_car_given_ticket() {
        //given
        ServiceManager serviceManager = new ServiceManager(initTestData(), new ServiceManagerStrategy());

        Ticket ticket = new Ticket("A001", "T001");
        //when
        Car car = serviceManager.fetchingService(ticket);
        //then
        assertEquals("A001", car.getCarId());
    }

    @Test
    void should_return_unrecognized_ticket_tip_when_manager_fetching_car_given_used_ticket() {
        //given
        Ticket ticket = new Ticket("A100", "T100");

        //when
        ServiceManager serviceManager = new ServiceManager(initTestData(), new ServiceManagerStrategy());
        String result = serviceManager.fetching(ticket);

        //then
        assertEquals(ParkingTips.UNRECOGNIZED_TICKET, result);
    }



}