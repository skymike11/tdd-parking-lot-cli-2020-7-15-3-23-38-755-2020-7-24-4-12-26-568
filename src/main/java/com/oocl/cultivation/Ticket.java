package com.oocl.cultivation;

public class Ticket {

    private String carId;

    private String token;

    public Ticket(String carId, String token) {
        this.carId = carId;
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
