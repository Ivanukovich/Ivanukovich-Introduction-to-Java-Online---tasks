import java.text.SimpleDateFormat;
import java.util.Date;

public class Library {
    Book[] books;
    SimpleDateFormat format = new SimpleDateFormat("yyyy:MM:dd");
    void searchByAuthor (String author){
        for (int i = 0; i < books.length; ++i){
            if (books[i].getAuthor().equals(author)){
                System.out.println(books[i].toString());
            }
        }
    }
    void searchByPublisher (String publisher){
        for (int i = 0; i < books.length; ++i){
            if (books[i].getPublisher().equals(publisher)){
                System.out.println(books[i].toString());
            }
        }
    }
    void searchByDate (Date year){
        for (int i = 0; i < books.length; ++i){
            if (books[i].getRelease().getTime() > year.getTime()){
                System.out.println(books[i].toString());
            }
        }
    }
    Library(Book[] books){
        this.books = books;
    }
}
