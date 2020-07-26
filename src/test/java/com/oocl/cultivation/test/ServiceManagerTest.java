package com.oocl.cultivation.test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ServiceManager;
import com.oocl.cultivation.strategy.DistributionStrategy;
import org.junit.jupiter.api.Test;

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
        ServiceManager serviceManager = new ServiceManager(new DistributionStrategy());
        serviceManager.addParkingBoy(parkingBoy);
        Car car = new Car("B001");

        //when
        String result = serviceManager.parkingService(car, parkingBoy.getId());
        //then
        assertEquals("success", result);
    }

    @Test
    void should_return_car_when_assign_parkingboy_fetching_given_1_ticket_token() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(initTestData(), "1");
        ServiceManager serviceManager = new ServiceManager(new DistributionStrategy());
        serviceManager.addParkingBoy(parkingBoy);

        String token = "T001";
        //when
        Car car = serviceManager.fetchingService(token);
        //then
        assertEquals("A001", car.getCarId());
    }
}