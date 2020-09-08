import java.util.Scanner;

/*
Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путёвки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т.д.) для оптимального выбора.
Учитывать возможность выбора транспорта и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Travel[] travels = new Travel[5];
        for (int i = 0; i < 5; ++i){
            travels[i] = inputTravel();
        }
        TravelAgency ta = new TravelAgency(travels);
        ta.sortByDays();
        ta.outPut();
        ta.sortByType();
        ta.outPut();
        ta.sortByWay();
        ta.outPut();
    }
    static Travel inputTravel(){
        Scanner in = new Scanner(System.in);
        int type;
        System.out.println("1 for Rest");
        System.out.println("2 for Excursion");
        System.out.println("3 for Healing");
        System.out.println("4 for Shopping");
        System.out.println("5 for Cruise");
        type = in.nextInt();
        while (type < 1 || type > 5){
            System.out.print("input from 1 to 5");
            type = in.nextInt();
        }
        int way;
        System.out.println("1 for train");
        System.out.println("2 for plane");
        System.out.println("3 for bus");
        way = in.nextInt();
        while (way < 1 || way > 3){
            System.out.print("input from 1 to 3");
            way = in.nextInt();
        }
        boolean food;
        System.out.print("food");
        food = in.nextBoolean();
        int days;
        System.out.print("Days:");
        days = in.nextInt();
        return new Travel(type, way, food, days);
    }
}