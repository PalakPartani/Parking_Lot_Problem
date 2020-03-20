package com.parkinglot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

    ParkingLot parkingLot;

    @Before
    public void setUp() throws Exception {
        parkingLot = new ParkingLot();
    }

    @Test
    public void givenParkingLotCapacity100_WhenCorrect_ShouldReturnTrue() {

        boolean capacity = parkingLot.getInitialParkingCapacity();
        Assert.assertTrue(capacity);
    }

    @Test
    public void givenVehicleDetails_WhenLotPresent_ShouldReturnTrue() {

        Vehicle vehicle = new Vehicle("MH123", "Benz");
        boolean checkParkingDetails = parkingLot.parkVehicle(01, vehicle);
        Assert.assertTrue(checkParkingDetails);
    }
}