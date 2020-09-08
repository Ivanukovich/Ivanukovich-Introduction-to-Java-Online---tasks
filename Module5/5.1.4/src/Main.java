import java.io.IOException;
import java.util.Scanner;
/*
Создать консольное приложение, удовлетворяющее слудующим требованиям:
-Приложение должно быть объектно-, а не процедурно-ориентированным.
-Каждый класс должен иметь отражающее смысл название и информативный состав.
-Наследование должно применяться только тогда, когда это имеет смысл
-При кодировании должны быть использованы соглашения об оформлении кода java code convention.
-Классы должны быть грамотно разложены по пакетам
-Консольное меню должно быть минимальным
-Для хранения данных можно использовать файлы

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах
в пещере дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
и выбора сокровщ на заданную сумму.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Dragon d = new Dragon("Treasures.txt", 10);
        System.out.println("Input command");
        Scanner sc = new Scanner(System.in);
        String command;
        command = sc.nextLine();
        int value;
        while (!command.equals("close")){
            if (command.equals("findMostExpensive")){
                d.findMostExpensive();
            }
            if (command.equals("searchForSum")){
                System.out.println("input sum");
                value = sc.nextInt();
                while (value < 0){
                    System.out.println("another sum");
                    value = sc.nextInt();
                }
                sc.nextLine();
                d.searchForSum(6);
            }
        }

    }
}