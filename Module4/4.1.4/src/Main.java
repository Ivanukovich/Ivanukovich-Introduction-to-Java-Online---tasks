import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    static SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Train []t = new Train[5];
            int number;
            String destanation;
            String time;
            for (int i = 0; i < 5; ++i){
                System.out.println("input number:");
                number = in.nextInt();
                while (number < 1){
                    number = in.nextInt();
                }
                System.out.println("input destanation:");
                in.nextLine();
                destanation = in.nextLine();
                System.out.println("input time:");
                time = in.nextLine();
                while (!isValidDate(time)){
                    System.out.println("wrong number");
                    time = in.nextLine();
                }
                t[i] = new Train(destanation, number, time);
                t[i].showInfo();
            }
            searchByNumber(5, t);
            for (int i = 0; i < 5; ++i){
                t[i].showInfo();
            }
            sortByDestanation(t);
            System.out.println("after sort1");
            for (int i = 0; i < 5; ++i){
                t[i].showInfo();
            }
            sortByNumber(t);
            System.out.println("after sort2");
            for (int i = 0; i < 5; ++i){
                t[i].showInfo();
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }
    static void sortByNumber(Train[]array){
        Train save;
        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - 1; ++j){
                if (array[j].number > array[j + 1].number){
                    save = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = save;
                }
            }
        }
    }
    static void sortByDestanation(Train[]array){
        Train save;
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - 1; ++j) {
                if (array[j].compare(array[j + 1])) {
                    save = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = save;
                }
            }
        }
    }
    static void searchByNumber (int number, Train[]array){
        for (int i = 0; i < array.length; ++i){
            if (array[i].getNumber() == number){
                array[i].showInfo();
            }
        }
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