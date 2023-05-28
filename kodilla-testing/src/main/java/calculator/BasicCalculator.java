package com.kodilla.testing.calculator;

public class BasicCalculator {

    private int a;
    private int b;

    public int addAtoB() {

        return a+b;
    }

    public int subAfromB() {

        return b-a;
    }

    public BasicCalculator(int a,int b) {
        this.a = a;
        this.b = b;
    }



    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}
