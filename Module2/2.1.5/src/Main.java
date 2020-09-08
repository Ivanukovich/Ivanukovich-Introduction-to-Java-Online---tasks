import java.util.Scanner;

/*
Даны целые числа a1, a2, ..., an. Вывести на печать только те числа, для которых ai > i.
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
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
                if (a[i] > i + 1){
                    System.out.println(a[i]);
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}