package com.kodilla.spring.portfolio;

public class Fibonacci {

    private int number;

    public int algorytm(int number) {

        int temp = 0;
        int temp2 = 1;
        int temp3 = 0;


        for(int i = 0; i < number;i++) {


            temp3 = temp + temp2;
            temp = temp2;
            temp2 = temp3;

        }
return temp3;
    }
}
