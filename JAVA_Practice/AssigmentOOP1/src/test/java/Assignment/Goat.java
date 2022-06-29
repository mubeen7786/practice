package Assignment;

public class Goat extends Animal
{
    private String goatbreed;
    private String goatpatteren;
    private int goatweight;
    private int goatage;

    void setvalues(String Animalcolor, int AnimalPattern, int Animalweight, int AnimalAge, String breed, String patern, int weight, int age)
    {
        setColor(Animalcolor);
        setEyes(AnimalPattern);
        setLegs(Animalweight);
        setTeeths(AnimalAge);
        goatbreed =breed ;
        goatpatteren = patern;
        goatweight = weight;
        goatage = age;

    }
    void display()
    {
        System.out.println("Color: " + getcolor());
        System.out.println("Eyes:  " + geteyes());
        System.out.println("Legs:  " + getlegs());
        System.out.println("Teeths: " + getteeths());
        System.out.println("Bread:  " + goatbreed);
        System.out.println("Pattern:  " + goatpatteren);
        System.out.println("Weight: " + goatweight);
        System.out.println("Age:  " + goatage);


    }
}
