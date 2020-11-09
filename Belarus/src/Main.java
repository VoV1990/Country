public class Main {
    public static void main(String[] args) {
        String nameOfCountry = "Belarus";
        City capitalCity = new City("Minsk");
        double area = 207600.0;
        Region[] regions = new Region[]{new Region("Brest region", new City("Brest")),
                new Region("Vitebsk region", new City("Vitebsk")),
                new Region("Gomel region", new City("Gomel")),
                new Region("Grodno region", new City("Grodno")),
                new Region("Minsk region", new City("Minsk")),
                new Region("Mogilev region", new City("Mogilev"))};
        Country belarus = new Country(nameOfCountry, capitalCity, area, regions);

        belarus.printCapitalCity();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegionalCenters();
    }
}
