import java.util.Scanner;

/*
Дан числовой ряд и некоторое число е. Найти сумму тех чисел ряда, модуль которых больше или равен е.
 */

public class Main {
    public static void main(String[] args) {
        try {
            double sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input e:");
            double e = sc.nextDouble();
            int count = 1;
            double a = an(count);

            while (Math.abs(a) >= e){
                sum += a;
                ++count;
                a = an(count);
            }
            System.out.println(sum);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static double an (int n){
        return 1/Math.pow(2, n) + 1/Math.pow(3, n);
    }
}
