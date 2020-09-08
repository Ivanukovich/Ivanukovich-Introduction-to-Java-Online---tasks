import java.math.BigInteger;
import java.util.Scanner;

/*
Счета Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("input name");
        name = in.nextLine();
        Customer c = new Customer(name);
        c.addAccount(inputAccount());
        c.addAccount(inputAccount());
        c.addAccount(inputAccount());
        c.addAccount(inputAccount());
        c.block(new BigInteger("11"));
        c.block(new BigInteger("33"));
        c.outPut();
        c.sortByBlock();
        System.out.println("sorted");
        c.getMoney(new BigInteger("22"), 40);
        c.outPut();
        c.sortByBalance();
        c.outPut();
        c.getSums();
    }
    static Account inputAccount(){
        String number;
        Scanner in = new Scanner(System.in);
        System.out.println("input number");
        number = in.nextLine();
        while (number.length()!= 2 || !isDigit(number)){
            System.out.println("wrong");
            number = in.nextLine();
        }
        System.out.println("input money");
        double money;
        money = in.nextDouble();
        while (money < 0){
            System.out.println("wrong");
            money = in.nextDouble();
        }
        return new Account(new BigInteger(number), money);
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
