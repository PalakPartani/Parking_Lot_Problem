package com.parkinglot;

public class ParkingLotOwner {
    public boolean checkLotAvailability() {
        int count = new ParkingLot().carDetails.size();
        if (count < ParkingLot.TOTAL) {
            return true;
        }
        return false;
    }
}
