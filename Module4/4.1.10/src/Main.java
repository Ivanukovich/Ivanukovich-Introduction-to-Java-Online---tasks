import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
Создать класс Airline.
Определить конструкторы, set- и get- методы и метод toString().
Создать 2ой класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерий выбора данных и вывести эти данные на консоль.

Customer: id, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.
Найти и вывести:
a) список рейсов для заданного назначения
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */


public class Main {
    static SimpleDateFormat format = new SimpleDateFormat("hh:mm");
    public static void main(String[] args) throws ParseException {
        Airline[]array = new Airline[1];
        Scanner in = new Scanner(System.in);
        String destanation;
        int flight;
        String type;
        String time;
        int dayOfWeek;
        for (int i = 0; i < 1; ++i){
            System.out.println("destanation");
            destanation = in.nextLine();
            System.out.println("flight");
            flight = in.nextInt();
            in.nextLine();
            System.out.println("type");
            type = in.nextLine();
            System.out.println("time");
            time = in.nextLine();
            while (!isValidDate(time)){
                System.out.println("wrong number");
                time = in.nextLine();
            }
            System.out.println("dayOfWeek");
            dayOfWeek = in.nextInt();
            array[i] = new Airline(destanation, flight, type, time, dayOfWeek);
            System.out.println(array[i].toString());
        }
        AirlineControl ac = new AirlineControl(array);
        System.out.println("search1");
        String search;
        in.nextLine();
        search = in.nextLine();
        ac.getByDestanation(search);
        System.out.println("search2");
        dayOfWeek = in.nextInt();
        ac.getByDayOfWeek(dayOfWeek);
        System.out.println("search3");
        in.nextLine();
        time = in.nextLine();
        while (!isValidDate(time)){
            System.out.println("wrong number");
            time = in.nextLine();
        }
        ac.getByDayOfWeekTime(dayOfWeek, format.parse(time));
    }
    static boolean isValidDate(String input) {
        try {
            format.parse(input);
            return true;
        }
        catch (ParseException e) {
            return false;
        }
    }
}