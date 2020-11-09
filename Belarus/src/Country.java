//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

public class Country {
    private Region[]regions;
    private String nameOfCountry;
    private double area;
    City capitalCity;

    public Country() {

    }

    public Country(String nameOfCountry, City capitalCity, double area, Region...regions) {
        this.nameOfCountry = nameOfCountry;
        this.capitalCity = capitalCity;
        this.area = area;
        this.regions = regions;
    }

    public void printCapitalCity() {
        System.out.println("The capital city of " + nameOfCountry + " is: " + capitalCity.getNameOfCity());
    }

    public void printNumberOfRegions() {
        System.out.println("Number of regions: " + regions.length);
    }

    public void printArea() {
        System.out.println("The area of " + nameOfCountry + ": " + area + " km²");
    }

    public void printRegionalCenters() {
        System.out.println("Regional centers:");
        for (Region region : regions)
            System.out.println(region.getMainCity().getNameOfCity());
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
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
