import java.util.Scanner;

/*
Напечатать true если точка (x, y) лежит в области, и false - в противном случае
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("input x:");
            int x = in.nextInt();
            System.out.println("input y:");
            int y = in.nextInt();
            boolean result;
            if (-3 <= y && y <= 0){
                if (-4 <= x && x <= 4){
                    result = true;
                }
                else{
                    result = false;
                }
            }
            else{
                if (0 < y && y <= 4){
                    if (-2 <= x && x <= 2){
                        result = true;
                    }
                    else{
                        result = false;
                    }
                }
                else{
                    result = false;
                }
            }
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
