package com.oocl.cultivation;

public class NoAvailableParkingLotException extends RuntimeException {

    private String message;

    public NoAvailableParkingLotException(String message) {
        this.message = message;
    }

    public NoAvailableParkingLotException() {
    }
}
