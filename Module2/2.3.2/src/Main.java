import java.util.Scanner;

/*
Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать их них новую
последовательность чисел так, чтобы она тоже была неубывающей.
Примечание. Дополнительный массив не создавать.
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
                System.out.println(i + " :");
                a[i] = in.nextInt();
                if (i > 0){
                    while (a[i] < a[i-1]){
                        System.out.println("input another number");
                        a[i] = in.nextInt();
                    }
                }
            }
            System.out.println("Input array2:");
            for (int i = 0; i < m; ++i){
                System.out.println(i + " :");
                b[i] = in.nextInt();
                if (i > 0){
                    while (b[i] < b[i-1]){
                        System.out.println("input another number");
                        b[i] = in.nextInt();
                    }
                }
            }
            for (int i = 0; i < m; ++i){
               a[n + i] = b[i];
            }
            sort(a, n + m);
            System.out.println("result");
            for (int i = 0; i < n + m; ++i){
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static  void sort (int[] array, int n){
        int save;
        for (int i = 1; i < n; ++i){
            for (int j = 1; j < n; ++j){
                if (array[j - 1] > array[j]){
                    save = array[j-1];
                    array[j-1] = array[j];
                    array[j] = save;
                }
            }
        }
    }
}