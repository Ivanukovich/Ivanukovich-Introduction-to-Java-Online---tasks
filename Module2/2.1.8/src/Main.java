import java.util.Scanner;

/*
Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность,
выбросив из исходной те члены, которые равны min(a1, a2, ..., an.)
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
            int min = 0;
            int numberOfMin = 1;
            for (int i = 1; i < n; ++i){
                if (a[i] < a[min]){
                    min = i;
                    numberOfMin = 1;
                }
                else {
                    if (a[i] == a[min]){
                        ++numberOfMin;
                    }
                }
            }
            int []newA = new int[n - numberOfMin];
            int count = 0;
            for (int i = 0; i < n; ++i){
                if (a[i] != a[min]){
                    newA[count] = a[i];
                    System.out.println(newA[count]);
                    ++count;
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}