import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Создать класс Customer.
Определить конструкторы, set- и get- методы и метод toString().
Создать 2ой класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерий выбора данных и вывести эти данные на консоль.

Customer: id, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.
Найти и вывести:
a) список книг заданного автора
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */


public class Main {
    static SimpleDateFormat format = new SimpleDateFormat("yyyy:MM:dd");
    public static void main(String[] args) throws ParseException {
        Book[]books = new Book[1];
        Scanner in = new Scanner(System.in);
        int id;
        String name;
        String author;
        String publisher;
        String release;
        int pages;
        double prise;
        String type;
        for (int i = 0; i < 1; ++i){
            System.out.println("id");
            id = in.nextInt();
            System.out.println("name");
            name = in.nextLine();
            in.nextLine();
            System.out.println("author");
            author = in.nextLine();
            System.out.println("publisher");
            publisher = in.nextLine();
            System.out.println("release");
            release = in.nextLine();
            while (!isValidDate(release)){
                System.out.println("wrong number");
                release = in.nextLine();
            }
            System.out.println("pages");
            pages = in.nextInt();
            System.out.println("prise");
            prise = in.nextDouble();
            System.out.println("type");
            type = in.nextLine();
            in.nextLine();
            books[i] = new Book(id, name, author, publisher, release, pages, prise, type);
            System.out.println(books[i].toString());
        }
        Library l = new Library(books);
        System.out.println("searche");
        String search;
        search = in.nextLine();
        l.searchByAuthor(search);
        search = in.nextLine();
        l.searchByPublisher(search);
        release = in.nextLine();
        while (!isValidDate(release)){
            System.out.println("wrong number");
            release = in.nextLine();
        }
        l.searchByDate(format.parse(release));
    }
    static boolean isValidDate(String input) {
        try {
            format.parse(input);
            return true;
        }
        catch (ParseException e) {
            return false;
        }
    }
}
