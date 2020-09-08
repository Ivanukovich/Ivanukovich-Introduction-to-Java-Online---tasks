import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка N по правилу:
A[I, J] = sin((I^2 - J^2)/N)
и подсчитать количество положительных элементов в ней.
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
            double [][]a = new double[n][ n];
            int count = 0;
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
                    a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/n);
                    if (a[i][j] > 0){
                        ++count;
                    }
                }
            }
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(count + " positive elements");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}