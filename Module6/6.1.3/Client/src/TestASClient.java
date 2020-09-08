import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestASClient {
    public static void main(String[] args) throws InterruptedException {
        try(Socket socket = new Socket("localhost", 3345);
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream oos = new DataOutputStream(socket.getOutputStream());
            DataInputStream ois = new DataInputStream(socket.getInputStream()); )
        {
            System.out.println("Client connected to socket.");
            System.out.println("Enter password");
            Thread.sleep(1000);
            String password = br.readLine();
            oos.writeUTF(password);
            oos.flush();
            Thread.sleep(1000);
            String access = ois.readUTF();
            String name;
            String phone;
            String data;
            String output;
            String found;
            if (access.equalsIgnoreCase("professor")){
                System.out.println("Enter command");
                String command = br.readLine();
                while(!command.equalsIgnoreCase("close")){
                    oos.writeUTF(command);
                    Thread.sleep(1000);
                    if (command.equalsIgnoreCase("addStudent")){
                        System.out.println("input name");
                        name = br.readLine();
                        System.out.println("input phone");
                        phone = br.readLine();
                        System.out.println("input data");
                        data = br.readLine();
                        oos.writeUTF(name);
                        oos.writeUTF(phone);
                        oos.writeUTF(data);
                    }
                    if (command.equalsIgnoreCase("editStudentPhone")){
                        System.out.println("input name of student you want to change");
                        name = br.readLine();
                        oos.writeUTF(name);
                        found = ois.readUTF();
                        if (found.equalsIgnoreCase("found")) {
                            System.out.println("input new phone1");
                            phone = br.readLine();
                            oos.writeUTF(phone);
                        }
                        if (found.equalsIgnoreCase("notFound")) {
                            System.out.println("student not found");
                        }
                    }
                    if (command.equalsIgnoreCase("editStudentData")){
                        System.out.println("input name of student you want to change");
                        name = br.readLine();
                        oos.writeUTF(name);
                        found = ois.readUTF();
                        if (found.equalsIgnoreCase("found")) {
                            System.out.println("input new data");
                            data = br.readLine();
                            oos.writeUTF(data);
                        }
                        if (found.equalsIgnoreCase("notFound")) {
                            System.out.println("student not found");
                        }
                    }
                    if (command.equalsIgnoreCase("getData")) {
                        output = ois.readUTF();
                        while (!output.equalsIgnoreCase("finished")){
                            System.out.println(output);
                            output = ois.readUTF();
                        }
                    }
                    if (command.equalsIgnoreCase("getDataByName")) {
                        System.out.println("input name of student you want to see");
                        name = br.readLine();
                        oos.writeUTF(name);
                        found = ois.readUTF();
                        if (found.equalsIgnoreCase("found")) {
                            output = ois.readUTF();
                            System.out.println(output);
                        }
                        if (found.equalsIgnoreCase("notFound")) {
                            System.out.println("student not found");
                        }
                    }
                    System.out.println("Enter command");
                    command = br.readLine();
                }
            }
            if (access.equalsIgnoreCase("student")){
            }
            System.out.println("Closing connections & channels on clentSide - DONE.");
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}