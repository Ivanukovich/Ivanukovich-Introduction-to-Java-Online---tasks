public class Country {
    City capital;
    Region[] regions;
    double size;
    Country(int capital, int capitalRegion, Region[]regions){
        size = 0;
        this.regions = regions;
        this.capital = regions[capitalRegion].getCity(capital);
        for (int i = 0; i < regions.length; ++i){
            size += regions[i].getSize();
        }
    }
    void printCapital(){
        System.out.println(capital.getName());
    }
    void printSize(){
        System.out.println(size);
    }
    void printNumberOfRegions(){
        System.out.println(regions.length);
    }
    void printRegionCenters(){
        for (int i = 0; i < regions.length; ++i){
            System.out.println(regions[i].getRegionCity());
        }
    }
}
