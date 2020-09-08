import java.util.Scanner;

/*
Найти в строке количество чисел
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
            int counter = 0;
            for (int i = 0; i < text.length(); ++i){
                if (text.charAt(i) <= '9' && text.charAt(i) >= '0'){
                    while (((text.charAt(i) <= '9' && text.charAt(i) >= '0')|| text.charAt(i) == ',') && i < text.length() - 1){
                        ++i;
                    }
                    ++counter;
                }
            }
            System.out.println(counter + " numbers");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
