import java.util.Scanner;

/*
На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие,
между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input n:");
            int n = in.nextInt();
            while (n <= 1) {
                System.out.println("Input another n");
                n = in.nextInt();
            }
            double [][]points = new double[n][2];
            for (int i = 0; i < n; ++i){
                System.out.println(i + " x:");
                points[i][0] = in.nextDouble();
                System.out.println(i + " y:");
                points[i][1] = in.nextDouble();
            }
            double []max = new double[2];
            double maxLeangh = 0;
            double leangh;
            for (int i = 0; i < n - 1; ++i){
                for (int j = i + 1; j < n; ++j){
                    leangh = Math.pow(Math.abs(points[i][0] - points[j][0]), 2) + Math.pow(Math.abs(points[i][1] - points[j][1]), 2);
                    if (leangh > maxLeangh){
                        maxLeangh = leangh;
                        max[0] = i + 1;
                        max[1] = j + 1;
                    }
                }
            }
            System.out.println("The biggest leangh is between " + max[0] + " and " + max[1] + " points");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}