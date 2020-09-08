import java.util.Scanner;

/*
Создать объект класса Государство, использую классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, мплощадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Region[] regions = new Region[2];
        City[] cities = new City[2];
        int capital;
        int capitalRegion;
        District[] districts = new District[2];
        String name;
        int size;
        for (int i = 0; i < 2; ++i){
            for (int j = 0; j < 2; ++j){
                for (int k = 0; k < 2; ++k){
                    System.out.println("input district name");
                    name = in.nextLine();
                    districts[k] = new District(name);
                }
                System.out.println("input city name");
                name = in.nextLine();
                cities[j] = new City(name, districts);
                districts = new District[2];
            }
            System.out.println("input capital");
            capital = in.nextInt();
            System.out.println("input size");
            size = in.nextInt();
            in.nextLine();
            regions[i] = new Region(capital, cities, size);
            cities = new City[2];
        }
        System.out.println("input capital region");
        capitalRegion = in.nextInt();
        System.out.println("input capital");
        capital = in.nextInt();
        Country country = new Country(capital, capitalRegion, regions);
        country.printCapital();
        country.printNumberOfRegions();
        country.printRegionCenters();
        country.printSize();
    }
}