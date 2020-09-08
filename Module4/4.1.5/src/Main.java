/*
Описать класс, реализующий десятичный счетчик, который может увеличивать
или уменьшать свое значение на единицу в заданном диапазоне. Предусмотреть
инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет два метода: увеличения и уменьшения, и метод,
позволяющий получить его текущее состояние.
 */


public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.output();
        c = new Counter(0, 10, 5);
        c.increase();
        c.output();
        c.decrease();
        c.output();
    }
}