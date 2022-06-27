class Animal
{
    private String color;
    private int eyes;
    private int legs;
    private int teeths;
    void setColor(String myvalue)
    {
                color = myvalue;
        }
        void setEyes(int myvalue)
        {
                 eyes = myvalue;
        }
        void setLegs(int myvalue)
        {
                  legs = myvalue;
        }
        void setTeeths(int myvalue)
        {
                teeths = myvalue;
        }
        String getcolor()
        {
                  return color;
        }
        int geteyes()
        {
                return eyes;
        }
        int getlegs()
        {
                 return legs;
        }
        int getteeths()
        {
                return teeths;
        }
    }

class Goat extends Animal
{
    private String goatbreed;
    private String goatpatteren;
    private int goatweight;
    private int goatage;

    void setvalues(String ab, int cd, int a, int b, String breed, String patern, int weight, int age)
    {
        setColor(ab);
        setEyes(cd);
        setLegs(a);
        setTeeths(b);
   goatbreed =breed ;
   goatpatteren = patern;
   goatweight = weight;
   goatage = age;

    }
    void display()
    {
        System.out.println(" Color: " + getcolor());
        System.out.println("Eyes:  " + geteyes());
        System.out.println("Legs:  "+ getlegs());
        System.out.println("Teeths: " + getteeths());
        System.out.println("Bread:  " + goatbreed);
        System.out.println("Pattern:  " + goatpatteren);
        System.out.println("Weight: " + goatweight);
        System.out.println("Age:  " + goatage);
        System.out.println("HI im in display funcntion");
        System.out.println("HI im in display New");
        System.out.println("HI im in display New");

    }
}


public class Assignment {
    public static void main(String[] args) {
Goat myobj = new Goat();
//myobj.setColor("Black");
//        System.out.println(myobj.getcolor());
        myobj.setvalues("Black" , 2, 4, 32 ,"Tanveerkinasal" , "colorfull" , 55, 2 );
        myobj.display();
    }

}
