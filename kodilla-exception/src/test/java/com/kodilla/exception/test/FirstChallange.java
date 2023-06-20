package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        try {
            FirstChallange firstChallange = new FirstChallange();
            double result = firstChallange.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("You cant divide by 0 " + e);
        } finally {
          System.out.println(" :) ");
        }

    }
}