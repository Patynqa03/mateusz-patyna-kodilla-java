package com.kodilla.exception.test;

import java.util.Date;
import java.util.Scanner;

public class FlightMain {

    public static void main(String[] args) throws RouteNotFoundException {


        FlightProcessor flightProcessor = new FlightProcessor();
        String temp = "Holandia";

        try {
            flightProcessor.findFlight(temp);
            System.out.println("Znalezlismy lot w kierunku ''" + temp + "'' zachęcamy do zapoznania się z oferta");
        }catch (RouteNotFoundException o) {

            System.out.println("Niestety nie oferujemy lotów w kierunku ''" + temp + "'' " );
        } finally {
            System.out.println("Dziekujemy za skorzystanie z naszych uslug");
        }



    }
}
