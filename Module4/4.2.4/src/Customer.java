import java.math.BigInteger;

public class Customer {
    String name;
    Account[] accounts;
    Customer (String name){
        this.name = name;
    }
    void addAccount (Account newAccount){
        if (accounts != null) {
            Account[] copy = accounts;
            accounts = new Account[copy.length + 1];
            for (int i = 0; i < accounts.length - 1; ++i) {
                accounts[i] = copy[i];
            }
            accounts[accounts.length - 1] = newAccount;
        }
        else {
            accounts = new Account[1];
            accounts[0] = newAccount;
        }

    }
    void getSums(){
        double positive = 0;
        double negative = 0;
        for (int i = 0; i < accounts.length; ++i){
            if (accounts[i].getBalance() < 0){
                negative += accounts[i].getBalance();
            }
            else {
                positive += accounts[i].getBalance();
            }
        }
        System.out.print(positive + "\n" + negative);
    }
    void search (BigInteger number){
        for (int i = 0; i < accounts.length; ++i){
            if (accounts[i].getNumber() == number){
                System.out.println(accounts[i].toString());
            }
        }
    }
    void outPut(){
        for (int i = 0; i < accounts.length; ++i){
            System.out.println(accounts[i].toString());
        }
    }
    void sortByBalance(){
        Account save;
        for (int j = 0; j < accounts.length - 1; ++j){
            for (int i = 0; i < accounts.length - 1; ++i){
                if (accounts[i].getBalance() > accounts[i + 1].getBalance()){
                    save = accounts[i];
                    accounts[i] = accounts[i + 1];
                    accounts[i + 1] = save;
                }
            }
        }
    }
    void sortByBlock(){
        Account save;
        for (int j = 0; j < accounts.length - 1; ++j){
            for (int i = 0; i < accounts.length - 1; ++i){
                if (accounts[i].getBlock() && !accounts[i + 1].getBlock()){
                    save = accounts[i];
                    accounts[i] = accounts[i + 1];
                    accounts[i + 1] = save;
                }
            }
        }
    }
    void putMoney (BigInteger index, double money){
        for (int i = 0; i < accounts.length; ++i){
            if (accounts[i].getNumber().equals(index)){
                accounts[i].putMoney(money);
            }
        }
    }
    void getMoney (BigInteger index, double money){
        for (int i = 0; i < accounts.length; ++i){
            if (accounts[i].getNumber().equals(index)){
                accounts[i].getMoney(money);
            }
        }
    }
    void block (BigInteger index){
        for (int i = 0; i < accounts.length; ++i){
            if (accounts[i].getNumber().equals(index)){
                accounts[i].block();
            }
        }
    }
    void unblock (BigInteger index){
        for (int i = 0; i < accounts.length; ++i){
            if (accounts[i].getNumber().equals(index)){
                accounts[i].unblock();
            }
        }
    }
}
