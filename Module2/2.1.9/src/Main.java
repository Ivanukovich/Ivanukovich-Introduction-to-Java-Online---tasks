import java.util.Scanner;

/*
В массиве целых чисел с колчеством элементов n найти наиболее часто встречаемое число. Если таких чисел несколько,
то определить наиманьшее из них.
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
            int []a = new int[n];
            System.out.println("Input array:");
            for (int i = 0; i < n; ++i){
                System.out.println((i + 1) + ":");
                a[i] = in.nextInt();
            }
            int []repeats = new int[n];
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    if (a[i] == a[j] && repeats[j] != -1){
                        ++repeats[i];
                        if (repeats[i] > 1){
                            repeats[j] = -1;
                        }
                    }
                }
            }
            int max = 0;
            for (int i = 1; i < n; ++i){
                if ((repeats[max] == repeats[i] && a[max] > a[i])||repeats[max] < repeats[i]){
                    max = i;
                }
            }
            System.out.println("Result: " + a[max]);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}