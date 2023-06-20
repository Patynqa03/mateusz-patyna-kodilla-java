package com.kodilla.exception.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class probablyIWillThrowException {

    //(x >= 2 || x < 1 || y == 1.5)
    @Test
    void TestingChall2WithNoValueProvided() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,0));
    }

    @Test
    void TestingChall2() throws Exception {

        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 1.5));

    }


    }
