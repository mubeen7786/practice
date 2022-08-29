package Task1;
              //There are different fucntions for the if else and 'Else If'
public class Ifelse {
    public static void main(String[] args) {
    //ifElse();
   // IfElseIf();
        Nestedif();
    }

    public static void ifElse()
    {
        int age=20;
        //checking the age
        if(age>18){
            System.out.print("Age is greater than 18");
        }
    }

    public static void IfElseIf()
    {
        int marks=71;

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }

    }

    public static void Nestedif()
    {
        int age=20;
        int weight=80;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }
        else
        {
            System.out.println("Age must be greater than 18");
        }
    }


}
