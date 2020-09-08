import java.util.Scanner;

/*
Матрица 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
в которых число 5 встречается три и более раз.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int [][]a = new int[10][20];
            for (int i = 0; i < 10; ++i){
                for (int j = 0; j < 20; ++j) {
                    a[i][j] = (int)(Math.random() * 15);
                }
            }
            for (int i = 0; i < 10; ++i){
                for (int j = 0; j < 20; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Result:");
            int count = 0;
            for (int i = 0; i < 10; ++i){
                for (int j = 0; j < 20; ++j){
                    if (a[i][j] == 5){
                        ++count;
                    }
                }
                if (count >= 3){
                    System.out.println(i + 1);
                }
                count = 0;
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
