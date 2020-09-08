public class Book {
    String name;
    String description;
    boolean physical;
    Book(String name, String description, boolean physical){
        this.name = name;
        this.description = description;
        this.physical = physical;
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder(name + "\n");
        if (physical){
            str.append("p\n" + description);
        }
        else {
            str.append("e\n" + description);
        }
        return str.toString();
    }
    String getName(){
        return name;
    }
    void setDescription(String description){
        this.description = description;
    }
}
