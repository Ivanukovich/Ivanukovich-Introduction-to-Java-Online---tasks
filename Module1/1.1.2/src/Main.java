import java.util.Scanner;

/*
(b + √​(b^2 + 4ac))/2a - a^3*c + b^-2
*/

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a");
            double a = in.nextDouble();
            System.out.println("Input b");
            double b = in.nextDouble();
            System.out.println("Input c");
            double c = in.nextDouble();
            double z = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, - 2);
            System.out.println("Result: " + z);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
