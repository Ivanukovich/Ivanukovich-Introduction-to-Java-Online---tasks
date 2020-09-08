import java.util.Scanner;

/*
Даны дроби pi/qi (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их
в порядке возрастания.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input N:");
            int n = in.nextInt();
            while (n <= 0) {
                System.out.println("Input another N");
                n = in.nextInt();
            }
            int[]p = new int[n];
            System.out.println("Input p:");
            for (int i = 0; i < n; ++i){
                System.out.println(i + 1);
                p[i] = in.nextInt();
                while (n <= 0) {
                    System.out.println("Input another " + (i + 1));
                    p[i] = in.nextInt();
                }
            }
            int[]q = new int[n];
            System.out.println("Input q:");
            for (int i = 0; i < n; ++i){
                System.out.println(i + 1);
                q[i] = in.nextInt();
                while (n <= 0) {
                    System.out.println("Input another " + (i + 1));
                    q[i] = in.nextInt();
                }
            }
            for (int i = 0; i < n; ++i){
                System.out.println(p[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; ++i){
                System.out.println(q[i] + " ");
            }
            commonDenominatorChange(q, p, n);
            sort(p, n);
            System.out.println("Result");
            for (int i = 0; i < n; ++i){
                System.out.println(p[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; ++i){
                System.out.println(q[i] + " ");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    static int commonDenominatorFind (int []q, int n){
        int common = q[0];
        int copyOfElement;
        int copyOfCommon;
        int count;
        for (int i = 1; i < n; ++i){
            copyOfElement = q[i];
            copyOfCommon = common;
            count = 2;
            while (copyOfElement != 1){
                while (copyOfElement % count == 0){
                    if (copyOfCommon % count == 0){
                        copyOfCommon /= count;
                    }
                    else {
                        common *= count;
                    }
                    copyOfElement /= count;
                }
                ++count;
            }
        }
        return common;
    }
    static void commonDenominatorChange (int []q, int[]p, int n){
        int common = commonDenominatorFind(q, n);
        for (int i = 0; i < n; ++i){
            p[i] *= common / q[i];
            q[i] = common;
        }
    }
    static void sort (int[]p, int n){
        int save;
        for (int i = 1; i < n; ++i){
            for (int j = 1; j < n; ++j){
                if (p[j] < p[j - 1]){
                    save = p[j];
                    p[j] = p[j - 1];
                    p[j - 1] = save;
                }
            }
        }
    }
}