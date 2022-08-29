package Task1_JAVA_Constructor;

public class ClassWithConstructer {  // Default Constructer (default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.)
    int id;
    String name;

    //method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
//creating objects
        ClassWithConstructer s1 = new ClassWithConstructer();
        ClassWithConstructer s2 = new ClassWithConstructer();
//displaying values of the object
        s1.display();
        s2.display();
    }

}


