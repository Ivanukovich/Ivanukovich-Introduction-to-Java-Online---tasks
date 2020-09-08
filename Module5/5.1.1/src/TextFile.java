import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {
    File file;
    Directory directory;
    FileWriter writer;
    TextFile(String directory){
        this.directory = new Directory(directory);
    }
    void createNewFile(String name) throws IOException {
        file = new File(directory.getDirectory() + "\\" + name + ".txt");
        file.createNewFile();
    }
    void rename(String newName) throws IOException {
        File newFile = new File(directory.getDirectory() + "\\" + newName + ".txt");
        file.renameTo(newFile);
        file = new File(directory.getDirectory() + "\\" + newName + ".txt");
    }
    void write(String text) throws IOException {
        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(text);
        }
    }
    void read() throws IOException {
        FileReader reader = new FileReader(file);
        Scanner sc = new Scanner(reader);
        StringBuilder text = new StringBuilder();
        while (sc.hasNextLine()){
            text.append(sc.nextLine());
        }
        reader.close();
        System.out.println(text);
    }
    void delete(){
        file.delete();
    }
    class Directory{
        String directory;
        Directory(String directory){
            this.directory = directory;
        }
        void setDirectory(String directory){
            this.directory = directory;
        }
        String getDirectory(){
            return directory;
        }
    }
}
