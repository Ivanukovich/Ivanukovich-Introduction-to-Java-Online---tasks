import java.util.Scanner;

/*
Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего
общего кратного двух натуральных чисел:
НОК(A, B) = A*B/НОД(A, B)
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input A:");
            int A = in.nextInt();
            while (A <= 0) {
                System.out.println("Input another A");
                A = in.nextInt();
            }
            System.out.println("Input B:");
            int B = in.nextInt();
            while (B <= 0) {
                System.out.println("Input another B");
                B = in.nextInt();
            }
            int gcd = getGCD(A, B);
            int lcm = A * B / gcd;
            System.out.println("Result :\nGCD: " + gcd + "\nLCM: " + lcm);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int getGCD (int A, int B){
        int gcd = 1;
        int div = 2;
        while (div <= Math.min(A, B)){
            while (A % div == 0 && B % div == 0){
                gcd *= div;
                A /= div;
                B /= div;
            }
            ++div;
        }
        return gcd;
    }
}