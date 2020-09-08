import java.util.Scanner;

/*
Даны действительные числа a1, a2, ..., an. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1).
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input n/2:");
            int n = in.nextInt();
            while (n <= 0){
                System.out.println("Input another n");
                n = in.nextInt();
            }
            double []a = new double[n * 2];
            System.out.println("Input array:");
            for (int i = 0; i < n * 2; ++i){
                System.out.println((i + 1) + ":");
                a[i] = in.nextDouble();
            }
            System.out.println("New array:");
            double []sums = new double[n];
            for (int i = 0; i < n; ++i){
                sums[i] = a[i] + a[2*n - 1 - i];
                System.out.println(sums[i]);
            }
            int max = 0;
            for (int i = 1; i < n; ++i){
                if (sums[i] > sums[i - 1]){
                    max = i;
                }
            }
            System.out.println("Result: " + sums[max]);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}