import java.util.Scanner;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести на экран.
Случай, если самых длинный слов несколько не обрабатывать.
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
            boolean unique = true;
            String maxWord = new String("");
            int length = 0;
            for (int i = 0; i < text.length(); ++i) {
                if (text.charAt(i)!= ' '){
                    while (text.charAt(i) != ' ' && i < text.length() - 1){
                        ++length;
                        ++i;
                    }
                    if (length + 2 == maxWord.length()){
                        unique = false;
                    }
                    else {
                        if (length > maxWord.length()) {
                            maxWord = text.substring(i - length, i + 1);
                            unique = true;
                        }
                    }
                    length = 0;
                }
            }
            if (unique) {
                System.out.println(maxWord);
            }
            else {
                System.out.println("few words with max leangh");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}