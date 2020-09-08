import java.util.Scanner;

/*
Дана матрица. Вывести на экран все нечентные столбцы, у которых элемент больше последнего.
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
            System.out.println("Result:");
            for (int i = 0; i < n; i += 2){
                if (a[i][0] > a[i][m - 1]){
                    System.out.println((i + 1) + ":");
                    for (int j = 0; j < m; ++j){
                        System.out.println(a[i][j]);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}