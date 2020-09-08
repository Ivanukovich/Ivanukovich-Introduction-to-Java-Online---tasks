import java.util.Scanner;
/*
Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго числа.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input first number:");
            int num1 = in.nextInt();
            System.out.println("Input second number:");
            int num2 = in.nextInt();
            boolean []numbers1 = new boolean[10];
            boolean []numbers2 = new boolean[10];
            getNumbers(numbers1, num1);
            getNumbers(numbers2, num2);
            System.out.println("Result:");
            for (int i = 0; i < 10; ++i){
                if (numbers1[i] && numbers2[i]){
                    System.out.println(i);
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static void getNumbers (boolean []numbersOf, int num){
        if (num == 0){
            numbersOf[0] = true;
        }
        else {
            while (num != 0) {
                numbersOf[num % 10] = true;
                num /= 10;
            }
        }
    }
}
