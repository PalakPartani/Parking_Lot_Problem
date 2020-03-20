package com.parkinglot;

public class ParkingLotOwner {

    private int informed;

    public boolean checkLotAvailability() {
        int count = new ParkingLot().carDetails.size();
        if (count <= ParkingLot.TOTAL) {
            return true;
        }
        informed = 1;
        return false;
    }

    public boolean getInformed() {
        checkLotAvailability();
        if (informed == 1)
            return true;
        return false;
    }
}
