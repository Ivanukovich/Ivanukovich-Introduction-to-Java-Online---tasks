/*
Создать класс Payment с внутренним классом, с помощью объектов которого
можно сформировать покупку из нескольких товаров
 */

public class Main {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.setPayment();
        p.printCheck();
    }
}