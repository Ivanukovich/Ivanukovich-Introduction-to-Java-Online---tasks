import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размерности n на n,
составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой
из двух больших диагональней равны между собой. Построить такой квадрат.
 */

/*
Алгоритм состоит в том, чтобы построить матрицу n на n с элементами от 1 на n^2, расположенными по возрастанию,
а затем "повернуть" на 45 градусов, наложить на искомую матрицу. Затем заполнить недостающие элементы теми
частями повёрнутой матрицы, которые не вошли в искомую.(на каждую четверть искомой накладывается та часть
повернутой матрицы, которое соответствует своим "направлением").
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input uneven N:");
            int n = in.nextInt();
            while (n <= 0 || n%2 == 0){
                System.out.println("Input another N");
                n = in.nextInt();
            }
            int [][]a = new int[n][n];
            int [][]b = new int[n][n];
            int count = 1;
            for (int i = 0; i < n; ++i){
                for (int j = 0; j < n; ++j){
                    b[i][j] = count;
                    ++count;
                }
            }
            int k;
            int p;
            count = 0;
            for (int i = -n + 1; i < n; i += 2){
                if (i < 0){
                    k = count;

                    p = 0;
                    count += 2;
                }
                else {
                    if (i == 0) {
                        k = n - 1;
                        p = 0;
                        count = 2;
                    }
                    else {
                        k = n - 1;
                        p = count;
                        count += 2;
                    }
                }
                for (int j = 0; j < n - Math.abs(i); ++j){
                    a[k][p] = b[(n + 1)/2 + (i/2) - 1][Math.abs(i/2) + j];
                    --k;
                    ++p;
                }

            }
            int l;
            int g;
            for (int i = 0; i < (n - 1)/2; ++i){
                k = i;
                p = 0;
                l = n/2 + i;
                g = n/2 + 1 + i;
                for (int j = 0; j < i + 1; ++j) {
                    a[l][g] = b[k][p];
                    --k;
                    ++p;
                    l -= 2;

                }
            }
            for (int i = 0; i < (n - 1)/2; ++i){
                k = n - 1;
                p = n - 1 - i;
                l = n/2 + i;
                g = n/2 - 1 - i;
                for (int j = 0; j < i + 1; ++j) {
                    a[l][g] = b[k][p];
                    --k;
                    ++p;
                    l -= 2;

                }
            }
            for (int i = 0; i < (n - 1)/2; ++i){
                k = n - 1 - i;
                p = 0;
                l = n/2 - 1 - i;
                g = n/2 - i;
                for (int j = 0; j < i + 1; ++j) {
                    a[l][g] = b[k][p];
                    ++k;
                    ++p;
                    g += 2;

                }
            }
            for (int i = 0; i < (n - 1)/2; ++i){
                k = 0;
                p = n - 1 - i;
                l = n/2 + 1 + i;
                g = n/2 - i;
                for (int j = 0; j < i + 1; ++j) {
                    a[l][g] = b[k][p];
                    ++k;
                    ++p;
                    g += 2;

                }
            }
            for (int i = 0; i < n; ++i){
                for (int j =0; j < n; ++j){
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
