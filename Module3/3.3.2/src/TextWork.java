import java.util.ArrayList;

public class TextWork {
    void sentenceSort(StringBuilder text) {
        ArrayList<Integer> blockStart = new ArrayList<Integer>();
        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == '<') {
                ++i;
                if (text.charAt(i) != '/') {
                    blockStart.add(i - 1);
                    while (text.charAt(i) != '>') {
                        ++i;
                    }
                    if (text.charAt(i - 1) == '/'){
                        System.out.print(text.substring(blockStart.get(blockStart.size() - 1), i + 1));
                        blockStart.remove(blockStart.size() - 1);
                        System.out.println("\nempty tag");
                        System.out.println();
                        System.out.println();
                    }
                } else {
                    while (text.charAt(i) != '>') {
                        ++i;
                    }
                    StringBuilder block = new StringBuilder(text.substring(blockStart.get(blockStart.size() - 1), i + 1));
                    boolean start = false;
                    int op = 0;
                    int cl = 0;
                    boolean first = true;
                    for (int j = 0; j < block.length(); ++j){
                        if (block.charAt(j) == ' ' && start){
                            block.delete(j, j + blockStart.size() - 1);
                            start = false;
                        }
                        if (block.charAt(j) == '\n'){
                            start = true;
                        }
                        if (block.charAt(j) == '>' && first){
                            op = j + 1;
                            first = false;
                        }
                        if (block.charAt(j) == '<'){
                            cl = j;
                        }
                    }
                    System.out.print(block);
                    blockStart.remove(blockStart.size() - 1);
                    System.out.println("\nopening tag: " + block.substring(0, op));
                    System.out.println("body: " + block.substring(op, cl));
                    System.out.println("closing tag: " + block.substring(cl, block.length()));
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }
}

