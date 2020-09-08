import java.util.Scanner;

/*
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int N = in.nextInt();
            int []A = new int[N];
            while (N <= 0){
                System.out.println("Input another N");
                N = in.nextInt();
            }
            System.out.println("Input array:");
            for (int i = 0; i < N; ++i){
                System.out.println((i + 1) + ":");
                A[i] = in.nextInt();
                while (A[i] < 0){
                    System.out.println(i + " must be natural");
                    A[i] = in.nextInt();
                }
            }
            System.out.println("Input K:");
            int K = in.nextInt();
            while (K <= 0){
                System.out.println("K must be natural");
                K = in.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < N; ++i){
                if (A[i] % K == 0){
                    sum += A[i];
                }
            }
            System.out.println("Result: " + sum);

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}