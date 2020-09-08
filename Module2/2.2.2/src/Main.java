import java.util.Scanner;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input n:");
            int n = in.nextInt();
            while (n <= 0){
                System.out.println("Input another n");
                n = in.nextInt();
            }
            int [][]a = new int[n][n];
            System.out.println("Input matrix:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
                    System.out.println((i + 1) + " " + (j + 1) + ":");
                    a[i][j] = in.nextInt();
                }
            }
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
               System.out.println(a[i][i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}