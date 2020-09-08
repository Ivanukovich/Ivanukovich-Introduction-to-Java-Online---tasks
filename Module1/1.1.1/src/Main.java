import java.util.Scanner;

/*
найдите значение функции z = ((a-3)*b/2)+c
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
            double z = ((a - 3) * b / 2) + c;
            System.out.println("Result: " + z);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
