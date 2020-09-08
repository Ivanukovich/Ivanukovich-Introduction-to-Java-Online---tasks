public class Student {
    String Name;
    int group;
    int []progress;
    Student (String Name, int group, int[]progress){
        this.Name = Name;
        this.group = group;
        this.progress = progress;
    }
    void output(){
        boolean result = true;
        for (int i = 0; i < 5; ++i){
            if (progress[i] < 9){
                result = false;
            }
        }
        if(result){
            System.out.println(Name + " " + group);
        }
    }
}
