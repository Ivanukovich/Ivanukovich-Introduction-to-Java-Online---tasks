import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    String password;
    List<Email> mail = new ArrayList<Email>();
    boolean isEmptyMail(){
        return  mail.size() == 0;
    }
    int getEmailNumber(){
        return mail.size();
    }
    boolean isValidPassword(String password){
        return this.password.equals(password);
    }
    void showMail(){
        if (isEmptyMail()){
            System.out.println("mail is empty");

        }
        else {
            for (int i = 0; i < mail.size(); ++i) {
                System.out.println((i + 1) + ") from " + mail.get(i).getAuthor() + " - " + mail.get(i).getTheme());
            }
        }
    }
    boolean readEmail(int index){
        if (index <= mail.size() && index >= 1){
            mail.get(index - 1).show();
            return true;
        }
        else {
            System.out.println("no such email");
            return false;
        }
    }
    void deleteEmail(int index){
        mail.remove(index - 1);
    }
    String getName(){
        return name;
    }
    class Email{
        String author;
        String theme;
        String text;
        Book addition;
        Email(String author, String theme, String text){
            this.author = author;
            this.theme = theme;
            this.text = text;
        }
        Email(String author, String theme, String text, Book addition){
            this.author = author;
            this.theme = theme;
            this.text = text;
            this.addition = addition;
        }
        String getAuthor(){
            return author;
        }
        String getText(){
            return text;
        }
        String getTheme(){
            return theme;
        }
        Book getAddition(){
            return addition;
        }
        void show(){
            System.out.println(author + "\n" + theme + "\n" + text);
        }
    }
}
class User extends Person{
    User (String name, String password){
        this.name = name;
        this.password = password;
    }
    void sendNotification(String text){
        Email letter = new Email("Administrator", "new book", text);
        this.mail.add(letter);
    }
}
class Administrator extends Person{
    Administrator (String name, String password){
        this.name = name;
        this.password = password;
    }
    void sentRequest(String userName, String text, Book newBook){
        mail.add(new Email(userName, "request", text, newBook));
    }
    Book getBookFromLetter(int index){
        return mail.get(index - 1).getAddition();
    }
}
