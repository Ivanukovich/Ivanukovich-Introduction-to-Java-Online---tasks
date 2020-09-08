public class Test1 {
    int num1 = 0;
    int num2 = 0;
    Test1 (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void output(){
        System.out.println(num1 + "\n" + num2);
    }
    void changeNum1 (int num1){
        this.num1 = num1;
    }
    void changeNum2 (int num2){
        this.num2 = num2;
    }
    int sum(){
        return num1 + num2;
    }
    int max(){
        return Math.max(num1, num2);
    }
}
