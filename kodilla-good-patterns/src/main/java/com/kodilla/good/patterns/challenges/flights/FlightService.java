package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private List<Flight> flightList = new ArrayList<>();
   public void addFlight(Flight flight) {
        flightList.add(flight);
    }
    public void removeFlight(Flight flight) {
        flightList.remove(flight);
    }
    public List<Flight> flightsTo(String destination) {
        return flightList.stream().filter(flight -> flight.getDestination().equals(destination)).collect(Collectors.toList());
    }
    public List<Flight> flightsFrom(String flightsFrom) {
        return flightList.stream().filter(flight -> flight.getFromWhere().equals(flightsFrom)).collect(Collectors.toList());
    }
}
