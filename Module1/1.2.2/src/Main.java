import java.util.Scanner;

/*
найти max(min(a,b),min(c,d))
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a:");
            double a = in.nextDouble();
            System.out.println("Input b:");
            double b = in.nextDouble();
            System.out.println("Input c:");
            double c = in.nextDouble();
            System.out.println("Input d:");
            double d = in.nextDouble();
            System.out.println("Result: " + Math.max(Math.min(a, b), Math.min(c, d)));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
