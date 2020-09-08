public class City {
    String name;
    District[] districts;
    City(String name, District[] districts){
        this.name = name;
        this.districts = districts;
    }
    public String getName() {
        return name;
    }
}
