import java.util.Scanner;

/*
Сортировка Шелла.
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
            sortShela(a, n);
            System.out.println("Result");
            for (int i = 0; i < n; ++i){
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void sortShela (int[] array, int size){
        int save;
        for (int i = 0; i < size - 1; ++i) {
            if (array[i] > array[i + 1]){
                save = array[i];
                array[i] = array[i + 1];
                array[i + 1] = save;
                if (i > 0) {
                    i -= 2;
                }
            }
        }
    }
}