/*
Создать класс Test1 с 2мя переменными.
Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение этих
двух переменных.
 */

public class Main {
    public static void main(String[] args) {
        Test1 t = new Test1(1, 2);
        t.output();
        t.changeNum1(3);
        t.output();
        System.out.println(t.sum());
        System.out.println(t.max());
    }
}