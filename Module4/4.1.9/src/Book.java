import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    int id;
    String name;
    String author;
    String publisher;
    Date release;
    int pages;
    double prise;
    String type;
    SimpleDateFormat format = new SimpleDateFormat("yyyy:MM:dd");
    Book (int id, String name, String author, String publisher, String release, int pages, double prise, String type) throws ParseException {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.release = format.parse(release);
        this.pages = pages;
        this.prise = prise;
        this.type = type;
    }
    void setId(int id) {
        this.id = id;
    }
    void setName(String name) { this.name = name; }
    void setAuthor(String author){
        this.author = author;
    }
    void setPublisher(String publisher){
        this.publisher = publisher;
    }
    void setRelease(Date release){
        this.release = release;
    }
    void setPages(int pages){
        this.pages = pages;
    }
    void setPrise(int prise){
        this.prise = prise;
    }
    void setType(String type){this.type = type;}
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }
    String getAuthor(){
        return author;
    }
    String getPublisher(){
        return publisher;
    }
    Date getRelease(){
        return release;
    }
    int getPages(){
        return pages;
    }
    double getPrise(){
        return prise;
    }
    String getType(){return type;}
    @Override
    public String toString(){
        return new String(id + " " + name + " " + author + " " + publisher + " " + release + " " + pages + " " + prise + " " + type);
    }
}
