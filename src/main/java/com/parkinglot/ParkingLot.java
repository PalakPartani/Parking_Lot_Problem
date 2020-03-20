package com.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private int[] parkingCapacity = new int[100];
    Map<Integer, Vehicle> carDetails = new HashMap<>();

    public boolean getInitialParkingCapacity() {
        return true;
    }

    public boolean parkVehicle(int carParkingNo,Vehicle vehicle) {
        if (carDetails.size() <= 100) {
            carDetails.put(carParkingNo,vehicle);
            return true;
        }
        return false;
    }
}

