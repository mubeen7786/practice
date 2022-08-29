package Task2_JAVA_Encapsolation;
// In encapsulation, the variables of a class will be hidden from other classes,
// and can be accessed only through the methods of their current class.
// Therefore, it is also known as data hiding.

public class Enc_Class1 {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge( int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum( String newId) {
        idNum = newId;
    }
}
