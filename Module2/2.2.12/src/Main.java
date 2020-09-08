import java.util.Scanner;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
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
                }
            }
            output(a, n, m);
            for (int i = 0; i < n; ++i){
                sortAscending(a, m, i);
            }
            System.out.println("Sorted by Ascending");
            output(a, n, m);
            for (int i = 0; i < n; ++i){
                sortDescending(a, m, i);
            }
            System.out.println("Sorted by Descending");
            output(a, n, m);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void sortAscending (double[][]matrix, int m, int i){
        double save;
        for (int j = 1; j < m; ++j){
            for (int k = 1; k < m; ++k){
                if(matrix[i][k - 1] > matrix[i][k]){
                    save = matrix[i][k];
                    matrix[i][k] = matrix[i][k - 1];
                    matrix[i][k - 1] = save;
                }
            }
        }
    }
    static void sortDescending (double[][]matrix, int m, int i){
        double save;
        for (int j = 1; j < m; ++j){
            for (int k = 1; k < m; ++k){
                if(matrix[i][k - 1] < matrix[i][k]){
                    save = matrix[i][k];
                    matrix[i][k] = matrix[i][k - 1];
                    matrix[i][k - 1] = save;
                }
            }
        }
    }
    static void output (double[][]a, int n, int m){
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < m; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
