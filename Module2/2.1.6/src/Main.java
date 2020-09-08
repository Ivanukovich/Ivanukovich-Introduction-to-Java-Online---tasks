import java.util.Scanner;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел,
порядковые номера которых являются простыми числами.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int N = in.nextInt();
            while (N <= 0){
                System.out.println("Input another N");
                N = in.nextInt();
            }
            double []a = new double[N];
            System.out.println("Input array:");
            for (int i = 0; i < N; ++i){
                System.out.println((i + 1) + ":");
                a[i] = in.nextDouble();
            }
            System.out.println("Result:");
            NumberQualities nq = new NumberQualities();
            for (int i = 0; i < N; ++i){
                if (nq.primeNumber(i + 1)){
                    System.out.println(a[i]);
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}