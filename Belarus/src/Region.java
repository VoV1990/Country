import java.util.ArrayList;
import java.util.List;

public class Region {
    private String nameOfRegion;
    private List<District> districts;
    private City mainCity;

    public Region(String nameOfRegion, City mainCity) {
        this.nameOfRegion = nameOfRegion;
        this.mainCity = mainCity;
        districts = new ArrayList<>();
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity(City mainCity) {
        this.mainCity = mainCity;
    }
}
