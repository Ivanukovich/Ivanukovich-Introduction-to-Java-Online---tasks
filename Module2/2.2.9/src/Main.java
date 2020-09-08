import java.util.Scanner;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
содержит максимальную сумму.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int n = in.nextInt();
            while (n <= 0){
                System.out.println("Input another N");
                n = in.nextInt();
            }
            System.out.println("Input M:");
            int m = in.nextInt();
            while (m <= 0){
                System.out.println("Input another M");
                m = in.nextInt();
            }
            double [][]a = new double[n][m];
            System.out.println("Input matrix:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.println((i + 1) + " " + (j + 1) + ":");
                    a[i][j] = in.nextDouble();
                    while ( a[i][j] < 0){
                        System.out.println("Input another " + (i + 1) + " " + (j + 1) + ":");
                        a[i][j] = in.nextDouble();
                    }
                }
            }
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            double[] sum = new double[m];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    sum[j] += a[i][j];
                }
            }
            int max = 0;
            System.out.println("Result:");
            for (int j = 0; j < m; ++j) {
                if (sum[j] > sum[max]){
                    max = j;
                }
                System.out.print(sum[j] + " ");
            }
            System.out.println("The biggest sum is in " + (max + 1) + " colom, and it is " + sum[max]);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}