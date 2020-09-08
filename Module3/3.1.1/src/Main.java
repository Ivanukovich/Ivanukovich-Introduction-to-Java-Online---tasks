import java.util.Scanner;

/*
Дан массив названий переменных в camelCase. Преобразовать название в snake_case
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int N; //количество названий
            System.out.println("Input N:");
            N = in.nextInt();
            while (N < 1){
                System.out.println("Input N:");
                N = in.nextInt();
            }
            in.nextLine();
            String str;
            StringBuilder []names = new StringBuilder[N];
            System.out.println("Input Names:");
            for (int i = 0; i < N; ++i){ //Ввод названий
                System.out.println(i + 1 + ":");
                str = in.nextLine();
                while (!isCamelCase(str)){
                    System.out.println("Input another name");
                    str = in.nextLine();
                }
                names[i] = new StringBuilder(str);
                System.out.println(names[i]);
            }
            for (int i = 0; i < N; ++i){
                for (int j = 0; j < names[i].length(); ++j){
                    if (names[i].charAt(j) <= 'Z' && names[i].charAt(j) >= 'A'){
                        names[i].setCharAt(j, (char)(names[i].charAt(j) + 'a' - 'A'));
                        if (j > 1) {
                            names[i].insert(j, '_');
                        }
                    }
                }
                System.out.println(names[i]);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static boolean isCamelCase(String str){
        boolean result = true;
        for (int i = 0; i < str.length(); ++i){
            if ((str.charAt(i) > 'Z' || str.charAt(i) < 'A') && (str.charAt(i) > 'z' || str.charAt(i) < 'a')){
                result = false;
                break;
            }
        }
        return result;
    }
}
