package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {
    FlightService flightService = new FlightService();
    flightService.addFlight(new Flight("Warszawa","Kraków"));
    flightService.addFlight(new Flight("Kraków","Ustka"));
    flightService.addFlight(new Flight("Berlin","Warszawa"));
    flightService.addFlight(new Flight("Lublin","Warszawa"));
    flightService.addFlight(new Flight("Ustka","Kraków"));
    flightService.addFlight(new Flight("Prayż","Warszawa"));

    List<Flight> flightListFromWarszawa = flightService.flightsFrom("Warszawa");
    System.out.println(flightListFromWarszawa);

    System.out.println("------------");

    List<Flight> flightListThruKrakow = flightService.findConnectingFlights("Warszawa","Kraków","Ustka");
        System.out.println(flightListThruKrakow);
    }

}
