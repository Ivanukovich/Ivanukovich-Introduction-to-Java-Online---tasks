import java.util.Scanner;

/*
Заданы 2 одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) -м элементами
первого, при этом не используя дополнительный массив.
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
            System.out.println("Input M:");
            int m = in.nextInt();
            while (m <= 0) {
                System.out.println("Input another M");
                m = in.nextInt();
            }
            int[]a = new int[n + m];
            int[]b = new int[m];
            System.out.println("Input array1:");
            for (int i = 0; i < n; ++i){
                a[i] = in.nextInt();
            }
            System.out.println("Input array2:");
            for (int i = 0; i < m; ++i){
                b[i] = in.nextInt();
            }
            System.out.println("Input k:");
            int k = in.nextInt();
            while (k <= 0 || k > n) {
                System.out.println("Input another k");
                k = in.nextInt();
            }
            for (int i = 0; i < n - k; ++i){
                a[n + m - i - 1] = a[n - 1 - i];
            }
            for (int i = 0; i < m; ++i){
                a[k + i] = b[i];
            }
            for (int i = 0; i < m + n; ++i){
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}