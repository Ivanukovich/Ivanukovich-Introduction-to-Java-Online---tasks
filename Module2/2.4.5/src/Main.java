import java.util.Scanner;

/*
Составить программу, оторая в массиве A[N] находит второе по величине число (вывести на печать число, которое
меньше максимального элемента массива, но больше всех других элементов).
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int N = in.nextInt();
            while (N <= 1) {
                System.out.println("Input another N");
                N = in.nextInt();
            }
            int []A = new int[N];
            System.out.println("Input Array:");
            for (int i = 0; i < N; ++i){
                A[i] = in.nextInt();
            }
            int max = A[0];
            for (int i = 1; i < N; ++i){
                if (A[i] > max){
                    max = A[i];
                }
            }
            int result = Math.min(A[0], A[1]);
            for (int i = 1; i < N; ++i){
                if (A[i] > result && A[i] != max){
                    result = A[i];
                }
            }
            System.out.println("Result:\n" + result);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}