import java.util.Scanner;

/*
В строке после каждого символа a вставить b
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
            for (int i = 0; i < text.length(); ++i) {
                if (text.charAt(i) == 'a'){
                    text.insert(i+1, 'b');
                }
            }
            System.out.println(text);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}