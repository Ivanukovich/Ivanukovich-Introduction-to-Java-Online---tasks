import java.util.Scanner;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
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
            int [][]a = new int[n][m];
            System.out.println("Input matrix:");
            int max = a[0][0];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.println((i + 1) + " " + (j + 1) + ":");
                    a[i][j] = in.nextInt();
                    if (max < a[i][j]){
                        max = a[i][j];
                    }
                }
            }
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    if (a[i][j] % 2 == 1){
                        a[i][j] = max;
                    }
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
