import java.util.Scanner;

/*
Удалить лишние (подряд идущие) и крайние пробелы в строке
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
            while (text.charAt(0) == ' '){ //удаляем крайние пробелы
                text.deleteCharAt(0);
            }
            while (text.charAt(text.length()-1) == ' '){
                text.deleteCharAt(text.length()-1);
            }
            for (int i = 0; i < text.length(); ++i){
                if (text.charAt(i) == ' '){
                    ++i;
                    while (text.charAt(i) == ' ' && i < text.length() - 1){
                        text.deleteCharAt(i);
                    }
                }
            }
            System.out.println(text);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
