import java.util.Scanner;

/*
Даны 2 угла треугольника в градусах. Опредилить, существует ли такой треугольник и если да, то прямоугольный ли он.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input first angle");
            double angle1 = in.nextDouble();
            System.out.println("Input second angle");
            double angle2 = in.nextDouble();
            if (angle1 + angle2 < 180 && angle1 > 0 && angle2 > 0){
                if (angle1 + angle2 == 90 || angle1 == 90 || angle2 == 90){
                    System.out.println("Triangle exists, rectangular");
                }
                else {
                    System.out.println("Triangle exisst, not rectangular");
                }
            }
            else{
                System.out.println("Triangle doesn't exist");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
