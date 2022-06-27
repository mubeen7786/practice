
class zubair{

    int a=7;
    int getA(){
        return  a;
    }
}
public class Dog2 {
    // Class Declaration{
        // Instance Variables
    zubair z1=new zubair();

        String breed;
        String size;
        int age=z1.getA();
        String color;

        public void setAge(int a){
            age=a;
        }
        public int getage(){   //getter
            return age;
        }


        // method 1
        public String getInfo() {
            return ("Breedmubeen: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
        }

    public static void main(String[] args) {
        Dog2 obj = new Dog2();
        System.out.println(obj.getInfo());
        int a=obj.age;
        int b=obj.getage();
        obj.setAge(8);
        System.out.println(b);
    }
    }

