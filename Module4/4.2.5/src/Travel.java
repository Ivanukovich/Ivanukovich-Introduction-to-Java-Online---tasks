public class Travel {
    int type;
    int way;
    boolean food;
    int days;
    Travel (int type, int way, boolean food, int days){
        this.type = type;
        this.way = way;
        this.food = food;
        this.days = days;
    }
    void output(){
        if (type == 1){
            System.out.println("Rest");
        }
        if (type == 2){
            System.out.println("Excursion");
        }
        if (type == 3){
            System.out.println("Healing");
        }
        if (type == 4){
            System.out.println("Shopping");
        }
        if (type == 5){
            System.out.println("Cruise");
        }
        if (way == 1){
            System.out.print(" train");
        }
        if (way == 2){
            System.out.print(" plain");
        }
        if (way == 3){
            System.out.print(" bus");
        }
        if (food){
            System.out.print(" food included ");
        }
        else {
            System.out.print(" food is not included ");
        }
        System.out.print(days + " days\n");
    }
    int getType(){
        return type;
    }
    int getWay(){
        return way;
    }
    boolean getFood(){
        return food;
    }
    int getDays(){
        return days;
    }
}
