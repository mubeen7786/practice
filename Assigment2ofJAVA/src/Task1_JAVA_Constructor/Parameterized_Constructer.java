package Task1_JAVA_Constructor;

public class Parameterized_Constructer {
    int id;
    String name;
    //creating a parameterized constructor
    Parameterized_Constructer(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        Parameterized_Constructer s1 = new Parameterized_Constructer(111,"Karan");
        Parameterized_Constructer s2 = new Parameterized_Constructer(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
