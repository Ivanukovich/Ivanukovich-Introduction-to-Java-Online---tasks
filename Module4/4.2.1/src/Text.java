public class Text {
    Sentance title;
    Sentance[] text;
    Text(){

    }
    Text (Sentance title, Sentance[] text){
        this.title = title;
        this.text = text;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(title + "\n\n");
        for (int i = 0; i < text.length; ++i){
            result.append(text[i].toString() + " ");
        }
        result.append("\n");
        return new String(result);
    }
    void addSentence (Sentance sentance, int spot){
        Sentance[] newText = new Sentance[text.length + 1];
        for (int i = 0; i < text.length; ++i){
            if (i < spot){
                newText[i] = text[i];
            }
            if (i >= spot){
                newText[i + 1] = text[i];
            }
        }
        newText[spot] = sentance;
        text = newText;
    }
    void outPut(){
        System.out.print(this.toString());
    }
    void titleOutPut(){
        System.out.print(title);
    }
}
