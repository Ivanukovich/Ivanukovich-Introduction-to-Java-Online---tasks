import java.io.FileReader;
import java.util.Scanner;

/*
Анализатор XML-документа, позволяющий последовательно возвращать содержимое XML-узлов и его тип
(закрывающий/открывающий тэг, тэг без тела, содержимое тэга)
 */

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader("XML.txt"))) {
            String text = new String("");
            while(sc.hasNextLine()) {
                text = text + sc.nextLine();
                text = text + "\n";
            }
            TextWork tw = new TextWork();
            tw.sentenceSort(new StringBuilder(text));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}