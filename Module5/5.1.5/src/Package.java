class Package {
    public void outPut(){
    }
}
class Green extends Package{
    String name = "Tulip";
    public void outPut(){
        System.out.println("Tulip");
    }
}
class Pink extends Package{
    String name = "Narcissus";
    public void outPut(){
        System.out.println("Narcissus");
    }
}
class White extends Package{
    String name = "Rose";
    public void outPut(){
        System.out.println("Rose");
    }
}
enum PackageType {
    Green,
    Pink,
    White
}