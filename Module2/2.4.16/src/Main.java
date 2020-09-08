import java.util.Scanner;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
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
            search(n);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static boolean ifUneven (int n){
        boolean result = true;
        while (n > 0){
            if ((n%10)%2 == 0){
                n = 0;
                result = false;
            }
            n /= 10;
        }
        return result;
    }
    static int EvenCount (int n){
        int count = 0;
        while (n > 0){
            if ((n%10)%2 == 0){
                ++count;
            }
            n /= 10;
        }
        return count;
    }
    static void search(int n ){
        int start = (int)Math.pow(10, n - 1);
        int finish = (int)Math.pow(10, n);
        int result = 0;
        for (int i = start; i < finish; ++i){
            if (ifUneven(i)){
                result += i;
            }
        }
        System.out.println("Sum:" + result + "\nEven numbers:" + EvenCount(result));
    }
}