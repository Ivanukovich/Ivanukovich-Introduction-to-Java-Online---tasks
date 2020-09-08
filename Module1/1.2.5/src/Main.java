import java.util.Scanner;

/*
Вычислить значение функции
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input x:");
            double x = in.nextDouble();
            double F;
            if (x <= 3){
                F = Math.pow(x, 2) - 3 * x + 9;
            }
            else {
                F =   1/(Math.pow(x, 3) + 6);
            }
            System.out.println("Result: " + F);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}