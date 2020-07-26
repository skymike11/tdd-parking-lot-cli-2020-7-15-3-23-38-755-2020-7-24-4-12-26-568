package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Auther Sam Li
 * @Date 2020-07-26
 */
public class ServiceManager {
    private List<ParkingBoy> parkingBoys;

    public ServiceManager() {
        parkingBoys = new ArrayList<>();
    }

    public void addParkingBoy (ParkingBoy parkingBoy) {
        this.parkingBoys.add(parkingBoy);
    }

    public List<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }
}
