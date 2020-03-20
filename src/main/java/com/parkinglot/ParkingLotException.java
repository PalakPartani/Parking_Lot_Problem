package com.parkinglot;

public class ParkingLotException extends RuntimeException {
    public enum ExceptionType {
        VEHICLE_NOT_FOUND,OCCUPIED
    }

    ExceptionType type;

    public ParkingLotException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
