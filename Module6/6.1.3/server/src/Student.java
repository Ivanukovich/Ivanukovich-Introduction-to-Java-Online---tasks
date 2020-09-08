class Student{
    String name;
    String phone;
    String data;
    Student(String name, String phone, String data){
        this.name = name;
        this.phone = phone;
        this.data = data;
    }
    void outPut(){
        System.out.println(name + "\n" + phone + "\n" + data);
    }
    String getName(){
        return name;
    }
    void setPhone(String phone){
        this.phone = phone;
    }
    void setData(String data){
        this.data = data;
    }
    @Override
    public String toString(){
        return name + "\n" + phone + "\n" + data;
    }
}