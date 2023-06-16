package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given



        int[] numbers = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};



        //When

        double result = ArrayOperations.getAverage(numbers);

        //Then

        Assertions.assertEquals(5.5, result,0.1);


    }
}

