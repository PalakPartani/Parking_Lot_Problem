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

    @Test
    public void givenVehicleDetails_WhenUnParked_ShouldReturnTrue() {

        Vehicle vehicle = new Vehicle("MH123", "Benz");
        parkingLot.parkVehicle(01, vehicle);
        boolean checkUnParkingDetails = parkingLot.unParkVehicle(01);
        Assert.assertTrue(checkUnParkingDetails);
    }

    @Test
    public void givenParkingDetailsToOwner_WhenFull_ShouldReturnTrue() {
        boolean checkParkingAvailability = new ParkingLotOwner().getInformed();
        Assert.assertTrue(checkParkingAvailability);
    }

    @Test
    public void givenParkingDetails_WhenFull_ShouldReturnTrue() {

        ParkingLotOwner p =new ParkingLotOwner();
        boolean redirect = p.getInformed();
        Assert.assertTrue(redirect);
    }
}