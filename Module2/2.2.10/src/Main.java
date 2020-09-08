import java.util.Scanner;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
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
            double [][]a = new double[n][n];
            System.out.println("Input matrix:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
                    System.out.println((i + 1) + " " + (j + 1) + ":");
                    a[i][j] = in.nextDouble();
                }
            }
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Positive elements on main diagonal:");

            for (int i = 0; i < n; ++i){
                if (a[i][i] > 0) {
                    System.out.println(a[i][i]);
                }
            }

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}