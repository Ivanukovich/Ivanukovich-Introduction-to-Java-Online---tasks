import java.util.Scanner;

/*
Даны действительные числа a1, a2, ..., an. Поменять местами наибольший и наименьший элементы.
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
            double []a = new double[n];
            System.out.println("Input array:");
            for (int i = 0; i < n; ++i){
                System.out.println((i + 1) + ":");
                a[i] = in.nextDouble();
            }
            int max = 0;
            int min = 0;
            for (int i = 1; i < n; ++i){
                if (a[i] > a[max]){
                    max = i;
                }
                if (a[i] < a[min]){
                    min = i;
                }
            }
            double save = a[min];
            a[min] = a[max];
            a[max] = save;
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
                System.out.println(a[i]);
            }

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
