import java.util.Scanner;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
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
            int M;
            System.out.println("Input M:");
            M = sc.nextInt();
            while (M < 0){
                System.out.println("Input another M:");
                M = sc.nextInt();
            }
            int Nsize, Msize;
            Nsize = getSize(N);
            Msize = getSize(M);
            System.out.println("Result:");
            if (Nsize > Msize){
                System.out.println("N has more Numbers");
            }
            else{
                if (Nsize < Msize){
                    System.out.println("M has more Numbers");
                }
                else{
                    System.out.println("N and M have equal number of Numbers");
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int getSize(int N){
        int size = 0;
        int copy = N;
        if (copy != 0) {
            while (copy != 0) {
                copy /= 10;
                ++size;
            }
        }
        else{
            size = 1;
        }
        return size;
    }
}