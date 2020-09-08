/*
Найти произведение квадратов первых 200 чисел
 */

public class Main {
    public static void main(String[] args) {
        int mult = 1;
        for (int i = 1; i <= 200; ++i){
            mult *= Math.pow(i, 2);
        }
        System.out.println("Result: " + mult);
    }
}
