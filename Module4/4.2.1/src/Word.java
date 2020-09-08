public class Word {
    String word;
    Word (String word){
        if (!word.contains(" ")){
            this.word = word;
        }
    }
    @Override
    public String toString(){
        return word;
    }
}
