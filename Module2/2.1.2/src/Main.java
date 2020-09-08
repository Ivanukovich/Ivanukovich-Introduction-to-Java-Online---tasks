import java.util.Scanner;

/*
Дана последовательность действительных чисел a1, a2, ... , an. Заменить все ее члены,
больше данного Z, этим числом. Подсчитать количество замен.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input n:");
            int n = in.nextInt();
            double []a = new double[n];
            System.out.println("Input array:");
            for (int i = 0; i < n; ++i){
                System.out.println((i + 1) + ":");
                a[i] = in.nextDouble();
            }
            System.out.println("Input Z:");
            double Z = in.nextDouble();
            int counter = 0;
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
                if (a[i] > Z){
                    a[i] = Z;
                    ++counter;
                }
                System.out.println(a[i]);
            }
            System.out.println(counter + " replacement(s)");

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}