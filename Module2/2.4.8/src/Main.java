import java.util.Scanner;

/*
Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
Пояснение. Составить метод (методы) для вычисления суммы трёх последовательно расположенных элементов массива
с номерами от k до m.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input size:");
            int n = sc.nextInt();
            while ( n < 6){
                System.out.println("Input size:");
                n = sc.nextInt();
            }
            double []D = new double[n];
            System.out.println("Input elements:");
            for (int i = 0; i < n; ++i){
                D[i] = sc.nextDouble();
            }
            System.out.println("Result:");
            System.out.println(sum(1, 3, D ,n));
            System.out.println(sum(3, 5, D ,n));
            System.out.println(sum(4, 6, D ,n));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static double sum (int k, int m, double[] array, double size){
        double sum = 0;
        for (int i = k - 1; i < Math.min(size, m); ++i){
            sum += array[i];
        }
        return sum;
    }
}