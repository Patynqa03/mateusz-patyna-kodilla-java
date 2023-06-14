package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents;

    public BigDecimal getPeopleQuantity() {

        BigDecimal bigDecimal = continents.stream().flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, ((bigDecimal1, bigDecimal2) -> bigDecimal1 = bigDecimal1.add(bigDecimal2)));
        return  bigDecimal;


    }

    public World(List<Continent> continents) {
        this.continents = new ArrayList<>();
    }

    public List<Continent> getContinents() {
        return continents;
    }

}
