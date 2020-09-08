import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    List<User> users = new ArrayList<User>();
    List<Book>catalog = new ArrayList<Book>();
    Administrator administrator;
    Library(String userInfoPath, String adminPasswordPath, String bookCatalogPath) throws FileNotFoundException {
        FileReader reader = new FileReader(userInfoPath);
        Scanner sc = new Scanner(reader);
        String name;
        String password;
        String type;
        StringBuilder description;
        String line;
        while (sc.hasNextLine()){
            name = sc.nextLine();
            password = sc.nextLine();
            users.add(new User(name, password));
        }
        reader = new FileReader(adminPasswordPath);
        sc = new Scanner(reader);
        administrator = new Administrator(sc.nextLine(), sc.nextLine());
        reader = new FileReader(bookCatalogPath);
        sc = new Scanner(reader);
        while (sc.hasNextLine()){
            description = new StringBuilder();
            name = sc.nextLine();
            type = sc.nextLine();
            while (sc.hasNextLine()){
                line = sc.nextLine();
                if (line.equalsIgnoreCase("")){
                    break;
                }
                description.append(line);
            }
            catalog.add(new Book(name, new String(description), type.equals("p")));
        }
    }
    void workProcess (){
        String input;
        String command = "";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input name");
            input = sc.nextLine();
            int index = getUserIndex(input);
            while (index == -1 && !input.equals(administrator.getName())) {
                System.out.println("no such name");
                input = sc.nextLine();
                index = getUserIndex(input);
            }
            System.out.println("Input password");
            if (input.equals(administrator.getName())) {
                input = sc.nextLine();
                while (!administrator.isValidPassword(input) && !input.equals("change user")) {
                    System.out.println("wrong password. write 'change user' if you want to change name");
                    input = sc.nextLine();
                }
                if (!input.equals("change user")){
                    System.out.println("success");
                    adminInterface();
                }
            }
            else {
                input = sc.nextLine();
                while (!users.get(index).isValidPassword(input) && !input.equals("change user")) {
                    System.out.println("wrong password. write 'change user' if you want to change name");
                    input = sc.nextLine();
                }
                if (!input.equals("change user")){
                    System.out.println("success");
                    userInterface(index);
                }
            }
        }
    }
    void addBook(Book newBook){
        catalog.add(newBook);
        users.forEach(user -> user.sendNotification(newBook.getName() + " has been added"));
    }
    int bookSearch(String name){
        int index = 0;
        while(index < catalog.size()){
            if(catalog.get(index).getName().equalsIgnoreCase(name)){
                break;
            }
            ++index;
        }
        if (index == catalog.size()){
            index = -1;
        }
        return index;
    }
    void catalogOutPut(){
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (index < catalog.size()){
            if (index % 5 == 0 && index != 0){
                sc.nextLine();
            }
            System.out.println(catalog.get(index).toString());
            ++index;
        }
    }
    void removeBook(String name){
        int index = 0;
        while(index < catalog.size()){
            if(catalog.get(index).getName().equalsIgnoreCase(name)){
                catalog.remove(index);
                break;
            }
            ++index;
        }
    }
    void changeDescription(String name){
        int index = 0;
        String description;
        Scanner sc = new Scanner(System.in);
        while(index < catalog.size()){
            if(catalog.get(index).getName().equalsIgnoreCase(name)){
                description = sc.nextLine();
                catalog.get(index).setDescription(description);
                break;
            }
            ++index;
        }
    }
    int getUserIndex(String name){
        int index = 0;
        while (index < users.size()){
            if (users.get(index).getName().equalsIgnoreCase(name)){
                break;
            }
            ++index;
        }
        if (index == users.size()){
            index = -1;
        }
        return index;
    }
    void userInterface(int index){
        String command = "";
        String name;
        String description;
        String request;
        Book newBook;
        int i;
        Scanner sc = new Scanner(System.in);
        if (!users.get(index).isEmptyMail()){
            System.out.println("you have " + users.get(index).getEmailNumber()+ " new email(s)");
        }
        System.out.println("commands:\nshow mail\nshow letter\nshow catalog\nfind book\nadd book");
        while (!command.equals("exit")){
            System.out.println("write command");
            command = sc.nextLine();
            if (command.equals("show mail")){
                users.get(index).showMail();
            }
            if (command.equals("show letter")){
                System.out.println("input number of letter");
                command = sc.nextLine();
                while (!isNumeric(command)){
                    System.out.println("input number");
                    command = sc.nextLine();
                }
                i = Integer.parseInt(command);
                if (users.get(index).readEmail(i)) {
                    users.get(index).deleteEmail(i);
                }
            }
            if (command.equals("show catalog")){
                catalogOutPut();
            }
            if (command.equals("find book")){
                System.out.println("input name");
                name = sc.nextLine();
                i = bookSearch(name);
                if (i > -1){
                    System.out.println(catalog.get(i).toString());
                }
                else {
                    System.out.println("no books found");
                }
            }
            if (command.equals("add book")){
                System.out.println("Input name of book");
                name = sc.nextLine();
                System.out.println("Input description");
                description = sc.nextLine();
                System.out.println("Input request");
                request = sc.nextLine();
                newBook = new Book(name, description, false);
                administrator.sentRequest(users.get(index).getName(), request, newBook);
            }
        }
    }
    void adminInterface(){
        String command = "";
        String name;
        String description;
        int i;
        Book newBook;
        Scanner sc = new Scanner(System.in);
        if (!administrator.isEmptyMail()){
            System.out.println("you have " + administrator.getEmailNumber() + " new email(s)");
        }
        System.out.println("commands:\nshow mail\nshow letter\nshow catalog\nfind book\nadd book\nremove book");
        while (!command.equals("exit")){
            System.out.println("write command");
            command = sc.nextLine();
            if (command.equals("show mail")){
                administrator.showMail();
            }
            if (command.equals("show letter")){
                System.out.println("input number of letter");
                command = sc.nextLine();
                while (!isNumeric(command)){
                    System.out.println("input number");
                    command = sc.nextLine();
                }
                i = Integer.parseInt(command);
                if (administrator.readEmail(i)) {
                    System.out.println("accept request?");
                    command = sc.nextLine();
                    while (!command.equals("yes") && !command.equals("no")) {
                        System.out.println("write yes or no");
                        command = sc.nextLine();
                    }
                    if (command.equals("yes")) {
                        catalog.add(administrator.getBookFromLetter(i));
                    }
                    administrator.deleteEmail(i);
                }
            }
            if (command.equals("show catalog")){
                catalogOutPut();
            }
            if (command.equals("find book")){
                System.out.println("input name");
                name = sc.nextLine();
                i = bookSearch(name);
                if (i > -1){
                    System.out.println(catalog.get(i).toString());
                }
                else {
                    System.out.println("no books found");
                }
            }
            if (command.equals("remove book")){
                System.out.println("what book");
                name = sc.nextLine();
                i = bookSearch(name);
                if (i > -1){
                    catalog.remove(i);
                }
                else {
                    System.out.println("no books found");
                }
            }
            if (command.equals("add book")){
                System.out.println("Input name of book");
                name = sc.nextLine();
                System.out.println("Input description");
                description = sc.nextLine();
                newBook = new Book(name, description, false);
                addBook(newBook);
            }
        }
    }
    public boolean isNumeric(String strNum) {
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}

