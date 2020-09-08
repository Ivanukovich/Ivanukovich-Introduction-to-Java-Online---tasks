import java.util.Scanner;

/*
Вводится строка. Требуется Удалить из неё повторяющиеся символы и пробелы
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String str;
            StringBuilder text;
            System.out.println("Input string:");
            str = in.nextLine();
            text = new StringBuilder();
            for (int i = 0; i < str.length(); ++i) {
                if (text.indexOf(String.valueOf(str.charAt(i)))== -1 && str.charAt(i)!= ' '){
                    text.append(str.charAt(i));
                }
            }
            System.out.println(text);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}