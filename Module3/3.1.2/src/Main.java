import java.util.Scanner;

/*
Заменить в строке все вхождения word на letter
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
            for (int i = 0; i < text.length() - 3; ++i){
                if (text.substring(i,  i + 4).equals("word") || text.substring(i,  i + 4).equals("Word")){ //нужно убедиться, что word - изолированное слово
                    if (i == text.length() - 4) { //проверяем, конец ли это строки
                        if (i == 0){ //проверяем, начало ли это строки
                            text.delete(i, i + 4);
                            text.insert(i, "letter");
                        }
                        else{
                            if ((text.charAt(i - 1) > 'z' || text.charAt(i - 1) < 'a') && (text.charAt(i - 1) > 'Z' || text.charAt(i -1 ) < 'A')){ //проверям, ести ли символы перед wotd
                                text.delete(i, i + 4);
                                text.insert(i, "letter");
                            }
                        }
                    }
                    else{
                        if ((text.charAt(i + 4) > 'z' || text.charAt(i + 4) < 'a') && (text.charAt(i + 4) > 'Z' || text.charAt(i + 4) < 'A')){ //проверяем, есть ли символы после word
                            if (i == 0){ //проверяем, начало ли это строки
                                text.delete(i, i + 4);
                                text.insert(i, "letter");
                            }
                            else{
                                if ((text.charAt(i - 1) > 'z' || text.charAt(i - 1) < 'a') && (text.charAt(i - 1) > 'Z' || text.charAt(i -1 ) < 'A')){ //проверяем, есть символы до word
                                    text.delete(i, i + 4);
                                    text.insert(i, "letter");
                                }
                            }
                        }
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
