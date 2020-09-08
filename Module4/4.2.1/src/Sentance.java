public class Sentance {
    Word[] words;
    char finalSymbol;
    Sentance(){
        finalSymbol = '.';
    }
    Sentance (Word []words, char finalSymbol){
        if (finalSymbol == '.' || finalSymbol == '!' || finalSymbol == '?')
        this.words = words;
        this.finalSymbol = finalSymbol;
    }
    Sentance(Sentance sentance){
        this.words = sentance.words;
        this.finalSymbol = sentance.finalSymbol;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; ++i){
            result.append(words[i].toString() + " ");
        }
        result.append(words[words.length - 1].toString() + finalSymbol);
        return new String(result);
    }
}
