package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightProcessor {


    private Flight flight = new Flight("Polska", "Ameryka");
    private Flight flight1 = new Flight("Niemcy", "Holandia");
    private Flight flight2 = new Flight("Japonia", "Rosja");

    public boolean findFlight(String destination) throws RouteNotFoundException{


        Map<String, Boolean> hashMap = new HashMap<>();
        hashMap.put(flight.getArrivalAirport(), true);
        hashMap.put(flight1.getArrivalAirport(), true);
        hashMap.put(flight2.getArrivalAirport(), true);

        if (hashMap.get(destination) != null ) {

            return true;
        }else {

            throw new RouteNotFoundException("Flight was not found");
        }


    }
}

