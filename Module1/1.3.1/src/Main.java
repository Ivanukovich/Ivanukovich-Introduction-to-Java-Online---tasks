import java.util.Scanner;

/*
Вводится  любое целое полжительное число, а программа суммирует все числа от 1 до введённого числа.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input x:");
            int x = in.nextInt();
            while (x <= 0){
                System.out.println("Input another value");
                x = in.nextInt();
            }
            int result = 0;
            for (int i = 1; i <= x; ++i){
                result += i;
            }
            System.out.println("Result: " + result);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}