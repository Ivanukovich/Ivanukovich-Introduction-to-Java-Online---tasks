import java.util.Scanner;

/*
Для каждого натурального числа от n до m вывести все делители, кроме самого числа и 1
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input n:");
            int n = sc.nextInt();
            System.out.println("Input m:");
            int m = sc.nextInt();
            while (m >= n) {
                System.out.println("n must be greater then m");
                n = sc.nextInt();
                m = sc.nextInt();
            }
            int div;
            boolean divExist;
            System.out.println("Result:");
            for (int i = m; i <= n; ++i) {
                divExist = false; //проверим, есть ли делители вообще у числа.
                System.out.println(i + ":");
                div = 2;
                while (div * 2 <= i) {
                    if (i % div == 0) {
                        System.out.println(div);
                        divExist = true;
                    }
                    ++div;
                }
                if (!divExist){
                    System.out.println("No dividers");
                }
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
