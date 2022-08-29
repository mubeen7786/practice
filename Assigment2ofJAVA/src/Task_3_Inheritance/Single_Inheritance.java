package Task_3_Inheritance;

public class Single_Inheritance {   // Single Inheritance Dog class inherits the Single_inheritance class, so there is the single inheritance.
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog extends Single_Inheritance{
    void bark()
    {
        System.out.println("barking...");
    }
}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
