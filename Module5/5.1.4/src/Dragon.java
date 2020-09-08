import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dragon {
    Treasure []treasures;
    Dragon (String path, int size) throws IOException {
        treasures = new Treasure[size];
        FileReader reader = new FileReader(path);
        Scanner sc = new Scanner(reader);
        String treasureInfo;
        int space;
        int value;
        String name;
        for (int i = 0; i < size; ++i){
            treasureInfo = sc.nextLine();
            space = treasureInfo.indexOf(' ');
            name = treasureInfo.substring(0, space);
            value = Integer.parseInt(treasureInfo.substring(space + 1, treasureInfo.length()));
            treasures[i] = new Treasure(name, value);
        }

    }
    void findMostExpensive(){
        int indexOfMaxValue = 0;
        for (int i = 1; i < treasures.length; ++i){
            if (treasures[i].getValue() > treasures[indexOfMaxValue].getValue()){
                indexOfMaxValue = i;
            }
        }
        treasures[indexOfMaxValue].outPut();
    }
    void searchForSum(int valueSum){
        Treasure[]copy = treasures;
        sort(copy);
        List<Integer> indexes = new ArrayList<>();
        search(copy, valueSum, 0, indexes,0);
    }
    void sort(Treasure[]treasures){
        Treasure save;
        for (int i = 0; i < treasures.length - 1; ++i){
            for (int j = 0; j < treasures.length - 1; ++j){
                if (treasures[j].getValue() > treasures[j + 1].getValue()){
                    save = treasures[j];
                    treasures[j] = treasures[j + 1];
                    treasures[j + 1] = save;
                }
            }
        }
    }
    boolean search(Treasure[] treasures, int valueSum, int i, List<Integer> indexes, int sum){
        while (i < 10 && sum + treasures[i].getValue() <= valueSum){
            sum += treasures[i].getValue();
            indexes.add(i);
            ++i;
            if (sum < valueSum){
                search(treasures, valueSum, i, indexes, sum);
            }
            else {
                for (int j = 0; j < indexes.size(); ++j){
                    System.out.println(treasures[indexes.get(j)].getName());
                }
                System.out.println();
            }
            indexes.remove(indexes.size() - 1);
            sum -= treasures[i - 1].getValue();
        }
        return true;
    }
    class Treasure{
        String name;
        int value;
        Treasure(String name, int value){
            this.name = name;
            this.value = value;
        }
        int getValue(){
            return value;
        }
        String getName(){
            return name;
        }
        void outPut(){
            System.out.println(name + " : " + value);
        }
    }
}
