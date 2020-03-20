package com.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private int[] parkingCapacity = new int[100];
    Map<Integer, Vehicle> carDetails;
    public final static int TOTAL = 100;

    public ParkingLot() {
        carDetails = new HashMap<>();
    }

    public boolean getInitialParkingCapacity() {
        return true;
    }

    public boolean parkVehicle(int carParkingNo, Vehicle vehicle) {
        if (carDetails.size() <= TOTAL) {
            carDetails.put(carParkingNo, vehicle);
            return true;
        }
        return false;
    }

    public boolean unParkVehicle(int carParkingNo) {
        if ((boolean) carDetails.containsKey(carParkingNo)) {
            carDetails.remove(1);
            return true;
        }
        return false;
    }
}

