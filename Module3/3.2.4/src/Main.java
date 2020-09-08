/*
С помощью функций копирования и конкатенации составить из частей слова "информатика" слово "торт"
 */

public class Main {
    public static void main(String[] args) {
        try {
            StringBuilder word = new StringBuilder("информатика");
            System.out.println();
            StringBuilder result = new StringBuilder(word.charAt(7) + word.substring(3, 5) + word.charAt(7));
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}