import java.util.Scanner;

/*
(sin x + cos y)/(cos x - sin y) * tg(x*y)
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input x:");
            double x = in.nextDouble();
            System.out.println("Input y:");
            double y = in.nextDouble();
            while (Math.cos(x) - Math.sin(y) == 0){
                System.out.println("Input another x:");
                x = in.nextDouble();
                System.out.println("Input another y:");
                y = in.nextDouble();
            }
            double z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
            System.out.println("Result: " + z);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
