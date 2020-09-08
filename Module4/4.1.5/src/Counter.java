import java.util.Random;

public class Counter {
    int count;
    int min;
    int max;
    Counter (int min, int max, int count){
        this.min = min;
        this.max = max;
        this.count = count;
    }
    Counter (){
        Random random = new Random();
        min = Math.abs(random.nextInt())%100;
        max = min + ( Math.abs(random.nextInt())%100);
        count = min + ( Math.abs(random.nextInt())%(max - min));
    }
    void increase(){
        if (count < max){
            ++count;
        }
        else {
            System.out.println("max");
        }
    }
    void decrease(){
        if (count > min){
            count--;
        }
        else {
            System.out.println("min");
        }
    }
    void output(){
        System.out.println(min + "\n" + max + "\n" + count);
    }
}
