import java.util.Scanner;
/*
Создать класс Customer.
Определить конструкторы, set- и get- методы и метод toString().
Создать 2ой класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерий выбора данных и вывести эти данные на консоль.

Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id;
        String surname;
        String name;
        String fathername;
        String adress;
        int creditCard;
        int bankCredit;
        Customer []array = new Customer[4];
        for (int i = 0; i < 4; ++i){
            id = in.nextInt();
            surname = in.nextLine();
            in.nextLine();
            name = in.nextLine();
            in.nextLine();
            fathername = in.nextLine();
            in.nextLine();
            adress = in.nextLine();
            in.nextLine();
            creditCard = in.nextInt();
            bankCredit = in.nextInt();
            array[i] = new Customer(id, surname, name, fathername, adress, creditCard, bankCredit);
            System.out.println(array[i].toString());
        }
        Agregate A = new Agregate(array);
        A.sort();
        A.output(3, 5);
    }
}
