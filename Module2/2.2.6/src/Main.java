import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
1 1 1 ... 1 1 1
0 1 1 ... 1 1 0
0 0 1 ... 1 0 0
...............
0 1 1 ... 1 1 0
1 1 1 ... 1 1 1
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input even n:");
            int n = in.nextInt();
            while (n <= 0 && n%2 != 0){
                System.out.println("Input another n");
                n = in.nextInt();
            }
            int [][]a = new int[n][n];
            for (int i = 0; i < n/2; ++i){
                for (int j = i; j < n/2; ++j) {
                    a[i][j] = 1;
                    a[i][n - 1 - j] = 1;
                    a[n - 1 - i][j] = 1;
                    a[n - 1 - i][n - 1 - j] = 1;

                }
            }
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
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