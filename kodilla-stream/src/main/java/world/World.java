package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents;

    public BigDecimal getPeopleQuantity() {

        BigDecimal bigDecimal = continents.stream().flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, BigDecimal::add);
        return  bigDecimal;


    }

    public World(List<Continent> continents) {
        this.continents = new ArrayList<>();
    }

    public List<Continent> getContinents() {
        return continents;
    }

}
