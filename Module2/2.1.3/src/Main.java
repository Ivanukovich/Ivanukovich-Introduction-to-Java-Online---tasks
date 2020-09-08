import java.util.Scanner;

/*
Дан массив действительных чисел, размерность которого N. Родсчитать, сколько в
нём отрицательных, положительных и нулевых элементов.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int N;
            N = in.nextInt();
            while (N <= 0){
                System.out.println("Input another N:");
                N = in.nextInt();
            }
            double []A = new double[N];
            System.out.println("Input array:");
            for (int i = 0; i < N; ++i){
                System.out.println((i + 1) + ":");
                A[i] = in.nextDouble();
            }
            int counterOfPlus = 0;
            int counterOfMinus = 0;
            int counterOfZeros = 0;
            for (int i = 0; i < N; ++i){
                if (A[i] < 0){
                    ++counterOfMinus;
                }
                else {
                    if (A[i] == 0) {
                        ++counterOfZeros;
                    }
                    else {
                        ++counterOfPlus;
                    }
                }
            }
            System.out.println("Result:\nNumber of positive: " + counterOfPlus + "\nNumber of negative: "
                    + counterOfMinus + "\nNumber of zeroes: " + counterOfZeros);

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}