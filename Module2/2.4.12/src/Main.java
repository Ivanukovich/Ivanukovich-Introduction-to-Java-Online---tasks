import java.util.Scanner;

/*
Даны натуральные числа K и N. Написать метод(методы) формирования массива А, элементами
которого являются числа, сумма цифр которых равна K и которые не больше N.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int N;
            System.out.println("Input N:");
            N = sc.nextInt();
            while (N < 0){
                System.out.println("Input another N:");
                N = sc.nextInt();
            }
            int K;
            System.out.println("Input K:");
            K = sc.nextInt();
            while (K < 0){
                System.out.println("Input another K:");
                K = sc.nextInt();
            }
            int[]A;
            int min = getMinNumber(K, N);
            if (min != -1){
                A = getA(N, K, min);
                System.out.println("Result:");
                for (int i = 0; i < A.length; ++i){
                    System.out.println(A[i]);
                }
            }
            else{
                System.out.println("No numbers");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int[] getA (int N, int K, int min){
        int num = min;
        int[] A;
        int count = 0;
        while (num < N) {
            if (sumOfNumbers(num) == K) {
                ++count;
            }
            ++num;
        }
        A = new int[count];
        num = min;
        count = 0;
        while (num < N) {
            if (sumOfNumbers(num) == K) {
                A[count] = num;
                ++count;
            }
            ++num;
        }
        return A;
    }
    static int sumOfNumbers(int M){
        int sum = 0;
        while (M != 0){
            sum  += M%10;
            M /= 10;
        }
        return sum;
    }
    static int getMinNumber(int K, int N){
        int min = 0;
        while (K > 0){
            min *= 10;
            if (K >= 9) {
                min += 9;
                K -= 9;
            }
            else {
                min += K;
                K = 0;
            }
            if (min >= N){
                min = -1;
                K = 0;
            }
        }
        return min;
    }
}