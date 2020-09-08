import java.util.Scanner;

/*
Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a:");
            int a = in.nextInt();
            while (a <= 0) {
                System.out.println("Input another a");
                a = in.nextInt();
            }
            System.out.println("Input b:");
            int b = in.nextInt();
            while (b <= 0) {
                System.out.println("Input another b");
                b = in.nextInt();
            }
            System.out.println("Input c:");
            int c = in.nextInt();
            while (c <= 0) {
                System.out.println("Input another c");
                c = in.nextInt();
            }
            if (isSimple(a, b) && isSimple(a, c) && isSimple(c, b)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static boolean isSimple (int a, int b){
        boolean result = true;
        int count = 2;
        while (count <= a && count <= b){
            if (a % count == 0 && b % count == 0){
                result = false;
            }
            ++count;
        }
        return result;
    }
}