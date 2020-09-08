import java.util.Scanner;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый
второй элемент (освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
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
            for (int i = 0; i < n; ++i){
                if (i%2 == 1){
                    for (int j = (i + 1)/2; j < n - (i + 1)/2; ++j){
                        a[j] = a[j + 1];
                    }
                    a[n - (i + 1)/2] = 0;
                }
            }
            for (int i = 0; i < n; ++i){
                System.out.println(a[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}