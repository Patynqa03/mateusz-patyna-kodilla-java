package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {
    FlightService flightService = new FlightService();
    flightService.addFlight(new Flight("Kraków","Gdańsk"));
    flightService.addFlight(new Flight("Kraków","Warszawa"));
    flightService.addFlight(new Flight("Berlin","Warszawa"));
    flightService.addFlight(new Flight("Lublin","Warszawa"));
    flightService.addFlight(new Flight("Ustka","Tokio"));
    flightService.addFlight(new Flight("Prayż","Warszawa"));

    List<Flight> flightListFromWarszawa = flightService.flightsFrom("Warszawa");
    System.out.println(flightListFromWarszawa);
    }

}
