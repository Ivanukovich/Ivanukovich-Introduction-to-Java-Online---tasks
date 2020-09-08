public class Agregate {
    Customer[] array;
    Agregate (Customer[] array){
        this.array = array;
    }
    void sort(){
        Customer save;
        for (int i = 0; i < array.length - 1; ++i){
            for (int j = 0; j < array.length - 1; ++j){
                if (compare(array[j], array[j+1])){
                    save = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = save;
                }
            }
        }
    }
    boolean compare (Customer cst1, Customer cst2){
        int i = 0;
        while (cst1.getName().charAt(i) == cst2.getName().charAt(i)&& i < cst1.getName().length() - 1 && i < cst2.getName().length() - 1){
            ++i;
        }
        return cst1.getName().charAt(i) < cst2.getName().charAt(i);
    }
    void output(int start, int finish){
        for (int i = 0; i < array.length - 1; ++i){
            if (array[i].getId() <= finish && array[i].getId() >= start ){
                System.out.println(array[i].toString());
            }
        }
    }
}
