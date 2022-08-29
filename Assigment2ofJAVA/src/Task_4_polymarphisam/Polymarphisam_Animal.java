package Task_4_polymarphisam;

public class Polymarphisam_Animal {
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog extends Polymarphisam_Animal{
    void eat()
    {
        System.out.println("eating bread...");
    }
}
class Cat extends Polymarphisam_Animal{
    void eat()
    {
        System.out.println("eating rat...");
    }
}
class Lion extends Polymarphisam_Animal{
    void eat()
    {
        System.out.println("eating meat...");
    }
}
class TestPolymorphism3{
    public static void main(String[] args){
        Polymarphisam_Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();
    }
}
