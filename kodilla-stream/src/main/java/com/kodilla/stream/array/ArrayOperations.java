package com.kodilla.stream.array;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

   public static double getAverage(int[] numbers) {

      IntStream.range(numbers[0], numbers.length).forEach(System.out::println);
      double result = IntStream.range(numbers[0], numbers.length).average().getAsDouble();

      return result;
   }

}
