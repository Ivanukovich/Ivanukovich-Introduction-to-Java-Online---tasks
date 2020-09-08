import java.util.Scanner;

public class Payment {
    double cost;
    Product[] products;
    Payment(){
        cost = 0;
    }
    class Product{
        String name;
        double cost;
        Product(){
            name = "";
            cost = 0;
        }
        Product(String name, double cost){
            this.name = name;
            this.cost = cost;
        }
        double getCost(){
            return cost;
        }
        String getName(){
            return name;
        }
    }
    public void setPayment(){
        System.out.println("Input number of Products");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        products = new Product[number];
        String name;
        double cost;
        for (int i = 0; i < number; ++i){
            System.out.println("Input product name:");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Input cost");
            cost = sc.nextDouble();
            products[i] = new Product(name, cost);
            this.cost += products[i].getCost();
        }
    }
    public void printCheck(){
        for (int i = 0; i < products.length; ++i){
            System.out.print(products[i].getName());
            int lengh = String.valueOf(products[i].getCost()).length() + products[i].getName().length();
            for (int j = 0; j < 20 - lengh; ++j){
                System.out.print(".");
            }
            System.out.println(products[i].cost);
        }
    }
}
