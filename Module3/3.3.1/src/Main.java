import java.io.FileReader;
import java.util.Scanner;
/*
Создать приложение разбирающее текст и позволяющее выполнять 3 операции:
Сортировка абзацов по количеству предложений
в каждом приложении отсортировать слова по длине
отсортировать лексемы в предложении по убыванию вхождений заданного символа, а в случае равенства - по алфавиту.
 */


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader("input.txt"))) {
            String text = new String("");
            int count = 0;
            while(sc.hasNextLine()) {
                text = text + sc.nextLine();
                text = text + "\n";
                ++count;
            }
            TextWork tw = new TextWork();
            tw.textSplit(new StringBuilder(text), count);
            System.out.println(tw.sentenceSort(new StringBuilder(text)));
            System.out.println(tw.wordSort(new StringBuilder(text)));
            System.out.println(tw.wordSort2(new StringBuilder(text), 'a'));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}