package Task2_JAVA_Encapsolation;

public class Enc_Class2 {
    public static void main(String args[]) {
        Enc_Class1 encap = new Enc_Class1();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " , And Age is : " + encap.getAge());
    }
}

