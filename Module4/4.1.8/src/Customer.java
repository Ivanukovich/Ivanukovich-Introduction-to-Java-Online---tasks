public class Customer {
    int id;
    String surname;
    String name;
    String fathername;
    String adress;
    int creditCard;
    int bankCredit;
    Customer (int id, String surname,String name, String fathername, String adress, int creditCard, int bankCredit){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fathername = fathername;
        this.adress = adress;
        this.creditCard = creditCard;
        this.bankCredit = bankCredit;
    }
    void setId(int id) {
        this.id = id;
    }
    void setSurname(String surname) {
        this.surname = surname;
    }
    void setName(String name){
        this.name = name;
    }
    void setFathername(String fathername){
        this.fathername = fathername;
    }
    void setAdress(String adress){
        this.adress = adress;
    }
    void setCreditCard(int creditCard){
        this.creditCard = creditCard;
    }
    void setBankCredit(int bankCredit){
        this.bankCredit = bankCredit;
    }
    int getId() {
        return id;
    }
    String getSurname() {
        return surname;
    }
    String getName(){
        return name;
    }
    String getFathername(){
        return fathername;
    }
    String getAdress(){
        return adress;
    }
    int getCreditCard(){
        return creditCard;
    }
    int getBankCredit(){
        return bankCredit;
    }
    @Override
    public String toString(){
        return new String(id + " " + surname + " " + name + " " + fathername + " " + adress + " " + creditCard + " " + bankCredit);
    }
}
