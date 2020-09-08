import java.math.BigInteger;

public class Account {
    BigInteger number;
    double balance;
    boolean blocked;
    Account (BigInteger number, double money){
        this.number = number;
        balance = money;
        blocked = false;
        System.out.println(this.number);
    }
    void getMoney (double money){
        if (!blocked){
            balance -= money;
        }
    }
    void putMoney (double money){
        balance += money;
    }
    void block(){
        blocked = true;
    }
    void unblock(){
        blocked = false;
    }
    double getBalance(){
        return balance;
    }
    BigInteger getNumber(){return number;}
    boolean getBlock(){return blocked;}
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(number + "\n" + balance + "\n");
        if (blocked){
            result.append("blocked\n");
        }
        return new String(result);
    }
}
