public class TextWork {
    int parNum;
    int [][][]borders;
    StringBuilder sentenceSort(StringBuilder text){
        String savePar;
        for (int k = 0; k < parNum - 1; ++k){
            for (int i = 0; i < parNum - 1; ++i){
               if (borders[i].length > borders[i + 1].length){
                   savePar = text.substring(borders[i][0][0], borders[i + 1][0][0]);
                   text.insert(borders[i + 1][borders[i+1].length - 1][borders[i+1][borders[i+1].length - 1].length - 1] + 1, savePar);
                   text.delete(borders[i][0][0], borders[i + 1][0][0]);
                   borderFix(i, text);
               }
            }
        }
        return text;
    }
    StringBuilder wordSort2(StringBuilder text, char symbol){
        String savePar;
        for (int i = 0; i < parNum; ++i){
            for (int j = 0; j < borders[i].length; ++j){
                for (int k = 0; k < borders[i][j].length - 2; ++k){
                    for (int l = 0; l < borders[i][j].length - 2; ++l){
                        if (compare(text.substring(borders[i][j][l],borders[i][j][l + 1]), text.substring( borders[i][j][l + 1],borders[i][j][l + 2]), symbol)){
                            savePar = text.substring(borders[i][j][l], borders[i][j][l + 1] - 1);
                            text.insert(borders[i][j][l + 2] - 1, savePar);
                            text.delete(borders[i][j][l], borders[i][j][l + 1]);
                            borders[i][j][l + 1] = borders[i][j][l] + borders[i][j][l + 2] - borders[i][j][l + 1];
                            text.insert(borders[i][j][l + 1] - 1, " ");
                        }
                    }
                }
            }
        }
        return text;
    }
    boolean compare (String word1, String word2, char symbol){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < word1.length(); ++i){
            if (word1.charAt(i) == symbol){
                ++count1;
            }
        }
        for (int i = 0; i < word2.length(); ++i){
            if (word2.charAt(i) == symbol){
                ++count2;
            }
        }
        if (count1!=count2){
            return count1 > count2;
        }
        else{
            int i = 0;
            while (i < word1.length() - 1 && i < word2.length() - 1 && word1.charAt(i) == word2.charAt(i)) {
                ++i;
            }
            return word1.charAt(i) > word2.charAt(i);
        }
    }
    StringBuilder wordSort(StringBuilder text){
        String savePar;
        for (int i = 0; i < parNum; ++i){
            for (int j = 0; j < borders[i].length; ++j){
                for (int k = 0; k < borders[i][j].length - 2; ++k){
                    for (int l = 0; l < borders[i][j].length - 2; ++l){
                        if (borders[i][j][l + 1] - borders[i][j][l] > borders[i][j][l + 2] - borders[i][j][l + 1]){
                            savePar = text.substring(borders[i][j][l], borders[i][j][l + 1] - 1);
                            text.insert(borders[i][j][l + 2] - 1, savePar);
                            text.delete(borders[i][j][l], borders[i][j][l + 1]);
                            borders[i][j][l + 1] = borders[i][j][l] + borders[i][j][l + 2] - borders[i][j][l + 1];
                            text.insert(borders[i][j][l + 1] - 1, " ");
                        }
                    }
                }
            }
        }
        return text;
    }
    void borderFix (int i, StringBuilder text) {
        int[][] saveBorders;
        int difference1;
        int difference2;
        difference1 = borders[i + 1][borders[i+1].length - 1][borders[i+1][borders[i+1].length - 1].length - 1] - borders[i + 1][0][0] + 1;
        difference2 = borders[i + 1][0][0] - borders[i][0][0];
        for (int j = 0; j < borders[i].length; ++j) {
            for (int k = 0; k < borders[i][j].length; ++k) {
                borders[i][j][k] += difference1;
            }
        }
        for (int j = 0; j < borders[i + 1].length; ++j) {
            for (int k = 0; k < borders[i + 1][j].length; ++k) {
                borders[i + 1][j][k] -= difference2;
            }
        }
        saveBorders = borders[i];
        borders[i] = borders[i + 1];
        borders[i + 1] = saveBorders;
    }
    void textSplit(StringBuilder text, int parNum){
        this.parNum = parNum;
        borders = new int[parNum][][];
        int j = 0;
        int count = 0;
        for (int i = 0; i < text.length(); ++i){
            if (text.charAt(i) == '.'){
                ++count;
            }
            if (text.charAt(i) == '\n'){
                borders[j] = new int[count][];
                count = 0;
                ++j;
            }
        }
        j = 0;
        int k = 0;
        for (int i = 0; i < text.length(); ++i){
            if (text.charAt(i) == ' ' || text.charAt(i) == '.'){
                ++count;
            }
            if (text.charAt(i) == '\n'){
                ++j;
                k = 0;
            }
            if (text.charAt(i) == '.'){
                borders[j][k] = new int[count + 1];
                count = 0;
                ++k;
                if (text.charAt(i + 1) == ' '){
                    ++i;
                }
            }
        }
        j = 0;
        k = 0;
        int h = 0;
        borders[0][0][0] = 0;
        for (int i = 0; i < text.length(); ++i){
            if (text.charAt(i) == ' ' || text.charAt(i) == '.'){
                ++h;
                borders[j][k][h] = i + 1;
            }
            if (text.charAt(i) == '\n'){
                ++j;
                k = 0;
                h = 0;
                if (i + 1 < text.length()){
                    borders[j][k][h] = i + 1;
                }
            }
            if (text.charAt(i) == '.'){
                ++k;
                h = 0;
                if (text.charAt(i + 1) == ' '){
                    ++i;
                    borders[j][k][h] = i + 1;
                }
            }
        }
    }
}
