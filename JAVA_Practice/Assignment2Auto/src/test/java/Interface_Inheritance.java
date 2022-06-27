interface Printable{
    void print();                 // IN this we are inherit the two interfaces
}
interface Showable extends Printable{
    void show();
}
class TestInterface4 implements Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

}

    public class Interface_Inheritance {
        public static void main(String[] args) {
            TestInterface4 obj = new TestInterface4();
            obj.print();
            obj.show();
        }
    }


