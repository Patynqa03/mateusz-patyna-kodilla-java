package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flight {

    private String destination;
    private String fromWhere;

    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", fromWhere='" + fromWhere + '\'' +
                '}';
    }

    public Flight(String fromWhere, String destination) {
        this.destination = destination;
        this.fromWhere = fromWhere;
    }

    public String getDestination() {
        return destination;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(destination, flight.destination)) return false;
        return Objects.equals(fromWhere, flight.fromWhere);
    }

    @Override
    public int hashCode() {
        int result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + (fromWhere != null ? fromWhere.hashCode() : 0);
        return result;
    }
}
