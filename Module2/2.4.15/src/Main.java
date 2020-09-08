import java.util.Scanner;

/*
Найти все натуральные n-значные числа, цифры в которых образую строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.
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
    static boolean ifIncreasing(int n){
        boolean result = true;
        int lastNumber = n%10;
        while (n>0){
            n /= 10;
            if (n%10 < lastNumber){
                lastNumber = n%10;
            }
            else {
                n = 0;
                result = false;
            }
        }
        return result;
    }
    static void search (int n){
        int start = (int)Math.pow(10, n-1);
        int finish = (int)Math.pow(10, n);
        for (int i = start; i < finish; ++i){
            if (ifIncreasing(i)){
                System.out.println(i);
            }
        }
    }
}
