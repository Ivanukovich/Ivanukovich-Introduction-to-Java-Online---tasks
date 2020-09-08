import java.util.Scanner;

/*
Сортировка выбором. Дана последовательность a1 <= a2 <= ... <= an.
Требуется переставить элементы так, чтобы они были разложены по убыванию. Для этого в массиве, начиная с
первого, выбрасывется наибольший элемент и ставится на первое место, а первый - на место наибольшего.
Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int n = in.nextInt();
            while (n <= 0) {
                System.out.println("Input another N");
                n = in.nextInt();
            }
            int[]a = new int[n];
            System.out.println("Input array1:");
            System.out.println(1);
            a[0] = in.nextInt();
            for (int i = 1; i < n; ++i){
                System.out.println(i + 1);
                a[i] = in.nextInt();
                while (a[i] < a[i - 1]){
                    System.out.println("input anither a" + (i + 1));
                    a[i] = in.nextInt();
                }

            }
            sortByChoose(a, n);
            System.out.println("Result");
            for (int i = 0; i < n; ++i){
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void sortByChoose (int[] array, int size){
        int save;
        for (int i = 0; i < size - 1; ++i){
            int max = i;
            for (int j = i + 1; j < size; ++j){
                if (array[j] > array[max]){
                    max = j;
                }
            }
            if (max != i){
                save = array[max];
                array[max] = array[i];
                array[i] = save;
            }
        }
    }
}