import java.io.IOException;
/*
Создать класс Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
 */


public class Main {
    public static void main(String[] args) throws IOException {
        String path = "E:\\epam\\Module5\\task 5.1.1\\src";
        TextFile tf = new TextFile(path);
        tf.createNewFile("text");
        tf.write("aaaa");
        tf.write("bbbb");
        tf.rename("newName");
        tf.read();
        tf.delete();
    }
}