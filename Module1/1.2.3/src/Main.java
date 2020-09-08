import java.util.Scanner;

/*
Даны 3 точки: A(x1,y1), B(x2, y2), C(x3, y3). Определить, лежат ли они на одной прямой
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input x1:");
            double x1 = in.nextDouble();
            System.out.println("Input y1:");
            double y1 = in.nextDouble();
            System.out.println("Input x2:");
            double x2 = in.nextDouble();
            System.out.println("Input y2:");
            double y2 = in.nextDouble();
            System.out.println("Input x3:");
            double x3 = in.nextDouble();
            System.out.println("Input y3:");
            double y3 = in.nextDouble();
            if ((x2 - x1)/(x3 - x2) == (y2 - y1)/(y3 - y2)||(x1 == x2 && x2 == x3)||(y1 == y2 && y2 == y3)){
                System.out.println("points are located on one line");
            }
            else{
                System.out.println("points are not located on one line");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}