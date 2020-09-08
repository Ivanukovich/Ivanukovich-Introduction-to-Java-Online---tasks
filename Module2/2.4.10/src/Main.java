import java.util.Scanner;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива,
элементами которого являются цифры числа N.
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
            int []array;
            array = getArray(N);
            System.out.println("Result:");
            for (int i = 0; i < array.length; ++i){
                System.out.println(array[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int[] getArray(int N){
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
        int []array = new int[size];
        int count = 0;
        while (N != 0){
            System.out.println(N % Math.pow(10, size - count - 1));
            array[count] = (int)((N - N % Math.pow(10, size - count - 1))/Math.pow(10, size - count - 1));
            N %= Math.pow(10, size - count - 1);
            ++count;
        }
        return array;
    }
}