package com.oocl.cultivation;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(carId, ticket.carId) &&
                Objects.equals(token, ticket.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, token);
    }
}
