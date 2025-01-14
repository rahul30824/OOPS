class Animal{
    void First(){
    System.out.println("1");
}
}
class Dog extends Animal{
    void second()
    {
    System.out.println("2");
    }
}
class Horse extends Dog{
    void third()
    {
    System.out.println("3");
}
}
class Lion extends Horse{
    void fourth(){
    System.out.println("4");
    }
    
}
public class Main{
    public static void main(String[] args)
    {
        Lion lion =new Lion();
        lion.First();
        lion.second();
        lion.third();
        lion.fourth();
    }
}
