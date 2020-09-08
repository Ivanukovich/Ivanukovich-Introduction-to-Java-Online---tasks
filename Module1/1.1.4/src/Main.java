import java.util.Scanner;

/*
Дано действительное число R вида nnn.ddd. Поменять местами дробную и целую часть числа
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input R:");
            double R = in.nextDouble();
            while (R < 100 || R >= 1000 || R * 100 % 1 == 0 || R * 1000 % 1 != 0){ //проверяем, чтобы целая часть была трёхзначной, а у дробной 3-я цифра была > 0 и чтобы после нее ничего не стояло
                System.out.println("Input another R:");
                R = in.nextDouble();
            }
            double s = (int)R;
            double f = R - s;
            double result = f * 1000 + s/1000;
            System.out.println("Result: " + result);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
