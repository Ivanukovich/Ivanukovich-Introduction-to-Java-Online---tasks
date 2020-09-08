public class Region {
    City regionCity;
    City[] cities;
    double size;
    Region(int capital, City[] cities, double size){
        this.regionCity = cities[capital];
        this.cities = cities;
        this.size = size;
    }
    double getSize(){
        return size;
    }
    City getCity(int index){
        return cities[index];
    }
    City getRegionCity(){
        return regionCity;
    }
}
