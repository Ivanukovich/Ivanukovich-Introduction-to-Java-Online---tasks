import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
/*
Блокнот. Разработать консольное приложение, работающее с Заметками в блокноте. Каждая заметка - это:
тема, дата создания, e-mail, сообщение
-В начале работы приложения данные должны считываться из файла, в конце работы - сохраняться в файл
-У пользователей должна быть возможность найти запись по любому параметру или по группе параметров,
 получить требуемые записи в отсортированном виде, найти записи, текстовой поле которой содержит
 определённое слово, а также добавить новую запись.
-Особое условие: поиск, сравнение и валидащию
 вводимой информации осуществлять с использование регулярных выражений.
-Особое условие: проверку, сравнение и валидацию вводимой информации должен осуществлять
 код, непосредственно добавляющий информацию
 */

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Notebook n = new Notebook();
        n.getData("Input.txt");
        String command;
        Scanner sc = new Scanner(System.in);
        command = sc.nextLine();
        int index;
        while (!command.equals("close")) {
            if (command.equals("remove")) {
                System.out.println("input index");
                index = sc.nextInt();
                n.removeNote(1);
            }
            if (command.equals("output")){
                n.outPut();
            }
            if (command.equals("add note")){
                n.addNote();
            }
            if (command.equals("write")) {
                n.write();
            }
            if (command.equals("sortByTopic")){
                n.sortByTopic();
            }
            if (command.equals("sortByEmail")){
                n.sortByEmail();
            }
            if (command.equals("sortByDate")){
                n.sortByDate();
            }
            System.out.println("write command");
        }
    }
}