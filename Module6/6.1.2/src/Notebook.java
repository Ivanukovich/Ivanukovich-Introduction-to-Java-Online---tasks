import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Notebook {
    private SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    List<Note> notes;
    String path;
    void getData(String path) throws FileNotFoundException, ParseException {
        this.path = path;
        FileReader reader = new FileReader(path);
        Scanner sc = new Scanner(reader);
        String topic;
        String email;
        Date date;
        String dateTxt;
        String Line;
        StringBuilder message = new StringBuilder();
        notes = new ArrayList<Note>();
        while (sc.hasNextLine()){
            topic = sc.nextLine();
            if (sc.hasNextLine()) {
                email = sc.nextLine();
                if (!isValidEmail(email)) {
                    System.out.println("wrong format");
                    break;
                }
            }
            else {
                System.out.println("wrong format");
                break;
            }
            if (sc.hasNextLine()) {
                dateTxt = sc.nextLine();
                if (!isValidDate(dateTxt)) {
                    System.out.println("wrong format");
                    break;
                }
                date = format.parse(dateTxt);
            }
            else {
                System.out.println("wrong format");
                break;
            }
            if (sc.hasNextLine()) {
                Line = sc.nextLine();
                while (!Line.equals("") && sc.hasNextLine()) {
                    message.append(Line);
                    message.append("\n");
                    Line = sc.nextLine();
                }
                if (!sc.hasNextLine()) {
                    message.append(Line);
                }
            }
            else {
                System.out.println("wrong format");
                break;
            }
            notes.add(new Note(topic, email, date, new String(message)));
            message = new StringBuilder();
        }
    }
    void outPut(){
        for (int i = 0; i < notes.size(); ++i){
            System.out.println(notes.get(i).toString());
        }
    }
    void sortByTopic(){
        Note save;
        for (int i = 0; i < notes.size() - 1; ++i) {
            for (int j = 0; j < notes.size() - 1; ++j) {
                if (compareStrings(notes.get(j).getTopic(), notes.get(j + 1).getTopic())) {
                    save = notes.get(j + 1);
                    notes.set(j + 1, notes.get(j));
                    notes.set(j, save);
                }
            }
        }
    }
    void sortByEmail(){
        Note save;
        for (int i = 0; i < notes.size() - 1; ++i) {
            for (int j = 0; j < notes.size() - 1; ++j) {
                if (compareStrings(notes.get(j).getEmail(), notes.get(j + 1).getEmail())) {
                    save = notes.get(j + 1);
                    notes.set(j + 1, notes.get(j));
                    notes.set(j, save);
                }
            }
        }
    }
    void sortByDate(){
        Note save;
        for (int i = 0; i < notes.size() - 1; ++i) {
            for (int j = 0; j < notes.size() - 1; ++j) {
                if ( notes.get(j).getDate().compareTo(notes.get(j + 1).getDate()) > 0){
                    save = notes.get(j + 1);
                    notes.set(j + 1, notes.get(j));
                    notes.set(j, save);
                }
            }
        }
    }
    void removeNote (int index){
        if (index <= notes.size() - 1 && index >= 0){
            notes.remove(index);
        }
        else {
            System.out.println("no such index");
        }

    }
    void addNote () throws ParseException {
        Note newNote;
        Scanner sc = new Scanner(System.in);
        String topic;
        String email;
        Date date;
        String dateTxt;
        String Line;
        StringBuilder message = new StringBuilder();
        System.out.println("input topic:");
        topic = sc.nextLine();
        System.out.println("input email");
        email = sc.nextLine();
        while (!isValidEmail(email)) {
            System.out.println("wrong format");
            email = sc.nextLine();
        }
        System.out.println("input date");
        dateTxt = sc.nextLine();
        while(!isValidDate(dateTxt)) {
            System.out.println("wrong format");
            dateTxt = sc.nextLine();

        }
        date = format.parse(dateTxt);
        System.out.println("input message");
        Line = sc.nextLine();
        while (!Line.equals("")) {
            message.append(Line);
            message.append("\n");
            Line = sc.nextLine();
        }

        notes.add(new Note(topic, email, date, new String(message)));
    }
    void write() throws IOException {
        try(FileWriter writer = new FileWriter(path);) {
            for (int i = 0; i < notes.size(); ++i) {
                writer.append(notes.get(i).toString());
                writer.append("\n");
            }
        }
        catch(IOException ex){
        }
    }
    private boolean isValidEmail(String input){
        int indexOfAtIndex = input.indexOf("@");
        int indexOfFinish = input.indexOf(".com");
        if (indexOfAtIndex > 3 && indexOfFinish > indexOfAtIndex + 3) {
            for (int i = 0; i < indexOfFinish; ++i) {
                if (!isValidSymbol(input.charAt(i)) && i!= indexOfAtIndex){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
    private boolean isValidSymbol(char s){
        if ((s >= 'A' && s <= 'Z')||(s >= 'a' && s <= 'z')||(s >= '0' && s <= '9')){
            return true;
        }
        else {
            return false;
        }
    }
    private boolean isValidDate(String input) {
        try {
            format.parse(input);
            return true;
        }
        catch (ParseException e) {
            return false;
        }
    }
    private boolean compareStrings(String s1, String s2){
        int i = 0;
        while (i < s1.length()-1 && i < s2.length()-1 && s1.charAt(i) == s2.charAt(i)){
            ++i;
        }
        return s1.charAt(i) > s2.charAt(i);
    }
    class Note{
        String topic;
        String email;
        Date date;
        String message;
        Note(String topic, String email, Date date, String message){
            this.topic = topic;
            this.email = email;
            this.date = date;
            this.message = message;
        }
        void outPut(){
            System.out.println(topic + "\n" + email + "\n" + date + "\n" + message);
        }
        String getTopic(){
            return topic;
        }
        String getEmail(){
            return email;
        }
        Date getDate(){
            return  date;
        }
        @Override
        public String toString() {
            return topic + "\n" + email + "\n" + format.format(date.getTime()) + "\n" + message;
        }
    }
}

