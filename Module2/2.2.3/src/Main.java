import java.util.Scanner;
/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input n:");
            int n = in.nextInt();
            System.out.println("Input m:");
            int m = in.nextInt();
            while (n <= 0){
                System.out.println("Input another n");
                n = in.nextInt();
            }
            int [][]a = new int[n][m];
            System.out.println("Input matrix:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.println((i + 1) + " " + (j + 1) + ":");
                    a[i][j] = in.nextInt();
                }
            }
            System.out.println("Input k:");
            int k = in.nextInt();
            System.out.println("Input p:");
            int p = in.nextInt();
            System.out.println("Result:\nk:");
            for (int i = 0; i < n; ++i){
                System.out.println(a[k - 1][i]);
            }
            System.out.println("p:");
            for (int i = 0; i < m; ++i){
                System.out.println(a[i][p-1]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}