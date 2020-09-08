import java.util.Scanner;

/*
Сформировать случайную матрицу m на n, состоящую из нулей и единиц, причем в
каждом столбце число единиц равно номеру столбца.
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
            while (m < n){
                System.out.println("Input another M");
                m = in.nextInt();
            }
            int count;
            int [][]a = new int[m][n];
            for (int i = 0; i < n; ++i){
                count = 0;
                for (int j = 0; j < m; ++j) {
                    if (count < i + 1) {
                        if (i + 1 - count < m - j) { //единицы ставятся случайно до тех пор, пока хватает места для набора нужного их количества
                            a[j][i] = (int)(Math.random() * 2);
                            if (a[j][i] == 1) {
                                ++count;
                            }
                        }
                        else {
                            a[j][i] = 1;
                        }
                    }
                    else {
                        a[j][i] = 0;
                    }
                }
            }
            System.out.println("Result:");
            for (int i = 0; i < m; ++i){
                for (int j = 0; j < n; ++j) {
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
