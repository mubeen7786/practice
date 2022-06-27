 class nisam {
    protected void print(){
        System.out.println("This is nisum's ' Employee");
    }
}
class testing extends nisam{
    void test1(){
        System.out.println("i'm tester");
    }
}
class developer extends testing{
    void dev1()
    {
        System.out.println("HI this is developer mode");
    }
}
class officeBoy{

}
public class Inheritance1 {
    public static void main(String[] args) {
//        nisam n1=new nisam();
//        n1.print();
//
//        testing t1=new testing();
//        t1.print();
//        t1.test1();

        developer d1=new developer();
        d1.dev1();
        d1.print();
        d1.test1();


    }
}