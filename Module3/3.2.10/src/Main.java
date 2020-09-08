import java.util.Scanner;
/*
Строка X состоит из нескольких предложений, кончающихся точкой, вопросительным или восклицательным знаками.
Посчитать количество предложений в строке X
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            String X;
            StringBuilder text;
            System.out.println("Input text:");
            X = in.nextLine();
            int count = 0;
            for (int i = 0; i < X.length(); ++i) {
                if (X.charAt(i) == '.' || X.charAt(i) == '!' || X.charAt(i) == '?'){
                    ++count;
                }
            }
            System.out.println(count);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}