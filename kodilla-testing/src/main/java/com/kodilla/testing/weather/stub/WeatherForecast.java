package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAvrage() {

        double result = 0;

        for (Map.Entry<String, Double> temperature :temperatures.getTemperatures().entrySet()) {

            result = result + temperature.getValue();
        }

        result = result/temperatures.getTemperatures().size();
    return result;

    }

    public double calculateMedian() {     // Problem z tym elementem zadania.

        List<Double> theList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :temperatures.getTemperatures().entrySet()) {

            theList.add(temperature.getValue());

        }

        Collections.sort(theList);

        double median = 0;
        int size = theList.size();

        if (size % 2 == 0) {
            int middleIndex = size / 2;
            double num1 = theList.get(middleIndex - 1);
            double num2 = theList.get(middleIndex);
            median = (double) (num1 + num2) / 2;
        } else {
            int middleIndex = size / 2;
            median = theList.get(middleIndex);
        }

        return median;
    }

}
