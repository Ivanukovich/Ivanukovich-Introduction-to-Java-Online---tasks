import java.util.Scanner;

/*
Заданы размеры A, B прямоугольного отверстия и заданы размеры x, y, z кирпича.
Определить, пройлёт ли кирпич через отверстие.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input A:");
            double A = in.nextDouble();
            System.out.println("Input B:");
            double B = in.nextDouble();
            System.out.println("Input x:");
            double x = in.nextDouble();
            System.out.println("Input y:");
            double y = in.nextDouble();
            System.out.println("Input z:");
            double z = in.nextDouble();
            if ((A >= x && B >= y)||(A >= y && B >= x)||(A >= x && B >= z)||(A >= z && B >= x)||(A >= z && B >= y)||(A >= y && B >= z)){
                System.out.println("will pass");
            }
            else{
                System.out.println("won't pass");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}