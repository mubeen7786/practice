interface Printable1{
    void print();
}
interface Showable1{
    void print();
}
class TestInterface3 implements Printable1, Showable1 {
    public void print() {
        System.out.println("Hello");
    }}



    public class Interfaces_Ambiguity {
        public static void main(String[] args) {
            TestInterface3 obj = new TestInterface3();
            obj.print();
        }
    }

//multiple inheritance is not supported in the case of class because of ambiguity.
// However, it is supported in case of an interface because there is no ambiguity.
// It is because its implementation is provided by the implementation class. For example:
