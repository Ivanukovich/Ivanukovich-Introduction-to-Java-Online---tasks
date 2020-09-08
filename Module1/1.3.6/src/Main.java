/*
Вывести на экран соответствие между и их численными обозначениями в памяти компьютера
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 255; ++i){
            System.out.println(i + "   " + (char)i);
        }
    }
}
