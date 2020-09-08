import java.util.Scanner;

/*
Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод (методы) вычисления его площади,
если угол между сторонами длинной X и Y - прямой.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double X;
            double Y;
            double Z;
            double T;
            double A;
            Quadrangle qa = new Quadrangle();
            System.out.println("Input X:");
            X = sc.nextDouble();
            while (X <= 0){
                System.out.println("Input another X:");
                X = sc.nextDouble();
            }
            System.out.println("Input Y:");
            Y = sc.nextDouble();
            while (Y <= 0){
                System.out.println("Input another Y:");
                Y = sc.nextDouble();
            }
            System.out.println("Input Z:");
            Z = sc.nextDouble();
            while (Z <= 0){
                System.out.println("Input another Z:");
                Z = sc.nextDouble();
            }
            A = getDiagonal(X, Y);
            System.out.println("Input T:");
            T = sc.nextDouble();
            while (T <= 0 || Z + T <= A || A + T <= Z){ //проверяем, чтобы такой четырёхугольник существовал.
                System.out.println("Input another T:");
                T = sc.nextDouble();
            }

            System.out.println("Result: " + getArea(X, Y, A, Z, T));
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static double getArea(double X, double Y, double A, double Z, double T){
        double p = (A + Z + T)/2;
        return X * Y / 2 + Math.sqrt(p * (p - A) * (p - Z) * (p - T));
    }
    static double getDiagonal(double X, double Y){
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)); //находим длину диагонали, делящую четырехуголник на прямоугольный и произвольный треугольник.
    }
}