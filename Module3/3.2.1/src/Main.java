import java.util.Scanner;

/*
Найти в тексте наибольшее количество подряд идущих пробелов
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String str;
            StringBuilder text;
            System.out.println("Input Text:");
            str = in.nextLine();
            text = new StringBuilder(str);
            int count = 0;
            int globalCount = 0;
            for (int i = 0; i < text.length() - 3; ++i) {
                if (text.charAt(i) == ' '){
                    while (text.charAt(i) == ' '){
                        ++count;
                        ++i;
                    }
                    if (count > globalCount){
                        globalCount = count;
                    }
                    count = 0;
                }
            }
            System.out.println(globalCount + " of spaces");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}