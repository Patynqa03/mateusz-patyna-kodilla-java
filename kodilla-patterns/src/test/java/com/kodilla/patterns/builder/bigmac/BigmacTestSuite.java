package com.kodilla.patterns.builder.bigmac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void BigmacTestSuite() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun("Sezam")
                .Ingredients("Cheese")
                .Ingredients("Salad")
                .Burgers("7")
                .Sauce("BBQ")
                .build();

            assertEquals("7",bigmac.getBurgers());
    }
}
