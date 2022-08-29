package Task_3_Inheritance;
 //Multi_Level When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below,
 // BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.
public class Multi_Level {
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog1 extends Multi_Level{
    void bark()
    {
        System.out.println("barking...");
    }
}
class BabyDog extends Dog1{
    void weep()
    {System.out.println("weeping...");
    }
}
class TestInheritance2{
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }

    }
