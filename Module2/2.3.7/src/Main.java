import java.util.Scanner;

/*
Пуссть даны 2 неубывающие последовательности действительных чисел ai и bi.
Требуется указать те места, на которые нужно вставлять элементы последовательности bi в первую последовательность
так, чтобы новая последовательность оставалась возрастающей.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int n = in.nextInt();
            while (n <= 0) {
                System.out.println("Input another N");
                n = in.nextInt();
            }
            int[]a = new int[n];
            System.out.println("Input array1:");
            for (int i = 0; i < n; ++i){
                System.out.println(i + 1);
                a[i] = in.nextInt();
            }
            System.out.println("Input N:");
            int m = in.nextInt();
            while (m <= 0) {
                System.out.println("Input another N");
                m = in.nextInt();
            }
            int[]b = new int[m];
            System.out.println("Input array1:");
            for (int i = 0; i < m; ++i){
                System.out.println(i + 1);
                b[i] = in.nextInt();
            }
            System.out.println("Result");
            ArrayMerger am = new ArrayMerger();
            am.getIndexes(a, b, n, m);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}