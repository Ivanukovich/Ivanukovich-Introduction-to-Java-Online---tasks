import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)
1   2   3  ... n
n  n-1 n-2 ... 1
1   2   3  ... n
n  n-1 n-2 ... 1
................
n  n-1 n-2 ... 1
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input even n:");
            int n = in.nextInt();
            while (n <= 0 || n%2 != 0){
                System.out.println("Input another n");
                n = in.nextInt();
            }
            int [][]a = new int[n][n];
            for (int i = 0; i < n/2; ++i){
                for (int j = 0; j < n; ++j) {
                    a[2 * i][j] = j + 1;
                    a[2 * i + 1][j] = n - j;
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