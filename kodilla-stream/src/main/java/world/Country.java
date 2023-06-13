package world;
import java.math.BigDecimal;
import java.util.Objects;

public class Country {

   private String countryName;
   private BigDecimal countryPepoleCount;



    public BigDecimal getPeopleQuantity() {

        return countryPepoleCount;

    }





    public Country(String countryName, BigDecimal countryPepoleCount) {
        this.countryName = countryName;
        this.countryPepoleCount = countryPepoleCount;
    }

    public String getCountryName() {
        return countryName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!Objects.equals(countryName, country.countryName)) return false;
        return Objects.equals(countryPepoleCount, country.countryPepoleCount);
    }

    @Override
    public int hashCode() {
        int result = countryName != null ? countryName.hashCode() : 0;
        result = 31 * result + (countryPepoleCount != null ? countryPepoleCount.hashCode() : 0);
        return result;
    }

    @Override
    public String
    toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryPepoleCount=" + countryPepoleCount +
                '}';
    }
}
