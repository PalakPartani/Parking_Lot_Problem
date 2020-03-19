package com.parkinglot;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void givenParkingLotCapacity100_WhenCorrect_ShouldReturnTrue() {
        ParkingLot parkingLotSystem = new ParkingLot();
        int capacity = parkingLotSystem.getParkingCapacity();
        Assert.assertEquals(100,capacity);
    }}