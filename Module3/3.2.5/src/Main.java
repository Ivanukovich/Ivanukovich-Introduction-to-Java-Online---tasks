import java.util.Scanner;
/*
Подсчитать сколько раз в символах строки встречается a
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
            int count = 0;
            for (int i = 0; i < text.length(); ++i) {
                if (text.charAt(i) =='а') {
                    ++count;
                }
            }
            System.out.println(count + " of а");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}