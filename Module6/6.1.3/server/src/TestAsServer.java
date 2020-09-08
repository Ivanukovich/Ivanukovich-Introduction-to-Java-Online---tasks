import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
/*
Создайте клиент-серверное приложение Архив
-в архиве хранятся дела(например, студентов). Архив находится на сервере.
-Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения,
или создать новое дело.
-Для реализвации сетевого соединения использовать сокеты
-формат хранения данных на сервере - XML-документ
 */

public class TestAsServer {
    public static void main(String[] args) throws InterruptedException {
        try (ServerSocket server= new ServerSocket(3345)){
            List<Student> students = readData();
            Socket client = server.accept();
            System.out.println("Connection accepted.");
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(client.getInputStream());
            String password = in.readUTF();
            String command;
            String name;
            String phone;
            String data;
            int index;
            if (password.equalsIgnoreCase("1")) {
                out.writeUTF("professor");
                while (!client.isClosed()) {
                    command = in.readUTF();
                    if (command.equalsIgnoreCase("addStudent")) {
                        name = in.readUTF();
                        phone = in.readUTF();
                        data = in.readUTF();
                        students.add(new Student(name, phone, data));
                        System.out.println("new student was added:");
                        students.get(students.size() - 1).outPut();
                    }
                    if (command.equalsIgnoreCase("editStudentPhone")) {
                        name = in.readUTF();
                        index = getNameIndex(name, students);
                        if (index != -1) {
                            out.writeUTF("found");
                            phone = in.readUTF();
                            students.get(index).setPhone(phone);
                            students.get(index).outPut();
                            System.out.println("edited info:");
                            students.get(students.size() - 1).outPut();
                        }
                        else {
                            out.writeUTF("notFound");
                        }
                    }
                    if (command.equalsIgnoreCase("editStudentData")) {
                        name = in.readUTF();
                        index = getNameIndex(name, students);
                        if (index != -1) {
                            out.writeUTF("found");
                            data = in.readUTF();
                            students.get(index).setPhone(data);
                            students.get(index).outPut();
                            System.out.println("edited info:");
                            students.get(students.size() - 1).outPut();
                        }
                        else {
                            out.writeUTF("notFound");
                        }
                    }
                    if (command.equalsIgnoreCase("getData")) {
                        for (int i = 0; i < students.size(); ++i){
                            out.writeUTF(students.get(i).toString());
                        }
                        out.writeUTF("finished");
                    }
                    if (command.equalsIgnoreCase("getDataByName")) {
                        name = in.readUTF();
                        index = getNameIndex(name, students);
                        if (index != -1) {
                            out.writeUTF("found");
                            out.writeUTF(students.get(index).toString());
                        }
                        else {
                            out.writeUTF("notFound");
                        }
                    }
                    Thread.sleep(2000);
                    out.flush();
                }
            }
            in.close();
            out.close();
            client.close();
            System.out.println("Closing connections & channels - DONE.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readData(){
        try {
            List<Student> students = new ArrayList<Student>();
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("Data.xml");
            Node root = document.getDocumentElement();
            System.out.println("List of students:");
            System.out.println();
            String name;
            String phone;
            String data;
            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {
                    NodeList bookProps = book.getChildNodes();
                    name = bookProps.item(1).getChildNodes().item(0).getTextContent();
                    phone = bookProps.item(3).getChildNodes().item(0).getTextContent();
                    data = bookProps.item(5).getChildNodes().item(0).getTextContent();
                    students.add(new Student(name, phone, data));
                    students.get(students.size() - 1).outPut();
                }
            }
            return students;
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
            return null;
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
            return null;
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            return null;
        }
    }
    public static int getNameIndex(String name, List<Student>students){
        int index = -1;
        for (int i = 0; i < students.size(); ++i) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                index = i;
            }
        }
        return index;
    }
}