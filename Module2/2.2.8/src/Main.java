import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т.е. все элементы
одного столбца поставить на соответствующие им позиции другого, а его элементы
второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int n = in.nextInt();
            while (n <= 0){
                System.out.println("Input another N");
                n = in.nextInt();
            }
            System.out.println("Input M:");
            int m = in.nextInt();
            while (m <= 0){
                System.out.println("Input another M");
                m = in.nextInt();
            }
            double [][]a = new double[n][m];
            System.out.println("Input matrix:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.println((i + 1) + " " + (j + 1) + ":");
                    a[i][j] = in.nextDouble();
                }
            }
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Input k");
            int k = in.nextInt();
            while (k <= 0 || k > m){
                System.out.println("Input another k");
                k = in.nextInt();
            }

            System.out.println("Input l");
            int l = in.nextInt();
            while (l <= 0 || l > m || l == k){
                System.out.println("Input another l");
                l = in.nextInt();
            }
            double save;
            for (int i = 0; i < n; ++i){
                save = a[i][k - 1];
                a[i][k - 1] = a[i][l - 1];
                a[i][l - 1] = save;
            }
            System.out.println("Result:");
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < m; ++j) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}