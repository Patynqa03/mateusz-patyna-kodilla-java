package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent {

    private String continentName;

    private List<Country> countryList;

public void addCountry(Country country) {

    countryList.add(country);
}

    public Continent(String continentName, List<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!Objects.equals(continentName, continent.continentName))
            return false;
        return Objects.equals(countryList, continent.countryList);
    }

    @Override
    public int hashCode() {
        int result = continentName != null ? continentName.hashCode() : 0;
        result = 31 * result + (countryList != null ? countryList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}
