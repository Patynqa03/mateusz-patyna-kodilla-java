package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {


    Integer a[] = new Integer[] { 0, 2, 4, 6 };
    List<Integer> list = Arrays.asList(a);

    @DisplayName("Testing OddNumbersExterminator while empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        System.out.println("Testing OddNumbersExterminatorEmptyList");

        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = new ArrayList<>();
        //Then
        Assertions.assertEquals(result, oddNumbersExterminator.exterminate(numbers));
    }

    @DisplayName("Testing OddNumbersExterminator while provided Integer values")

    @Test
    void testOddNumbersExterminatorNormalList() {

        System.out.println("Testing OddNumbersExterminatorNormalList");

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);


        //When
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(2);
        result.add(4);
        result.add(6);

        //Then
        Assertions.assertEquals(list, oddNumbersExterminator.exterminate(numbers));

    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
}
