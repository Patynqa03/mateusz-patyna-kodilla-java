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
    public List<Flight> findConnectingFlights(String origin, String via, String destination) {

       List<Flight> firstStep = flightsFrom(origin);
       List<Flight> secondStep = flightsTo(destination);

        return firstStep.stream()
                .filter(flight -> flight.getDestination().equals(via))
                .filter(flight -> secondStep.stream()
                        .anyMatch(flight2 -> flight2.getFromWhere().equals(via) && flight2.getDestination().equals(destination)))
                .collect(Collectors.toList());




    }

}
