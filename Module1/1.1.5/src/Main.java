import java.util.Scanner;

/*
Дано натуральное число T, которое представляет время в секундах.
Вывести данное значение в формате чч.мм.cc
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input time in seconds:");
            int secondsTotal = in.nextInt();
            int hours = secondsTotal/3600;
            int minutes = secondsTotal%3600/60;
            int seconds = secondsTotal - hours * 3600 - minutes * 60;
            System.out.println(hours + "ч " + minutes + "м " + seconds + "с");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
