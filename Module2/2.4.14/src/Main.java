import java.util.Scanner;

/*
Натуральное число, в записи которого n цифр, называетмя числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int k;
            System.out.println("Input N:");
            k = sc.nextInt();
            while (k < 2){
                System.out.println("Input another N:");
                k = sc.nextInt();
            }
            ifArmstrong(k);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int[] getSumOfNumbers (int k){
        int result[] = new int[2];
        while(k > 0){
            result[0] += k%10;
            ++result[1];
            k /= 10;
        }
        return result;
    }
    static void ifArmstrong(int k){
        int []data;
        for (int i = 1; i < k + 1; ++i){
            data = getSumOfNumbers(i);
            if (Math.pow(data[0], data[1]) == i){
                System.out.println(i);
            }
        }
    }
}
