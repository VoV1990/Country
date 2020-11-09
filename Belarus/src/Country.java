//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;
import java.util.List;

public class Country {
    private List<Region> regions;
    private String nameOfCountry;
    private double area;
    City capitalCity;

    public Country() {
        this.regions = new ArrayList<>();
    }

    public Country(String nameOfCountry, City capitalCity, double area) {
        this.nameOfCountry = nameOfCountry;
        this.capitalCity = capitalCity;
        this.area = area;
        this.regions = new ArrayList<>();
    }

    public void printCapitalCity() {
        System.out.println("The capital city of " + nameOfCountry + " is: " + capitalCity.getNameOfCity());
    }

    public void printNumberOfRegions() {
        System.out.println("Number of regions: " + regions.size());
    }

    public void printArea() {
        System.out.println("The area of " + nameOfCountry + ": " + area + " km²");
    }

    public void printRegionalCenters() {
        System.out.println("Regional centers:");
        for (Region region : regions)
            System.out.println(region.getMainCity().getNameOfCity());
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(City capitalCity) {
        this.capitalCity = capitalCity;
    }
}
