import java.util.Scanner;
/*
Создать класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из пяти элементов)
Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и номеров групп стедентов, имеющих оценки, равные только 9 и 10.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Student[] students = new Student[10];
            int group;
            int[] marks = new int[5];
            for (int i = 0; i < 10; ++i) {
                System.out.println(i + " student:");
                System.out.println("input Name:");
                String name = in.nextLine();
                System.out.println("input group:");
                group = in.nextInt();
                while (group <= 0) {
                    group = in.nextInt();
                }
                System.out.println("input marks:");
                for (int j = 0; j < 5; ++j) {
                    marks[j] = in.nextInt();
                    while (marks[j] < 0 || marks[j] > 10) {
                        marks[j] = in.nextInt();
                    }
                }
                students[i] = new Student(name, group, marks);
                in.nextLine();
            }
            for (int i = 0; i < 10; ++i) {
                students[i].output();
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}