import java.util.Scanner;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String str;
            StringBuilder text;
            System.out.println("Input string");
            str = in.nextLine();
            text = new StringBuilder(str);
            for (int i = 0; i < text.length(); ++i) {
                text.insert(i, text.charAt(i));
                ++i;
            }
            System.out.println(text);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}