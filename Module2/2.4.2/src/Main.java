import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителся четырех натуральных чисел.
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
            System.out.println("Input C:");
            int C = in.nextInt();
            while (C <= 0) {
                System.out.println("Input another C");
                C = in.nextInt();
            }
            System.out.println("Input D:");
            int D = in.nextInt();
            while (D <= 0) {
                System.out.println("Input another D");
                D = in.nextInt();
            }
            int gcd = getGCD(A, B, C, D);
            System.out.println("Result :\nGCD: " + gcd);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int getGCD (int A, int B, int C, int D){
        int gcd = 1;
        int div = 2;
        while (div <= Math.min(Math.min(A, B), Math.min(C, D))){
            while (A % div == 0 && B % div == 0 && C % div == 0 && D % div == 0){
                gcd *= div;
                A /= div;
                B /= div;
                C /= div;
                D /= div;
            }
            ++div;
        }
        return gcd;
    }
}