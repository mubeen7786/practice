class constrctr1 {
String myvalue= "Hi this is my first value";
public int mysecondvalue = 78;
public int s= 90;
int m ;
String name;
    constrctr1()
    {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }
    constrctr1(int i)
    {
        System.out.println("this is my perementerized construceter");
 m = mysecondvalue+ s;
    }
    constrctr1(int i, int b)
    {
        System.out.println("this is my perementerized construceter");
        m = mysecondvalue+ s;
        System.out.println("hi luly");
    }
}

public class ConstPractice
{
    public static void main(String[] args) {
        constrctr1 obj = new constrctr1(9 , 8);
       // constrctr1 obj = new constrctr1();
       System.out.println(obj.mysecondvalue);
       //System.out.println(obj.name);
//        System.out.println(obj.name);
       System.out.println(obj.m);
    }


}
