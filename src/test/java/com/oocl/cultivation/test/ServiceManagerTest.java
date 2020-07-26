package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ServiceManager;
import org.junit.jupiter.api.Test;

import static com.oocl.cultivation.other.InitTool.initTestData;
import static org.junit.jupiter.api.Assertions.*;

class ServiceManagerTest {
    @Test
    void should_return_1_member_when_joining_given_1_serviceManager_and_1_parkingboy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(initTestData());
        ServiceManager serviceManager = new ServiceManager();

        //when
        serviceManager.addParkingBoy(parkingBoy);
        int result = serviceManager.getParkingBoys().size();

        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_1_ticket_when_assign_parkingboy_parking_given_1_car() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(initTestData());
        ServiceManager serviceManager = new ServiceManager();
        Car car = new Car("B001");

        //when
        String result = serviceManager.assignParkingBoyParking(car);
        //then
        assertEquals("success", result);
    }
}