import java.util.Scanner;

/*
Посчитать количество строчных и прописных букв в данной строке. Учитывать только английские символы
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String str;
            StringBuilder text;
            System.out.println("Input string:");
            str = in.nextLine();
            text = new StringBuilder(str);
            int smallCount = 0;
            int bigCount = 0;
            for (int i = 0; i < text.length(); ++i) {
                if (text.charAt(i) <= 'z' && text.charAt(i) >= 'a'){
                    ++smallCount;
                }
                if (text.charAt(i) <= 'Z' && text.charAt(i) >= 'A'){
                    ++bigCount;
                }
            }
            System.out.println(smallCount + " " + bigCount);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}