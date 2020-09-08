import java.util.Scanner;

/*
Проверить, являетмя ли заданное слово полиндромом
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String str;
            StringBuilder text;
            System.out.println("Input word:");
            str = in.nextLine();
            text = new StringBuilder(str);
            while (!isWord(text)){
                System.out.println("Input right word:");
                str = in.nextLine();
                text = new StringBuilder(str);
            }
            boolean result = true;
            for (int i = 0; i < text.length()/2; ++i) {
                if (text.charAt(i) < 'a'){
                    text.setCharAt(i, (char)(text.charAt(i) + ('a' - 'A')));
                }
                if (text.charAt(text.length() - 1 - i) < 'a'){
                    text.setCharAt(text.length() - 1 - i, (char)(text.charAt(text.length() - 1 - i) + ('a' - 'A')));
                }
                if (text.charAt(i) != text.charAt(text.length() - 1 - i)){
                    result = false;
                }
            }
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static boolean  isWord (StringBuilder text){
        boolean result = true;
        for (int i = 0; i < text.length() - 1; ++i) {
            if(text.charAt(i) > 'z' || text.charAt(i) < 'A' ||(text.charAt(i) > 'Z' && text.charAt(i) < 'a')){
                result = false;
            }
        }
        return result;
    }
}