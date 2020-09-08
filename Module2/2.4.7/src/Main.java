/*
Написать метод (методы), для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Main {
    public static void main(String[] args) {
        try {
            int sum = 0;
            for (int i = 0; i < 5; ++i){
                sum += factoria(i * 2 + 1);
            }
           System.out.println(sum);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int factoria (int a){
        int result = 1;
        while (a > 1){
            result *= a;
            --a;
        }
        return result;
    }
}