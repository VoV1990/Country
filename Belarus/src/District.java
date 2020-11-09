import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class District {
    String nameOfDistrict;
    private List<City> cities = new ArrayList<>();

    public District(String nameOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
    }

    public District(String nameOfDistrict, City...cities) {
        this.nameOfDistrict = nameOfDistrict;
        this.cities.addAll(Arrays.asList(cities));
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public String getNameOfDistrict() {
        return nameOfDistrict;
    }

    public void setNameOfDistrict(String nameOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return nameOfDistrict + " district";
    }
}
