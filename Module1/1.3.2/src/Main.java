import java.util.Scanner;

/*
Вычислить значения функции на отрезке [a,b] с шагом h
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a:");
            double a = in.nextDouble();
            System.out.println("Input b:");
            double b = in.nextDouble();
            System.out.println("Input h:");
            double h = in.nextDouble();
            int counter = 0;
            while (a + counter * h <= b){
                System.out.println("In " + (a + counter * h) + " Result: " + y(a + counter * h));
                ++counter;
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static double y (double x){
        if (x > 2){
            return x;
        }
        else {
            return -x;
        }
    }
}