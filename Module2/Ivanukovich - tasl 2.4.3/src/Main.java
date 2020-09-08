import java.util.Scanner;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления
площади треугольника.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a:");
            int a = in.nextInt();
            while (a <= 0) {
                System.out.println("Input another a");
                a = in.nextInt();
            }
            double S = 6 * (Math.sqrt(3)/4 * Math.pow(a, 2));
            System.out.println("Result :\nS: " + S);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}