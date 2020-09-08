import java.util.Scanner;

/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
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
            for (int j = 0; j < m; ++j){
                sortAscending(a, n, j);
            }
            System.out.println("Sorted by Ascending");
            output(a, n, m);
            for (int j = 0; j < m; ++j){
                sortDescending(a, n, j);
            }
            System.out.println("Sorted by Descending");
            output(a, n, m);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void sortAscending (double[][]matrix, int n, int j){
        double save;
        for (int i = 1; i < n; ++i){
            for (int k = 1; k < n; ++k){
                if(matrix[k - 1][j] > matrix[k][j]){
                    save = matrix[k][j];
                    matrix[k][j] = matrix[k - 1][j];
                    matrix[k - 1][j] = save;
                }
            }
        }
    }
    static void sortDescending (double[][]matrix, int n, int j){
        double save;
        for (int i = 1; i < n; ++i){
            for (int k = 1; k < n; ++k){
                if(matrix[k - 1][j] < matrix[k][j]){
                    save = matrix[k][j];
                    matrix[k][j] = matrix[k - 1][j];
                    matrix[k - 1][j] = save;
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
