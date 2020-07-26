package com.oocl.cultivation.test;

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
}