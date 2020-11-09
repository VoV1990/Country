import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String nameOfCountry = "Belarus";
        City capitalCity = new City("Minsk");
        double area = 207600.0;
        Country belarus = new Country(nameOfCountry, capitalCity, area);
        List<Region> regions = new ArrayList<>();
        regions.add(new Region("Brest region", new City("Brest")));
        regions.add(new Region("Vitebsk region", new City("Vitebsk")));
        regions.add(new Region("Gomel region", new City("Gomel")));
        regions.add(new Region("Grodno region", new City("Grodno")));
        regions.add(new Region("Minsk region", new City("Minsk")));
        regions.add(new Region("Mogilev region", new City("Mogilev")));

        belarus.setRegions(regions);

        belarus.printCapitalCity();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegionalCenters();
    }
}
