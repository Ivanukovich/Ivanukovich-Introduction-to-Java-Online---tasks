import java.util.Scanner;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получить нуль?
Для решения задачи использовать декомпозицию.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Input n:");
            n = sc.nextInt();
            while (n < 2){
                System.out.println("Input another n:");
                n = sc.nextInt();
            }
            System.out.println(numberOfSubtractions(n));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int SumOfNumbers (int n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    static int numberOfSubtractions (int n){
        int count = 0;
        while (n != 0){
            n = n - SumOfNumbers(n);
            ++count;
        }
        return count;
    }
}