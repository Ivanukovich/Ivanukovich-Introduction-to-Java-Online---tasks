import java.util.Scanner;

/*
Создать объект класса Автомобиль, использую классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Wheel[] wheels = new Wheel[4];
        String mark;
        for (int i = 0; i < 4; ++i){
            mark = in.nextLine();
            wheels[i] = new Wheel(mark);
        }
        mark = in.nextLine();
        Wheel newWheel = new Wheel(mark);
        mark = in.nextLine();
        Engine engine = new Engine(0.1, mark);
        mark = in.nextLine();
        Car car = new Car(wheels, engine,mark, 50);
        car.refueling(50);
        car.printMark();
        System.out.println(car.drive(5));
        System.out.println(car.drive(5));
        car.changeWheel(3, newWheel);
        car.printMark();
    }
}