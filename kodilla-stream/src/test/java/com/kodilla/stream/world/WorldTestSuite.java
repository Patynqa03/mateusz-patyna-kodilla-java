package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import world.Continent;
import world.Country;
import world.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent continent1 = new Continent("Continent1",new ArrayList<>());

        continent1.addCountry(new Country("Ameryka", new BigDecimal("1")));
        continent1.addCountry(new  Country("Kanada", new BigDecimal("2")));

        Continent continent2 = new Continent("Continent2",new ArrayList<>());

        continent2.addCountry(new Country("Polska", new BigDecimal("3")));
        continent2.addCountry(new Country("Niemcy", new BigDecimal("4")));

        Continent continent3 = new Continent("Continent3",new ArrayList<>());

        continent3.addCountry(new Country("Rosja", new BigDecimal("5")));
        continent3.addCountry(new Country("Japonia", new BigDecimal("6")));

        List<Continent> world = new ArrayList<>();
        world.add(continent1);
        world.add(continent2);
        world.add(continent3);


        //When

        BigDecimal totalPopulation = new BigDecimal("21");
        World world1 = new World(world);
        //Then
        Assertions.assertEquals(totalPopulation,world1.getPeopleQuantity());
    }
}
