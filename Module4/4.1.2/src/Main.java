/*
Создать класс Test2 с 2мя переменными.
Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию.
Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Test2 t = new Test2(1, 2);
            System.out.println(t.getNum1());
            System.out.println(t.getNum2());
            t.setNum1(3);
            t.setNum2(4);
            System.out.println(t.getNum1());
            System.out.println(t.getNum2());
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}