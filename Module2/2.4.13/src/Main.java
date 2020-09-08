import java.util.Scanner;

/*
Два простых числа называются "близнецами", если они отличаются друг от друга на 2
(например, 41 и 43). Найти и напечатать все пары "близнецов" из отрезка [n, 2n], где n -
заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Input n:");
            n = sc.nextInt();
            while (n <= 2){
                System.out.println("Input another n:");
                n = sc.nextInt();
            }
            search(n);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static boolean isSimple(int n){
        boolean simple = true;
        for (int i = 2; i < (n + 1)/2; ++i){
            if (n%i == 0){
                simple = false;
            }
        }
        return simple;
    }
    static void search(int n){
        for (int i = n; i < 2 * n - 1; ++i){
            if (isSimple(i)){
                if (isSimple(i + 2)) {
                    System.out.println(i + " " + (i + 2));
                }
            }
        }
    }
}

