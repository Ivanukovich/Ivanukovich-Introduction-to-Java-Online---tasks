import java.util.Scanner;

/*
Сортировка обменами. Дана последовательность чисел a1 < a2 < ... < an. Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка.
Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
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
            sortByChange(a, n);
            System.out.println("Result");
            for (int i = 0; i < n; ++i){
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void sortByChange (int[] array, int size){
        int save;
        for (int i = 0; i < size - 1; ++i){
            for (int j = 0; j < size - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    save = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = save;
                }
            }
        }
    }
}