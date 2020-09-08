import java.util.Scanner;

/*
Создать объект класса Текст, использую классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст,заголовок текста.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        Word[] words;
        Sentance[] sentances = new Sentance[2];
        Sentance title = new Sentance();
        Text text = new Text();
        for (int i = 0; i < 3; ++i){
            words = new Word[2];
            for (int j = 0; j < 2; ++j) {
                word = in.nextLine();
                words[j] = new Word(word);
            }
            if (i == 0){
                title = new Sentance(words, '!');
            }
            else {
                sentances[i - 1] = new Sentance(words, '.');
            }
        }
        text = new Text(title, sentances);
        text.outPut();
        text.addSentence(sentances[1], 1);
        text.outPut();
        text.titleOutPut();
    }
}