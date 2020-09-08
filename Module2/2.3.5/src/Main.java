import java.util.Scanner;
/*
Сортировка вставками
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
            System.out.println(1);
            a[0] = in.nextInt();
            for (int i = 1; i < n; ++i){
                System.out.println(i + 1);
                a[i] = in.nextInt();
            }
            int[] sorted = new int[n];
            sorted[0] = a[n - 1];
            for (int i = 0; i < n - 1; ++i){
                include(sorted, i + 1, a[n - 2 - i], getI(sorted, i + 1, a[n - 2 - i]));
            }
            System.out.println("Result");
            for (int i = 0; i < n; ++i){
                System.out.println(sorted[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void include (int[] array, int size, int element, int i){
        for (int j = size; j > i; --j) {
            array[j] = array[j-1];
        }
        array[i] = element;
    }
    static int getI (int[] array, int size, int element){
        int start = 0;
        int finish = size - 1;
        int i = (finish + start)/2 +(finish + start)%2 ;
        while (finish - start > 1){
            if (element < array[i]){
                finish = i;
            }
            if (element > array[i]){
                start = i;
            }
            if (element == array[i]){
                start = i;
            }
            i = (finish + start)/2;
        }
        if (element > array[i]){
            ++i;
        }
        return i;

    }
}