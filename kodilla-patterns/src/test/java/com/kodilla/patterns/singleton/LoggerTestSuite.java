package com.kodilla.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;
    @Test
    void getLastLog(){
        logger = Logger.INSTANCE;
        logger.log("123456789");

        String logToCheck = logger.getLastLog();

        assertEquals(logToCheck,"123456789");
    }
}
